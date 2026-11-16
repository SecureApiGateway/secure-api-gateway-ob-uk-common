#!/usr/bin/env python3
#
# Copyright © 2020-2026 Ping Identity Corporation (obst@forgerock.com)
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

"""Post-generation fixes for the OBIE v4 data model.

Applies the mechanical post-generation steps documented in
secure-api-gateway-ob-uk-common-obie-datamodel/README.md ("Known
post-generation steps", steps 1-6 and 9-10) to the committed source tree,
transforming raw openapi-generator 7.2.0 output into the committed style.

Run after copying a regen output into the source packages, before building:

    python3 post-gen-fixes.py [--dry-run]

Steps applied here (README numbering):
  2. whitespace-only line removal (enum-constant gaps)
  3. getter javadoc layout: blank ' *' before '@return', aligned '*/' closer
  4. annotation layout: one annotation per line
  5. import layout: drop same-package imports, expand wildcards, four-group
     IntelliJ order
  6. OBSupplementaryData1 initialiser removal (compile fix)
  9. BigDecimal equals -> isEqual (scale-safe comparison) + static import
 10. VRP empty SupplementaryData: Object -> OBSupplementaryData1

NOT applied here (deliberate curation decisions, README steps 7, 8, 11, 12):
  7.  OBWritePaymentDetails1 promoted-inline shape (regen output must be
      hand-flattened; the nested output classes must not be copied)
  8.  x-namespaced-enum codesets stay String (no action needed)
  11. shared-type resolution renames (pom inlineSchemaNameMappings)
  12. upstream spec-bug corrections (verify per field)
"""

import argparse
import os
import re
import sys

# ---------------------------------------------------------------------------
# configuration

# Root of the tree to fix: the v4 datamodel packages (relative to this script).
SRC_ROOT = os.path.join(os.path.dirname(os.path.abspath(__file__)),
                        "src", "main", "java", "uk", "org", "openbanking", "datamodel")
V4_ROOT = os.path.join(SRC_ROOT, "v4")
ERROR_ROOT = os.path.join(SRC_ROOT, "error")

# Package dirs to process, relative to their root (step 5 prefixes derive
# from "uk.org.openbanking.datamodel.v4.<pkg>" / "...datamodel.error").
V4_PACKAGE_DIRS = ["account", "common", "event", "fund", "payment", "vrp"]
ERROR_PACKAGE_DIRS = ["error"]

# Classes carrying BigDecimal fields needing the isEqual rewrite (step 9).
# Derived from the committed tree; extend if a new regen introduces more.
IS_EQUAL_IMPORT = ("import static uk.org.openbanking.datamodel.utils."
                   "EqualityVerificationUtil.BigDecimalUtil.isEqual;")

# IntelliJ import group order (step 5): each group a list of regex prefixes.
IMPORT_GROUPS = [
    re.compile(r"^(java|javax)\."),
    re.compile(r"^(org\.joda|org\.springframework)\."),
    re.compile(r"^com\.fasterxml\."),
    re.compile(r"^(io\.swagger|jakarta\.|uk\.org\.openbanking)"),
]

# ---------------------------------------------------------------------------


def read(path):
    with open(path, encoding="utf-8") as f:
        return f.read()


def write(path, text):
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def fix_whitespace_only_lines(text):
    """Step 2: remove lines containing only spaces; strip trailing whitespace
    from every line (the generator leaves trailing spaces on annotation and
    blank lines; the committed tree has none)."""
    return "\n".join(l.rstrip() for l in text.split("\n"))


def fix_generic_annotation_space(text):
    """Step 4b: the template emits 'List<@Size(...)String>' without a space
    between the annotation and the type; the committed style has one."""
    return re.sub(r"(@\w+\([^)]*\))([A-Za-z])", r"\1 \2", text)


def fix_javadoc(text):
    """Step 3: blank ' *' line before ' * @return'; align '*/' closer.

    Raw output:
        /**
         * Get x
         * @return x
        */
    Committed style (closer aligned one space inside the opener's indent):
        /**
         * Get x
         *
         * @return x
         */
    The closer's indent is derived from the javadoc opener's indent, so
    package-level javadoc (opener at column 0) keeps its own alignment.
    """
    def insert_blank(m):
        indent = m.group(1)
        return m.group(0).replace("\n" + indent + "* @return ",
                                  "\n" + indent + "*\n" + indent + "* @return ", 1)
    text = re.sub(r"^[ ]*\* .+\n([ ]*)\* @return ", insert_blank, text, flags=re.M)
    # re-align block-comment closers to one space inside their opener's indent
    out = []
    opener_indent = None
    for line in text.split("\n"):
        if "/*" in line and not line.lstrip().startswith("*"):
            opener_indent = re.match(r"^[ ]*", line).group(0)
            out.append(line)
        elif re.match(r"^[ ]*\*/[ ]*$", line) and opener_indent is not None:
            out.append(opener_indent + " */")
            opener_indent = None
        else:
            out.append(line)
    return "\n".join(out)


