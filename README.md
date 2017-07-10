# Assignment
Code challenge

# Test automation task

## Problem statement

### Instructions:
* Candidate is free to use the tool of his/her choice
* Code/script should be executable in a *nix environment
* Publish your code in your personal github account and share the link with us. 
* Please provide a “README” document  with clear instructions on how to execute the code


#### Scenario 1
1. Create a automated test for following scenarios: 
2. Find a job in Berlin
3. Use the search “Fuss Fitting Model”, filter & job Category “Content Creating & Styling”
4. Implement this for zLabels GmbH
5. Check search-result details with job-ad details (Title, Job Category, Location, Company)


#### Scenario 2 
* Go to zalando job page. Implement an automated test, which lists the open positions (for eg Analyst) in any of these 3 locations - Berlin, Helsinki or Netherlands.


## Solution
Selenium webdriver is used to solve this challenge. 
PageObjectModel, a design pattern is used

#### Prerequisite
Java 1.8

#### IDE used
Eclipse

#### Language used
Java

#### Solution compatibility
Windows and Linux
* To change the driver or driver version DriverFactory class be used


#### Instructions to run
1. Install java from [here](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. Install Eclipse from [here](https://www.eclipse.org/downloads/?)
3. Install TestNG plugin from Eclipse Marketplace
4. Right click on testRun.xml and do `Run as > TestNG Suite`

#### Report location
`/test-output/index.html`



