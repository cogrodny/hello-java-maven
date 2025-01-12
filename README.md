[![Java CI with Maven](https://github.com/lucformalmethodscourse/hello-java-sbt/actions/workflows/maven.yml/badge.svg)](https://github.com/lucformalmethodscourse/hello-java-sbt/actions/workflows/maven.yml)

This build will always fail because it has 2 examples of failing tests:
one because of a defect in the SUT (system under test), and one because of an error in the test itself.

# Learning objectives

* Simple hello world example
* Experience with Git source code management
* Building with Maven
* Automated unit testing with JUnit
* Continuous integration with GitHub Actions

# System requirements

* Java 21 SDK or later (Java 21 LTS release recommended)
* [Maven](https://maven.apache.org/)

Both of these can be installed conveniently using [SDKMAN!](https://sdkman.io/).

# Running the application

Without command-line arguments:

    $ mvn exec:java

With specific command-line arguments:

    $ mvn exec:java -Dexec.args="arg1 arg2 arg3"
	
# Running the tests

    $ mvn test
	
# Generating the test coverage reports

    $ mvn verify
	
If the tests pass, you will then see the coverage report on the console. 
In addition, you can view a formatted HTML version of report in a web browser.

If the tests don't pass, however, you should force the generation of the test coverage report:

    $ mvn jacoco:report

In Gitpod, navigate to and open

    target/site/jacoco/index.html
    
then press the "show preview" button in the top right corner.

On macOS:

    $ open target/site/jacoco/index.html

On Linux:

    $ xdg-open target/site/jacoco/index.html

On Windows: please let me know if you know how to do this from the WSL
command line. Otherwise you can open the index file in your web browser.

*Note that the report will show 0% coverage as long as there are failing tests.*

# Running the application outside Maven

First, create the JAR file containing the class files for this project:

    $ mvn package -DskipTests

This allows passing command-line arguments directly.

On Linux (incuding WSL) or macOS:

    $ java -cp ./target/hello-java-1.0-SNAPSHOT.jar hw.Main arg1 arg2 arg3

On Windows, when using the native command prompt, use a backslash instead of a slash:

    > java -cp .\target\hello-java-1.0-SNAPSHOT.jar hw.Main
