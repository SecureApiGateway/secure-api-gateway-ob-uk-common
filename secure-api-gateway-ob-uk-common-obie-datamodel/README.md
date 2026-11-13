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
Steps 1–3 are mechanical and scripted-able; steps 4–7 are deliberate curation decisions
carried forward from the original v4 generation (provenance: branch `ob-v4`, Jul–Nov 2024).

1. **License headers** — added automatically by the build (`license:format` at process-sources).
2. **Whitespace-only lines** — the 7.2.0 enum templates emit space-only lines between enum
   constants; strip lines that contain only spaces.
3. **`OBSupplementaryData1` initialiser** — replace
   `private OBSupplementaryData1 supplementaryData = new HashMap<>();`
   with `private OBSupplementaryData1 supplementaryData;` (raw output does not compile).
4. **`OBWritePaymentDetails1` (and `OBWritePaymentDetailsResponse1` family)** — the generator
   nests the inline `PaymentStatus` object (`OBWritePaymentDetails1PaymentStatus paymentStatus`);
   the committed tree promotes its properties onto the parent (`paymentTransactionId`, `status`,
   `statusUpdateDateTime`, `statusDetail`) and extracts inline enums to top-level classes.
   Keep the promoted shape; the nested class output is an orphan and must not be copied.
5. **x-namespaced-enum codesets** — some codesets (e.g. `OBInternalAccountIdentification4Code`)
   are `x-namespaced-enum` in the newer spec revisions, which the generator ignores and
   resolves as plain `String`. This matches the committed tree — do not "fix" these to enums.
6. **Shared-type resolution** — the generator resolves shared `$ref`s to common classes (e.g.
   `OBWriteDomesticResponse5DataMultiAuthorisation`) where the committed tree has per-site
   duplicates, and may emit new classes (`OBBranchAndFinancialInstitutionIdentification60`).
   Either accept the new names (one-time rename, update FR converters accordingly) or pin the
   old names via `inlineSchemaNameMappings` in the pom.
7. **Upstream spec bug corrections** — where OB's spec is wrong, the committed code may
   deliberately diverge (e.g. `OBTransactionCashBalance.type` uses `OBBalanceType1Code` where
   the spec erroneously refs `OBInternalAccountIdentification4Code`). Check the diff for
   such fields before assuming the regen is correct.

After applying: `mvn clean install` must pass, and a repeat regen must produce an empty diff.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

Released under an Apache 2.0 license
