[<img src="https://raw.githubusercontent.com/ForgeRock/forgerock-logo-dev/master/Logo-fr-dev.png" align="right" width="220px"/>](https://developer.forgerock.com/)

**_This repository is part of the Secure API Gateway. If you just found this repository looking for our 
toolkit, we recommend having a first read to_ https://github.com/SecureApiGateway**

## secure-api-gateway-ob-uk-common-datamodel

A Java based set of classes modelling common internal data model representation of the Open Banking Uk domain model.

## Usage

In your pom file you should use the `secure-api-gateway-ob-uk-common-bom` import (see the README.md for that project) to pull in the correct secure-api-gateway-ob-uk-common versions. Then declare your pom dependency;

```
<dependency>
    <groupId>com.forgerock.sapi.gateway/groupId>
    <artifactId>secure-api-gateway-ob-uk-common-datamodel</artifactId>
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
cd secure-api-gateway-ob-uk-common/secure-api-gateway-ob-uk-common-datamodel
mvn clean install
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license