[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

**_This repository is part of the Secure Banking Accelerator Toolkit. If you just found this repository looking for our 
toolkit, we recommend having a first read to_ https://github.com/SecureBankingAcceleratorToolkit**

## securebanking-openbanking-uk-forgerock-datamodel

A Java based set of classes modelling ForgeRock's representation of the Open Banking domain model.

## Usage

In your pom file you should use the `securebanking-openbanking-uk-bom` import (see the README.md for that project) to pull in the correct securebanking-openbanking-uk versions. Then declare your pom dependency;

```
<dependency>
    <groupId>com.forgerock.securebanking</groupId>
    <artifactId>securebanking-openbanking-uk-forgerock-datamodel</artifactId>
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
cd securebanking-openbanking-uk/securebanking-openbanking-uk-forgerock-datamodel
mvn clean install
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license