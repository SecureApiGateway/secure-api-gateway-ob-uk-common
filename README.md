# securebanking-openbanking-uk

Repository containing maven modules used by two or more Secure API Gateway UK projects. The versions of the modules in this repository are specified in a BOM style pom (securebanking-openbanking-uk-bom) that may be imported into other projects as a simple way of including the latest versions of the common modules.

## Usage

Import into your dependenciesManagement sections like this (use the latest released version);

```
   <dependencyManagement>
        <dependencies>
            <!-- Secure API Gateway: Open Banking UK common dependencies -->
            <dependency>
                <groupId>com.forgerock.sapi.gateway.uk</groupId>
                <artifactId>secure-api-gateway-ob-uk-common-bom</artifactId>
                <version>1.0.0-SNAPSHOT</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>

            ...
        </dependencies>
    </dependencyManagement>
```

### How to Build

This is a Java Maven project. 

#### Prerequisites
You need the following on your development machine;
Java 14 or later
Maven 3.6.0 or later

#### Building

```
git checkout git@github.com:SecureApiGateway/secure-api-gateway-ob-uk-common.git
cd secure-api-gateway-ob-uk-common
mvn clean install
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 
Released under an Apache 2.0 license
