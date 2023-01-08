# pics-tests

This repository contains the results of a recruitment task on a Software QA Engineer position at [pics.io](https://pics.io).

## Task Description

* Analyze video player product  
* Describe a [test plan](https://will-be-added-soon)  
* Describe a [check-list](https://will-be-added-soon)  
* Implement a few [automated tests](https://url-to-source-code)  

## Local test run

**Prerequisites:**
* Java 17  
* Maven 3.8.+  
* Registered account at [pics.io](https://pics.io)  
* Added environmental variables
    ```shell
    PICS_EMAIL=email@example.com
    PICS_PASSWORD=yourpassword
    ```
* Cloned repository

**Environment variables:**

Add environment variables in test configurations, if you use IntelliJ IDEA:
1. Click Run -> Edit Configurations...
2. Remove all existing configurations(if any), clicking on minus button, in the top-left corner  
3. Click Edit configuration templates...
4. Click TestNG 
5. Set `PICS_EMAIL=email@example.com;PICS_PASSWORD=yourpassword` in the 'Environment variables:' field  
6. Click Apply
7. Click OK

**Run all tests:**
```shell
mvn clean test
```