def split_annotations(stripped):
    """Split ' @A @B(x(y)) @C' into ['@A', '@B(x(y))', '@C'] — paren-aware,
    quotes respected so regex patterns containing ')' survive intact."""
    anns, depth, start, in_str = [], 0, 0, False
    for i, ch in enumerate(stripped):
        if ch == '"' and (i == 0 or stripped[i-1] != "\\"):
            in_str = not in_str
        elif not in_str:
            if ch == "(":
                depth += 1
            elif ch == ")":
                depth -= 1
            elif ch == " " and depth == 0 and i > start:
                anns.append(stripped[start:i])
                start = i + 1
    anns.append(stripped[start:])
    return [a for a in anns if a]


def fix_annotations(text):
    """Step 4: split joined annotations onto separate lines."""
    out = []
    for line in text.split("\n"):
        stripped = line.strip()
        if stripped.startswith("@") and " @" in stripped:
            indent = re.match(r"^\s*", line).group(0)
            anns = split_annotations(stripped)
            if len(anns) > 1:
                out.extend(indent + a for a in anns)
                continue
        out.append(line)
    return "\n".join(out)


def fix_imports(text, package_fqn):
    """Step 5: drop same-package imports, expand wildcards, group and sort."""
    lines = text.split("\n")
    imp_idx = [i for i, l in enumerate(lines) if l.startswith("import ")]
    if not imp_idx:
        return text
    start, end = imp_idx[0], imp_idx[-1]
    prefix = package_fqn

    imports = []
    for l in lines[start:end + 1]:
        m = re.match(r"import (static )?([\w.]+)(\.\*)?;", l)
        if not m:
            continue
        static, fqcn, wild = m.group(1) or "", m.group(2), bool(m.group(3))
        if fqcn == prefix or fqcn.startswith(prefix + "."):
            continue  # same-package import is redundant (dominant committed style)
        if wild:
            imports.extend(expand_wildcard(fqcn, text))
            continue
        if not static:
            short = fqcn.rsplit(".", 1)[-1]
            code = code_lines(text)
            if not re.search(rf"\b{re.escape(short)}\b", code):
                continue  # unused import: drop (matches the IntelliJ baseline)
        imports.append(("static " if static else "", fqcn))

    def group_key(item):
        static, fqcn = item
        if static:
            return -1  # static imports form the first group
        for i, rx in enumerate(IMPORT_GROUPS):
            if rx.search(fqcn):
                return i
        return len(IMPORT_GROUPS)

    blocks = {}
    for item in sorted(set(imports), key=lambda it: it[1]):
        blocks.setdefault(group_key(item), []).append(item)

    out = []
    for gi in sorted(blocks):
        for static, fqcn in blocks[gi]:
            out.append(f"import {static}{fqcn};")
        out.append("")  # blank line between groups
    # collapse to a single trailing blank line
    replacement = "\n".join(out).rstrip("\n")
    new_lines = lines[:start] + replacement.split("\n") + lines[end + 1:]
    return "\n".join(new_lines)


def code_lines(text):
    """Lines of actual code: drop block comments, javadoc, line comments, and
    import lines — the regions where an identifier reference doesn't count."""
    out, in_comment = [], False
    for line in text.split("\n"):
        stripped = line.strip()
        if in_comment:
            if "*/" in stripped:
                in_comment = False
            continue
        if stripped.startswith("/*"):
            in_comment = "*/" not in stripped
            continue
        if stripped.startswith("//") or stripped.startswith("*") or stripped.startswith("import "):
            continue
        # strip string literals: identifiers inside them (e.g. 'Optional' in a
        # @Schema description) are not code references
        out.append(re.sub(r'"(?:[^"\\]|\\.)*"', '""', line))
    return "\n".join(out)


def expand_wildcard(fqcn, text):
    """Expand an import wildcard to the classes actually used in this file's
    code (unused imports are dropped, matching the IntelliJ baseline)."""
    code = code_lines(text)
    if fqcn == "java.util":
        used = set(re.findall(r"\b(Array[sz]|Collections|List|ArrayList|"
                              r"Map|HashMap|Objects|Set|HashSet|Optional)\b", code))
        return [("", f"java.util.{u}") for u in sorted(used)]
    if fqcn == "jakarta.validation.constraints":
        used = set(re.findall(r"@(\w+)\b", code))
        known = {"NotNull", "Size", "Pattern", "Email", "Min", "Max", "DecimalMin",
                 "DecimalMax", "Digits", "AssertFalse", "AssertTrue", "Past", "Future"}
        return [("", f"jakarta.validation.constraints.{u}")
                for u in sorted(used & known)]
    return []


