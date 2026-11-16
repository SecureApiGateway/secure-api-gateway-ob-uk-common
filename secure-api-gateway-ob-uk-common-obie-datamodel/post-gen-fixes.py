#!/usr/bin/env python3
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

# Same-package import prefix per package dir (step 5).
PACKAGE_DIRS = ["account", "common", "error", "event", "fund", "payment", "vrp"]

# Classes carrying BigDecimal fields needing the isEqual rewrite (step 9).
# Derived from the committed tree; extend if a new regen introduces more.
IS_EQUAL_IMPORT = ("import static uk.org.openbanking.datamodel.utils."
                   "EqualityVerificationUtil.BigDecimalUtil.isEqual;")

# IntelliJ import group order (step 5): each group a list of regex prefixes.
IMPORT_GROUPS = [
    re.compile(r"^(java|javax)\."),
    re.compile(r"^(org\.joda|org\.springframework|jakarta\.annotation)\."),
    re.compile(r"^com\.fasterxml\."),
    re.compile(r"^(io\.swagger|jakarta\.validation|uk\.org\.openbanking)"),
]

# ---------------------------------------------------------------------------


def read(path):
    with open(path, encoding="utf-8") as f:
        return f.read()


def write(path, text):
    with open(path, "w", encoding="utf-8") as f:
        f.write(text)


def fix_whitespace_only_lines(text):
    """Step 2: remove lines containing only spaces (keep truly empty lines)."""
    return "\n".join("" if (l.strip() == "" and l != "") else l
                     for l in text.split("\n"))


def fix_javadoc(text):
    """Step 3: blank ' *' line before ' * @return'; align '*/' closer.

    Raw output:
        * Get x
        * @return x
       */
    Committed style:
        * Get x
        *
        * @return x
         */
    """
    text = re.sub(r"( \* [^\n*]*\n)( \* @return )", r"\1 *\n\2", text)
    # align closers that are indented shallower than 4 spaces before '*/'
    text = re.sub(r"(?m)^( {1,4})\*/$", r"\1 */", text)
    # normalise: closer should sit at exactly five spaces (4 indent + 1)
    text = re.sub(r"(?m)^([ ]+) \*/$", lambda m: " " * 4 + " */"
                  if len(m.group(1)) != 4 else m.group(0), text)
    return text


def fix_annotations(text):
    """Step 4: split joined annotations onto separate lines."""
    out = []
    for line in text.split("\n"):
        stripped = line.strip()
        if stripped.startswith("@") and " @" in stripped and "(" not in stripped.split(" @", 1)[0]:
            indent = re.match(r"^\s*", line).group(0)
            anns = re.findall(r"@\w+(?:\([^)]*\))?", stripped)
            out.extend(indent + a for a in anns)
        else:
            out.append(line)
    return "\n".join(out)


def fix_imports(text, package):
    """Step 5: drop same-package imports, expand wildcards, group and sort."""
    lines = text.split("\n")
    imp_idx = [i for i, l in enumerate(lines) if l.startswith("import ")]
    if not imp_idx:
        return text
    start, end = imp_idx[0], imp_idx[-1]
    prefix = "uk.org.openbanking.datamodel." + package

    imports = []
    for l in lines[start:end + 1]:
        m = re.match(r"import (static )?([\w.]+)(\.\*)?;", l)
        if not m:
            continue
        static, fqcn, wild = m.group(1) or "", m.group(2), bool(m.group(3))
        if fqcn == prefix or fqcn.startswith(prefix + "."):
            continue  # same-package import is redundant
        if wild:
            imports.extend(expand_wildcard(fqcn, text))
        else:
            imports.append((static, fqcn))

    def group_key(item):
        static, fqcn = item
        for i, rx in enumerate(IMPORT_GROUPS):
            if rx.search(fqcn):
                return i
        return len(IMPORT_GROUPS)

    blocks = {}
    for item in sorted(set(imports)):
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


def expand_wildcard(fqcn, text):
    """Expand an import wildcard to the classes actually used in this file."""
    if fqcn == "java.util":
        used = set(re.findall(r"\b(Array[sz]|Collections|List|ArrayList|"
                              r"Map|HashMap|Objects|Set|HashSet|Optional)\b", text))
        return [(False, f"java.util.{u}") for u in sorted(used)]
    if fqcn == "jakarta.validation.constraints":
        used = set(re.findall(r"@(\w+)\b", text))
        known = {"NotNull", "Size", "Pattern", "Email", "Min", "Max", "DecimalMin",
                 "DecimalMax", "Digits", "AssertFalse", "AssertTrue", "Past", "Future"}
        return [(False, f"jakarta.validation.constraints.{u}")
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
        # add the static import after the last existing import
        lines = changed.split("\n")
        last_imp = max(i for i, l in enumerate(lines) if l.startswith("import "))
        lines.insert(last_imp + 1, IS_EQUAL_IMPORT)
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
    for pkg in sorted(PACKAGE_DIRS):
        pkg_dir = os.path.join(SRC_ROOT, pkg)
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
                ("imports", lambda t: fix_imports(t, pkg)),
                ("supplementary-init", fix_supplementary_init),
                ("vrp-supplementary", fix_vrp_supplementary),
                ("bigdecimal-isEqual", fix_big_decimal_equals),
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
