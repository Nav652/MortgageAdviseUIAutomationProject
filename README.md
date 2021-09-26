# MortgageAdviseUIAutomationProject

******Assignment 1:******
Automation of UI using Selenium or any other tool.
This code is based on selenium with BDD approach which uses Cucuber framework for the UI Automation.

******PreRequisites:*******
1) Download the chromedriver and gecko driver due the browser compatibility issues and make sure the browser version and chrome driver version are in sync.
2) Install maven and its dependencies

*******Steps to run the code:*******
1) Since the Automation is designed to run both in chrome browser and Firefox driver, Use the below mentioned maven command to run by passing the browser as parameter

----------To Run in Chrome browser:------------
mvn clean install -Dbrowser=chrome

----------To Run in Firefox browser:------------
mvn clean install -Dbrowser=firefox

******Request_Call_Back.java:*****
This file is developed with hardcoded values and can used for quick testing of UI.
Just include the Chrome driver path in the below code to run succesfully
System.setProperty("webdriver.chrome.driver", <Chrome driver Path>);
