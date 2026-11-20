[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

**_This repository is part of the Secure API Gateway. If you just found this repository looking for our
toolkit, we recommend having a first read to_ https://github.com/SecureApiGateway**

## secure-api-gateway-ob-uk-common-obie-datamodel

A Java SDK to help implementing the Open Banking standard: https://www.openbanking.org.uk/read-write-apis/.

## Usage

In your pom file you should use the `secure-api-gateway-ob-uk-common-bom` import (see the README.md for that project) to pull in the correct secure-api-gateway-ob-uk-common versions. Then declare your pom dependency;

```
<dependency>
    <groupId>com.forgerock.sapi.gateway</groupId>
    <artifactId>secure-api-gateway-ob-uk-common-obie-datamodel</artifactId>
</dependency>

```

### How to Build

This is a Java Maven project, compiled using JDK 17.

#### Prerequisites

You need the following on your development machine;
Java 17
Maven 3.6.0 or later

#### Building

```
git checkout git@github.com:SecureApiGateway/secure-api-gateway-ob-uk-common.git
cd secure-api-gateway-ob-uk-common/secure-api-gateway-ob-uk-common-obie-datamodel
mvn clean install
```

## Class generation
Many of the classes are generated from the OB Swagger documentation. The project is setup to make it easy to generate
the  OB model classes and skeleton API classes using Maven. For efficiency, the default maven profile does not generate
the code, but it is easy to do so using `code-gen` profile (see below).

The configuration for the swagger generation is currently within `secure-api-gateway-ob-uk-common-obie-datamodel/pom.xml`
and the swagger specification is within `secure-api-gateway-ob-uk-common-obie-datamodel/src/main/resources/specification`.

When a new version of OB API is released, the following steps should be performed:
1. Download the Swagger yaml files from OB Spec pages (https://github.com/OpenBankingUK/read-write-api-specs/releases).
   As of v3.1.8, there are swagger files for Accounts, Payments, Funds Confirmation, Events and Variable Recurring Payments.
2. Place the swagger files under `secure-api-gateway-ob-uk-common-obie-datamodel/src/main/resources/specification` (replacing existing ones where applicable).
3. Override the configuration on `secure-api-gateway-ob-uk-common-obie-datamodel/pom.xml` to generate the proper source code.
4. Run ```mvn clean install -Pcode-gen```
   > This will generate classes into `secure-api-gateway-ob-uk-common-obie-datamodel/target/generated-sources/swagger`
5. Copy the output from target/generated-sources into the appropriate source package, overwriting all existing files
6. Run IntelliJ "Reformat Code" and "Optimize Imports" for the package (you may need to run the latter multiple times to get a clean diff)
7. Run an initial build of the code to ensure that the copyright header is added `mvn install -PskipTests`
8. Check the generated files:
    1. Fix OBSupplementaryData1 field generation, the code gen currently attempts to initialize this field as a HashMap which causes a compilation issue
        - Find and Replace: "private OBSupplementaryData1 supplementaryData = new HashMap<>();" with "private OBSupplementaryData1 supplementaryData;"
    2. You will need to edit .equals methods of data model objects containing big decimals, see PR https://github.com/SecureApiGateway/secure-api-gateway-ob-uk-common/pull/101
    3. Update `equals` generated method for these Classes that use BigDecimals fields:
        1. To fix the equality verification for BigDecimals it's necessary update the generated `equals` method.
        2. Replace all BigDecimals following the below instructions:
           **Example generated OB object OBFile1.java**
       ```java
       @ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.")
       @Validated
       @jakarta.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")
       public class OBFile1 {
           /* The Generated object OBFile1.java define a BigDecimal field like below */
           @JsonProperty("ControlSum")
           private BigDecimal controlSum = null;
    
        /* search the generated equals method */
        @Override
        public boolean equals(Object o) {
           if (this == o) {
               return true;
           }
           if (o == null || getClass() != o.getClass()) {
               return false;
           }
           OBFile1 obFile1 = (OBFile1) o;
           return Objects.equals(this.fileType, obFile1.fileType) &&
                   Objects.equals(this.fileHash, obFile1.fileHash) &&
                   Objects.equals(this.fileReference, obFile1.fileReference) &&
                   Objects.equals(this.numberOfTransactions, obFile1.numberOfTransactions) &&
                   Objects.equals(this.controlSum, obFile1.controlSum) &&
                   Objects.equals(this.requestedExecutionDateTime, obFile1.requestedExecutionDateTime) &&
                   Objects.equals(this.localInstrument, obFile1.localInstrument) &&
                   Objects.equals(this.debtorAccount, obFile1.debtorAccount) &&
                   Objects.equals(this.remittanceInformation, obFile1.remittanceInformation);
        }
       }
       ```
        3. Add to the imports in the top class file the below import:
           `import static uk.org.openbanking.datamodel.utils.EqualityVerificationUtil.BigDecimalUtil.isEqual;`
        4. Replace the line Objects.equals(this.controlSum, obFile1.controlSum) && with:
           `isEqual(this.controlSum, obFile1.controlSum) &&`
       > This is a example, the BigDecimal field name will be different for each OB object class generated
        5. Follow the same process for all generated OB Objects that define BigDecimals fields.
7. Review the diff and get rid of any noise, you may need to run Optimise Imports again for the package
8. Run `mvn clean install` and verify that the code builds
9. Uncomment the relevant `<inputSpec>` listing within the `openapi-generator-maven-plugin` in the pom for the next
   swagger spec (and repeat for each new swagger YAML file).
10. Commit and raise PR.

### Which spec revision to regenerate from

OB publishes rolling updates to a released spec version as `v4.0 Update N` branches
(imported here as `specification/4.0.0/*-4rN.yaml`). The suffixed files are byte-identical
copies of OB's published merges; the unsuffixed (canonical) files are the original release cut.
**Always regenerate from the highest-numbered revision present** (e.g. `-4r4` for 4.0.0) — the
committed classes track the latest revision, and regenerating from an older cut introduces
spurious field differences (e.g. `NumberOfPayments` was absent in the base 4.0.0 dist,
restored in 4r2+, and the classes follow the later cut).

For 4.0.0, revision 4 (`-4r4`) is the final OB published cut of that version; later OB work
became the 4.0.1 programme.

### Regeneration command line

The `code-gen` profile reads the spec and target package from Maven properties, so a regen
pass does not require pom edits:

```
mvn clean generate-sources -Pcode-gen \
  -Dregen.inputSpec=$PWD/src/main/resources/specification/4.0.0/payment-initiation-openapi-4r4.yaml \
  -Dregen.modelPackage=uk.org.openbanking.datamodel.v4.payment
```

Run one pass per spec, copying `target/generated-sources/swagger/src/main/java/uk/org/openbanking/datamodel/v4/<pkg>`
into the matching source package. The templates in `src/main/resources/openapi-templates/`
(4-space indentation, pinned to the openapi-generator version) are used automatically via
`<templateDirectory>`.

### Known post-generation steps (baseline vs regen diff)

The committed classes intentionally differ from raw generator output. After a regen, the
following must be applied (or verified) before the tree matches the committed baseline.
Most steps are mechanical and scripted (see `post-gen-fixes.py`); the curation decisions
(step 7 and the items in the "Pinning vs accepting" table below) are deliberate and carried
forward from the original v4 generation (provenance: branch `ob-v4`, Jul–Nov 2024).

1. **License headers** — added automatically by the build (`license:format` at process-sources).
2. **Whitespace-only lines** — the 7.2.0 enum templates emit space-only lines between enum
   constants; strip lines that contain only spaces.
3. **Getter javadoc layout** — the generator emits `* @return` immediately after the
   description and a misaligned `*/` closer. The committed style is a blank ` *` line before
   `* @return` and the closer aligned with the opener (`     */`). No stock openapi-generator
   template produces this — it is a project-wide convention (v3 and v4).
4. **Annotation layout** — the generator joins field annotations onto one line
   (`@NotNull @Valid @Size(min = 1)`); the committed style is one annotation per line.
5. **Import layout** — the generator emits redundant same-package imports, wildcard imports
   (`jakarta.validation.constraints.*`, `java.util.*`), and a single ungrouped block. The
   committed style (IntelliJ Optimize Imports): no same-package imports, explicit per-class
   imports (no wildcards), four blank-line-separated groups — `java.*`, then third-party
   (joda/spring, jackson), then swagger/jakarta — alphabetical within each group.
6. **`OBSupplementaryData1` initialiser** — replace
   `private OBSupplementaryData1 supplementaryData = new HashMap<>();`
   with `private OBSupplementaryData1 supplementaryData;` (raw output does not compile).
7. **`OBWritePaymentDetails1` (and `OBWritePaymentDetailsResponse1` family)** — the generator
   nests the inline `PaymentStatus` object (`OBWritePaymentDetails1PaymentStatus paymentStatus`);
   the committed tree promotes its properties onto the parent (`paymentTransactionId`, `status`,
   `statusUpdateDateTime`, `statusDetail`) and extracts inline enums to top-level classes.
   Keep the promoted shape; the nested class output is an orphan and must not be copied.
8. **x-namespaced-enum codesets** — some codesets (e.g. `OBInternalAccountIdentification4Code`)
   are `x-namespaced-enum` in the newer spec revisions, which the generator ignores and
   resolves as plain `String`. This matches the committed tree — do not "fix" these to enums.
9. **BigDecimal `equals` (`isEqual`)** — the generator emits `Objects.equals` for BigDecimal
   fields, which compares scale. The committed tree rewrites those comparisons to
   `EqualityVerificationUtil.BigDecimalUtil.isEqual` and adds the static import (see the
   step 8.2/8.3 instructions above for the manual recipe; currently six v4 classes:
   `OBCurrencyExchange5`, `OBStatement2StatementFeeInner`, `OBStatement2StatementInterestInner`,
   `OBWriteFile2DataInitiation`, `OBWriteInternational3DataInitiationExchangeRateInformation`,
   `OBWriteInternationalConsentResponse6DataExchangeRateInformation`).
10. **VRP empty `SupplementaryData`** — the VRP specs define `SupplementaryData` as an empty
    inline object, which the generator types as `Object`. The committed tree types it as
    `OBSupplementaryData1` (wire-identical; both serialise as `{}`). Apply in
    `OBDomesticVRPControlParameters` and `OBDomesticVRPInstruction`.
11. **`OBFrequency6` oneOf (`implements`)** — from 4r4 onward, `OBFrequency6.Type` is a
    `oneOf` of `OBFrequency6Code` and `Frequency_1`. The generator emits the
    `OBFrequency6Type` interface but does **not** make the `OBFrequency6Code` enum implement
    it (verified with stock 7.2.0 templates — this is not template-related). The FR
    converters and `FRModelMapper` need the enum to be an `OBFrequency6Type`, so add
    `implements OBFrequency6Type` to the generated `OBFrequency6Code` enum in the `account`
    and `payment` packages, and keep the
    `FRFrequencyCode6 -> OBFrequency6Type` type-map converters in `FRModelMapper`.

    **Reading the OB-side value in converters: use `toString()`, not `getValue()`.**
    `OBFrequency6.getType()` returns the `OBFrequency6Type` interface, which is empty —
    `getValue()` does not compile on it. `OBFrequency6Code.toString()` returns exactly the
    same string as `getValue()` (both yield the enum's `value`), so `toString()` is safe for
    every value in use today and remains correct if a `Frequency_1`-style value ever arrives
    (it degrades to that string, which `FRFrequencyType.fromFrequencyString` will then
    reject loudly, as it already does for malformed input). This matches the approach taken
    in the 4.0.1 branch (PR #286). Note the asymmetry is expected: in the FR→OB direction,
    the source is our `FRFrequencyCode6` enum, which has a real `getValue()` — use it there.
12. **Upstream spec bug corrections** — where OB's spec is wrong, the committed code may
   deliberately diverge (e.g. `OBTransactionCashBalance.type` uses `OBBalanceType1Code` where
   the spec erroneously refs `OBInternalAccountIdentification4Code` — OB fixed this
   themselves in 4r4). Check the diff for such fields before assuming the regen is correct.

After applying: `mvn clean install` must pass, and a repeat regen must produce an empty diff.

### Pinning vs accepting: how we decide what a regen may rename

When OB changes how a schema is written (inlines it, moves it, or restructures it), the
generator produces a different Java class name than the one in our tree, even though the
JSON on the wire is unchanged. For each such difference there are two ways to reconcile the
regen with the committed tree:

**Pinning** means telling the generator, in the pom's `inlineSchemaNameMappings`, to keep
using our existing class name for that schema. The regen then produces the old name and
nothing outside the data model changes.

- Pros: zero changes for downstream code (FR converters, RS); the Java API of the data model
  stays stable while the team is still building familiarity with it; trivially reversible
  (delete the mapping line and regen).
- Cons: the mapping is permanent pom configuration encoding our history rather than OB's
  structure; if a future OB update makes the mapped schemas *diverge* (e.g. a property added
  to one of two previously-identical blocks), the pin silently merges them and masks the
  difference — the regen-diff review is the only safety net; each mapping is one more thing
  to carry across every future spec version.

**Accepting** means adopting the generator's new name and updating the FR converters (and
any call sites) in the same PR.

- Pros: the model mirrors the current OB spec structure, so future regens need no mapping
  upkeep and there is no silent-merge trap.
- Cons: a one-time rename ripple through the FR converter layer (and rarely RS), which is
  review overhead in an area of the codebase we have not touched much.

**How we choose, in practice:** pin when the two classes are *semantically identical* and
the rename is pure naming churn (the old name is arbitrary, the new name is arbitrary — keep
the one downstream code already knows). Accept when the change is *structural* (the spec
changed the type, not just the name) or when the new shape is a genuine improvement, such as
deduplicating several identical copies of a block into one shared class. Never pin across
schemas that are merely *currently* identical — if they later diverge, a pin hides it.

Register pins in **`inlineSchemaNameMappings` only**. Adding the same mapping to
`schemaMappings` as well changes how the generator resolves the parent inline schemas and
deletes unrelated classes (verified: a three-pin double-registration removed ~100 classes).

### The 4r4 regeneration decisions (recorded 2026-11, OPENIG-9982)

| Difference vs committed tree | Decision | Why |
|---|---|---|
| `OBFrequency6.type`: enum → `oneOf` interface (`OBFrequency6Type`) | **Accept** (no choice — the spec changed the type) | 4r4 made the field a oneOf of `OBFrequency6Code` and the ISO `Frequency_1` codeset. A oneOf cannot be a single enum in Java. FR contract unchanged: the FR model's `frequency` is a plain `String`, so `FrequencyService` in RS and `FRFrequencyType` are unaffected. Requires the step-11 fixes above (also present in the 4.0.1 branch). |
| `AuthorisationType` inline enum renamed by the generator | **Pin** (`OBWriteDomesticStandingOrderConsentResponse6_Data_Authorisation_AuthorisationType` → committed name) | Pure naming churn: the generator names the inline enum after whichever host schema it processes first. Not referenced outside ob-uk-common. |
| `Creditor` inline class renamed | **Pin** (`OBWriteInternationalConsent5_Data_Initiation_Creditor` → committed name) | Same reasoning. RS/RCS untouched. |
| `MultiAuthorisation` per-response classes deduplicated to two shared classes | **Accept** | The 4r4 spec inlines the identical block 7 times (verified: structurally identical, only one description string differs). The dedup to shared classes is a genuine improvement; nothing referenced the old per-site names, so no converter changes were needed. |
| File-payment response `Initiation` gets its own class (`OBWriteFileResponse3DataInitiation`) | **Accept** | 4.0.1 keeps this structure (verified in the 4.0.1 spec), and the 4.0.1 branch already accepted it — pinning here would create a review surprise in the 4.0.1 PR. The request-side class remains in use for requests; the response-side copy is currently unused by converters. A pin would silently merge the two if OB ever diverges them. |
| 25 classes no longer generated (old per-site duplicates, orphan nested classes) | **Accept** (retained in tree where still referenced) | Shared-type resolution and the `OBWritePaymentDetails1` promote. Stale imports they carried are dropped by the regen. |
| Constraint changes, e.g. `Creditor.Name` in the international initiation: `@Size(max = 140)` → `max = 350` | **Accept** (spec-driven) | OB raised the limit themselves in commit [`e9bba3ff`](https://github.com/OpenBankingUK/read-write-api-specs/commit/e9bba3ff) (Aug 2024, "Fixed Creditor Name length in Int", carried into 4r2+ and 4.0.1); master's class was generated from the pre-fix revision. A widened `maxLength` is a relaxation — bean validation only, no serialisation change, no downstream work. **Template for the next person:** when a changed `@Size`/`@Pattern` looks odd, check the upstream spec history (`gh api repos/OpenBankingUK/read-write-api-specs/commits`) before assuming it's a generator artefact or a hand-edit. |

The net effect of these decisions: a fresh 4r4 regen + `post-gen-fixes.py` reproduces the
committed tree except for the small, intentional set of changes listed in the table.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

Released under an Apache 2.0 license