def fix_supplementary_init(text):
    """Step 6: OBSupplementaryData1 HashMap initialiser removal."""
    return text.replace(
        "private OBSupplementaryData1 supplementaryData = new HashMap<>();",
        "private OBSupplementaryData1 supplementaryData;")


def fix_vrp_supplementary(text):
    """Step 10: VRP empty SupplementaryData -> OBSupplementaryData1."""
    if "datamodel.v4.vrp" not in text and "package uk.org.openbanking.datamodel.v4.vrp" not in text:
        return text
    changed = text
    if "private Object supplementaryData;" in changed:
        changed = changed.replace(
            "private Object supplementaryData;",
            "private OBSupplementaryData1 supplementaryData;")
        changed = changed.replace(
            "public OBDomesticVRPControlParameters supplementaryData(Object supplementaryData)",
            "public OBDomesticVRPControlParameters supplementaryData(OBSupplementaryData1 supplementaryData)")
        changed = changed.replace(
            "public OBDomesticVRPInstruction supplementaryData(Object supplementaryData)",
            "public OBDomesticVRPInstruction supplementaryData(OBSupplementaryData1 supplementaryData)")
        changed = changed.replace(
            "public void setSupplementaryData(Object supplementaryData)",
            "public void setSupplementaryData(OBSupplementaryData1 supplementaryData)")
        changed = changed.replace(
            "public Object getSupplementaryData()",
            "public OBSupplementaryData1 getSupplementaryData()")
        if "import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1" not in changed:
            lines = changed.split("\n")
            first_imp = min(i for i, l in enumerate(lines) if l.startswith("import "))
            lines.insert(first_imp, "import uk.org.openbanking.datamodel.v3.common.OBSupplementaryData1;")
            changed = "\n".join(lines)
    return changed


def fix_big_decimal_equals(text):
    """Step 9: BigDecimal comparisons -> isEqual (scale-safe)."""
    if "private BigDecimal" not in text or "isEqual" in text:
        return text
    fields = set(re.findall(r"private (?:final )?BigDecimal (\w+);", text))
    if not fields:
        return text

    def field_sub(m):
        indent, field, obj, prop = m.groups()
        if prop == field and field in fields:
            return f"{indent}isEqual(this.{field}, {obj}.{field})"
        return m.group(0)

    changed = re.sub(r"^(\s*)Objects\.equals\(this\.(\w+), (\w+)\.(\w+)\)",
                     field_sub, text, flags=re.M)
    if changed != text:
        # add the static import as the first import (committed style: statics first)
        lines = changed.split("\n")
        first_imp = min(i for i, l in enumerate(lines) if l.startswith("import "))
        lines.insert(first_imp, IS_EQUAL_IMPORT)
        changed = "\n".join(lines)
    return changed


# ---------------------------------------------------------------------------

def main():
    ap = argparse.ArgumentParser(description=__doc__)
    ap.add_argument("--dry-run", action="store_true",
                    help="report what would change without writing")
    args = ap.parse_args()

    if not os.path.isdir(SRC_ROOT):
        sys.exit(f"source root not found: {SRC_ROOT}")

    step_counts = {}
    targets = ([(V4_ROOT, pkg, f"uk.org.openbanking.datamodel.v4.{pkg}")
                for pkg in sorted(V4_PACKAGE_DIRS)]
               + [(ERROR_ROOT, "error", "uk.org.openbanking.datamodel.error")])
    for root, pkg, fqn_prefix in targets:
        pkg_dir = os.path.join(root, pkg)
        if not os.path.isdir(pkg_dir):
            continue
        for name in sorted(os.listdir(pkg_dir)):
            if not name.endswith(".java"):
                continue
            path = os.path.join(pkg_dir, name)
            original = read(path)
            text = original
            steps = [
                ("whitespace", fix_whitespace_only_lines),
                ("javadoc", fix_javadoc),
                ("annotations", fix_annotations),
                ("generic-annotation-space", fix_generic_annotation_space),
                ("supplementary-init", fix_supplementary_init),
                ("vrp-supplementary", fix_vrp_supplementary),
                ("bigdecimal-isEqual", fix_big_decimal_equals),
                ("imports", lambda t: fix_imports(t, fqn_prefix)),
            ]
            for name, step in steps:
                new = step(text)
                if new != text:
                    step_counts[name] = step_counts.get(name, 0) + 1
                text = new
            if text != original:
                if args.dry_run:
                    print(f"would fix {os.path.relpath(path, SRC_ROOT)}")
                else:
                    write(path, text)
                    print(f"fixed {os.path.relpath(path, SRC_ROOT)}")

    if args.dry_run:
        print("(dry run — no files written)")
    print("steps applied:", {k: v for k, v in sorted(step_counts.items())} or "{}")


if __name__ == "__main__":
    main()
