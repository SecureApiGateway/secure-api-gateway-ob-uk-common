# securebanking-openbanking-uk-bom


This is a 'Bill of Materials' project that allows projects dependent on `securebanking-openbanking-uk` to include all the correct versions by simply importing the securebanking-openbanking-uk-bom in the `dependencyManagement` section of their pom file;

```
   <dependencyManagement>
        <dependencies>
            <!-- Secure Banking: Open Banking UK common dependencies BOM -->
            <dependency>
                <groupId>com.forgerock.securebanking.uk</groupId>
                <artifactId>securebanking-openbanking-uk-bom</artifactId>
                <version>1.0.0-SNAPSHOT</version>
                <type>pom</type>
                <scope>import</scope>
            </dependency>
        </dependencies>
    </dependencyManagement>
```



Then the required module can simply be referenced in the dependencies section of the pom;

```
<dependencies>
   <dependency>
       <groupId>com.forgerock.securebanking</groupId>
       <artifiactId>securebanking-openbanking-uk-common</artifiactId>
   <dependency>
</dependencies>
```

### How to Build

This is a Java Maven project. 

#### Prerequisites

You need the following on your development machine;
Java 14 or later
Maven 3.6.0 or later

#### Building

```
git checkout git@github.com:SecureBankingAcceleratorToolkit/securebanking-openbanking-uk.git
cd securebanking-openbanking-uk/securebanking-openbanking-uk-bom
mvn clean install
```

## Contributing

Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

Please make sure to update tests as appropriate.

## License 

Released under an Apache 2.0 license
