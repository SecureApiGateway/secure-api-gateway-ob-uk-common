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

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License

Released under an Apache 2.0 license
