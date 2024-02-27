## Generate a new Maven project ##

- Run below command from Command line tool

```text
mvn archetype:generate -DartifactId=selenium-learning -DgroupId=com.mytest -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4
```

- Run below command to download Maven Dependencies, compile, and build project

```text
mvn clean package -e
```
OR,

```text
mvn clean install -e
```
**NOTE:** Use argument `-e` to console error messages while building the project 

- Run below command to run unit tests against compile source code using available testing framework

```text
mvn test
```

## Add required dependency for Maven project ##

- Update/Modify the deppendencies in `pom.xml`. Refer [Maven Central Repository](https://central.sonatype.com/) to know about the latest version of dependencies.

1. Add Selenium Dependency

```xml
<dependency>
      <groupId>org.seleniumhq.selenium</groupId>
      <artifactId>selenium-java</artifactId>
      <version>4.18.1</version>
</dependency>
```
2. Add Dependendency to load and manage Browsers

```xml
<dependency>
      <groupId>io.github.bonigarcia</groupId>
      <artifactId>webdrivermanager</artifactId>
      <version>5.7.0</version>
</dependency>
```
3. Add dependency TestNG testing framework

**NOTE:** Dependency Management - `test` scope is to inform `maven` tat this dependency is not required at standard runtime of the application but will be used while Testing purposes only

```xml
<dependency>
      <groupId>org.testng</groupId>
      <artifactId>testng</artifactId>
      <version>7.9.0</version>
      <scope>test</scope>
</dependency>
```

4. Add below support dependencies to avoid runtime error `Failed to load class org.slf4j.impl.StaticLoggerBinder`

```xml
    <dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>2.0.12</version>
</dependency>

<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-log4j12</artifactId>
    <version>2.0.12</version>
</dependency>
```

**NOTE:** Refer `selenium-learning/pom.xml` for complete list of dependencies.

## Add required dependency for Maven project ##

- Configure Maven Surefire Plugin to execute our project's unit test

`<suiteXmlFiles>`: This tag is used to specify a list of TestNG suite XML files that define the tests to be run. TestNG suite XML files allow you to configure your tests more granularly, specifying which test classes to run, how to group them, parameters to pass to tests, etc.

`<suiteXmlFile>`: This tag is to specify the path to TestNG configuration file

```xml
<plugin>
      <artifactId>maven-surefire-plugin</artifactId>
      <version>3.2.5</version>
      <configuration>
            <suiteXmlFiles>
                  <suiteXmlFile>src/test/resources/testng.xml</suiteXmlFile>
            </suiteXmlFiles>
      </configuration>
      </plugin>
      
```



**Happy Learning !**
