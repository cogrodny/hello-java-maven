[![Java CI with Maven](https://github.com/lucformalmethodscourse/hello-java-maven/actions/workflows/maven.yml/badge.svg)](https://github.com/lucformalmethodscourse/hello-java-maven/actions/workflows/maven.yml)

This build will always fail because it has 2 examples of failing tests:
one because of a defect in the SUT (system under test), and one because of an error in the test itself.

## Learning objectives

* Simple hello world example
* Experience with Git source code management
* Building with Maven
* Automated unit testing with JUnit
* Continuous integration with GitHub Actions

## System requirements

* Java 21 SDK or later (Java 21 LTS release recommended)
* [Maven](https://maven.apache.org/)

Your Codespace for this repo will already include these tools.

When working on a local workstation, you can conveniently install them using [SDKMAN!](https://sdkman.io/).

## Running the application

Without command-line arguments:

    $ mvn compile exec:java

Once compiled, you can omit the compile goal from subsequent executions, but remember to recompile after every code change:

    $ mvn exec:java

You can also run the application with specific command-line arguments:

    $ mvn exec:java -Dexec.args="arg1 arg2 arg3"
	
## Running the tests

To compile and run the tests:

    $ mvn test
	
## Generating the test coverage report

After running the tests, you can generate a coverage report:

    $ mvn jacoco:report

You can view the formatted HTML version of the report.
In your Codespace or other VS Code instance, locate

    target/site/jacoco/index.html
    
then right-click and choose "show preview" from the context menu.
(This requires the Live Preview extension for VS Code to be installed.)

You can also open the report locally through a web browser or on the command line.

On macOS:

    $ open target/site/jacoco/index.html

On Linux:

    $ xdg-open target/site/jacoco/index.html

On Windows: please let me know if you know how to do this from the WSL
command line.
Otherwise you can open the index file in your web browser or VS Code.

## Running the application outside Maven

First, create the JAR file containing the class files for this project:

    $ mvn package -DskipTests

This allows passing command-line arguments directly.

On Linux (incuding WSL) or macOS:

    $ java -cp ./target/hello-java-1.0-SNAPSHOT.jar hw.Main arg1 arg2 arg3

On Windows, when using the native command prompt, use a backslash instead of a slash:

    > java -cp .\target\hello-java-1.0-SNAPSHOT.jar hw.Main
