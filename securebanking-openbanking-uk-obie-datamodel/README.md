[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

**_This repository is part of the Secure Banking Accelerator Toolkit. If you just found this repository looking for our 
toolkit,_we recommend having a first read to_ https://github.com/SecureBankingAcceleratorToolkit**

## securebanking-openbanking-uk-obie-datamodel

A Java SDK to help implementing the Open Banking standard: https://www.openbanking.org.uk/read-write-apis/.

## Usage

In your pom file you should use the `securebanking-openbanking-uk-bom` import (see the README.md for that project) to pull in the correct securebanking-openbanking-uk versions. Then declare your pom dependency;

```
<dependency>
    <groupId>com.forgerock.securebanking</groupId>
    <artifactId>securebanking-openbanking-uk-obie-datamodel</artifactId>
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
git checkout git@github.com:SecureBankingAcceleratorToolkit/securebanking-openbanking-uk.git
cd securebanking-openbanking-uk/securebanking-openbanking-uk-obie-datamodel
mvn clean install
```

## Class generation
Many of the classes are generated from the OB Swagger documentation. The project is setup to make it easy to generate
the  OB model classes and skeleton API classes using Maven. For efficiency, the default maven profile does not generate
the code, but it is easy to do so using `code-gen` profile (see below).

The configuration for the swagger generation is currently within `securebanking-openbanking-uk-obie-datamodel/pom.xml` 
and the swagger specification is within `securebanking-openbanking-uk-obie-datamodel/src/main/resources/specification`.

When a new version of OB API is released, the following steps should be performed:
 1. Download the Swagger yaml files from OB Spec pages (https://github.com/OpenBankingUK/read-write-api-specs/releases).
    As of v3.1.8, there are swagger files for Accounts, Payments, Funds Confirmation, Events and Variable Recurring Payments.
 1. Place the swagger files under `src/main/resources/specification` (replacing existing ones where applicable).
 1. Run ```mvn clean install -Pcode-gen```
    > This will generate classes into `securebanking-openbanking-uk-obie-datamodel/target/generated-sources/swagger`
 1. Check the generated files and copy them into the appropriate source folder (e.g. `src/main/java`).

    > Note that these guidelines originally advised not to overwrite existing files, but this is flawed since OB regularly
    makes changes/fixes to existing classes. Therefore, it is necessary to overwrite all files and then selectively rollback
    the changes, depending on what's changed. This is a long painstaking process!

    > It is worth noting that a number of generated files appear to have changed significantly (e.g. `OBReadConsent1`
    switching to `OBReadConsent1Data` and its new `PermissionsEnum`). However, it is important to compare the effect on
    the resulting JSON (plus any changes to the validation), as the change often makes no difference to the API, and yet
    the impact may be significant elsewhere (e.g. on `openbanking-aspsp`). As a result of this, we have  not switched
    to `OBReadConsent1Data`.
    
    > Other notable changes include things like `OBEventSubscriptionResponse1Data` switching from a `String` to a `URL`
    for the `callbackUrl` or `httpopenbankingOrgUkrid` within `OBEventSubject1` being renamed to
    `httpColonOpenbankingOrgUkRid`, but the `@JsonProperty` annotation remaining the same. Again, neither of these make
    any difference to the resulting JSON, so these changes have not been applied.

 1. Remove Links, Meta, OBError1 and OBErrorResponse1 - we use shared generic versions of these classes.
 1. Uncomment the relevant `<inputSpec>` listing within the `openapi-generator-maven-plugin` in the pom for the next
 swagger spec (and repeat for each new swagger YAML file).
 1. If using Intellij, run format and optimise imports on newly generated files.
 1. Run build to ensure everything compiles and copyrights are generated for new source files.
 1. Commit and raise PR.

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license