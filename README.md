
# Software Engineering in Practice•


## ECSE428 Assignment B : Test Driven Development
–Group of 2 students–

Rania Ouassif, 260861621

Lide Cui, 260852913

### Instruction on how to install the application : 

Requirements: Java JDK 11 & Maven 

Compile:
```
./mvnw spring-boot:run
```

Run and test API by url: http://localhost:8080/calculator/ramp//calculateRate/{length}/{width}/{weight}/{isInch}

### Relevant files

Implementation:

1. rest-calculator/src/main/java/com/example/calculator/ramp/RampCalculatorService.java
2. rest-calculator/src/main/java/com/example/calculator/ramp/RampController.java

Test:
1. rest-calculator/src/test/java/com/example/calculator/RampCalculatorServiceTest.java

### Description : 

Implement **ramp** a **rest API postal rate calculator** application with TDD implemented as a local host application.

ramp is implemented as a rest apiservice on a local host environment, by the Spring Boot framework

ramp–rate rules follow : 

•The application supports linear units in mm or inches.

•The application supports weight units in grams or ounces.

•The rules for postal rate calculation are as follows.
  
    –A standard envelope has a minimum length of 140 mm and a maximum length of 245 mm.
    
    –A standard envelope has a minimum width of 90 mm and a maximum width of 156 mm.
    
    –A standard envelope has a minimum weight of 3.0 g. 
    
    –A standard envelope has a maximum weight of 50.0 g.
    
    –Non-standard envelopes cannot exceed a length of 380 mm.  
    
    –Non-standard envelopes cannot exceed a width of 270 mm.    
    
    –Non-standard envelopes cannot exceed a weight of 500 g.
    
    –The postal rate for standard envelopes up to 30 g is $0.49.
    
    –The postal rate for standard envelopes over 30 g up to 50 g is $0.80.
    
    –The postal rate for non-standard envelopes up to 100 g is $0.98.
    
    –The postal rate for non-standard envelopes over 100 g up to 500 g is $2.4
 
 
–Order of TDD should start with:

•Exercise valid domain logic 

•Exercise invalid domain logic


–TDD should also consider

•Input payload syntax checking

•Input parameter checking


–Deliverables

•List of tests

•Step by step series of screen images of TDD implemented in Development environment indicate test, code, result and confirmation that previous tests still pass.

•Source code

•Executable of resulting application

•Instructions on how to install and launch the applicati
