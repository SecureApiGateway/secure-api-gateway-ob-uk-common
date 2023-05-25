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

This is a Java Maven project, compiled using JDK 14. 

#### Prerequisites

You need the following on your development machine;
Java 14 or later
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
 5. Check the generated files:
    1. > We use shared generic versions of these classes to avoid duplications and make more easy the maintenance, 
    check `secure-api-gateway-ob-uk-common-obie-datamodel/src/main/java/uk/org/openbaning/datamodel/common` and
       `secure-api-gateway-ob-uk-common-obie-datamodel/src/main/java/uk/org/openbaning/datamodel/error`
    to identify those classes generated that can be deleted to use a shared class and refactor the generated classes to use the shared ones.
    2. > Review the generated classes to identify those classes that could be moved as a shared class.
    6. You will need to edit .equals methods of data model objects containing big decimals, see PR https://github.com/SecureApiGateway/secure-api-gateway-ob-uk-common/pull/101 
    7. Update `equals` generated method for these Classes that use BigDecimals fields:
       1. To fix the equality verification for BigDecimals it's necessary update the generated `equals` method.
       2. Replace all BigDecimals following the below instructions:
       **Example generated OB object OBFile1.java**
       ```java
       @ApiModel(description = "The Initiation payload is sent by the initiating party to the ASPSP. It is used to request movement of funds using a payment file.")
       @Validated
       @javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen")
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
 7. Copy them into the appropriate source folders: (e.g. `secure-api-gateway-ob-uk-common-obie-datamodel/src/main/java`).

    > Note that these guidelines originally advised not to overwrite existing files, but this is flawed since OB regularly
    makes changes/fixes to existing classes. Therefore, it is necessary to overwrite all files and then selectively rollback
    the changes, depending on what's changed. This is a long painstaking process!

    > It is worth noting that a number of generated files appear to have changed significantly (e.g. `OBReadConsent1`
    switching to `OBReadConsent1Data` and its new `PermissionsEnum`). However, it is important to compare the effect on
    the resulting JSON (plus any changes to the validation), as the change often makes no difference to the API, and yet
    the impact may be significant elsewhere. As a result of this, we have  not switched
    to `OBReadConsent1Data`.
    
    > Other notable changes include things like `OBEventSubscriptionResponse1Data` switching from a `String` to a `URL`
    for the `callbackUrl` or `httpopenbankingOrgUkrid` within `OBEventSubject1` being renamed to
    `httpColonOpenbankingOrgUkRid`, but the `@JsonProperty` annotation remaining the same. Again, neither of these make
    any difference to the resulting JSON, so these changes have not been applied.

 7. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
 8. Uncomment the relevant `<inputSpec>` listing within the `openapi-generator-maven-plugin` in the pom for the next
 swagger spec (and repeat for each new swagger YAML file).
 9. If using Intellij, run format and optimise imports on newly generated files.
 10. Run build to ensure everything compiles and copyrights are generated for new source files.
 11. Commit and raise PR.
 12. Update manage objects used to store the consent in IDM 
 If a new fields or changes on fields has been added in the new version, the managed objects
 defined to store the consent in IDM must be updated from:
- https://github.com/SecureApiGateway/secure-api-gateway-ob-uk-fidc-initializer
- https://github.com/SecureApiGateway/fr-platform-config
- To update the managed objects in an environment dev follow the below steps:
  - Suspend the fidc-configurator cronjob `k patch cronjobs fidc-configurator -p '{"spec" : {"suspend" : true }}'`
  - Delete manually, the managed objects that has been updated if you want to populate them to your dev environment, from the FR cloud platform UI `https://iam.yourenvironment.forgerock.financial/admin/#managed/`
  - Build and run the https://github.com/SecureApiGateway/secure-api-gateway-ob-uk-fidc-initializer (review the readme file)

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license
