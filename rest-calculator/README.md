# rest-calculator
A simple calculator exposed as Rest API, built with Java 11 using Spring Boot.

## Requirement
Install Java 11 JDK. It can be downloaded from Oracle using the following link: https://www.oracle.com/technetwork/java/javase/downloads/jdk11-downloads-5066655.html 

## Run
As with every Spring Boot application, it can be runned in the terminal using the following command *./mvnw spring-boot:run*

After that the application can be accessed using the base url *http://localhost:8080/calculator*

## Api Documentation
After starting the application the API Documentation with Swagger can be seen here: http://localhost:8080/calculator/swagger-ui.html

## How to run assignment B
### File location for ramp calculator

Implementation: 
1. rest-calculator/src/main/java/com/example/calculator/ramp/RampCalculatorService.java
2. rest-calculator/src/main/java/com/example/calculator/ramp/RampController.java

Test:
1. rest-calculator/src/test/java/com/example/calculator/RampCalculatorServiceTest.java

API can be tested by url: http://localhost:8080/calculator/ramp//calculateRate/{length}/{width}/{weight}/{isInch}