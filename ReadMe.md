# ~WIP

## Important Note
* update chromedriver path according to OS in `src/test/resources/uat.properties` file `See the comment`

# CucumberSeleniumDemo
* Showcase Project using Selenium webdriver, Cucumber JVM as automation framework, PageObject design pattern and Maven is used as build tool.
* This is simple program to demo how to write Cucumber Selenium test.
* Java 1.8 is used as programming language and Maven is used as build tool.


### Tech Stack:
* Java 1.8
* Maven 2
* Cucumber
* Selenium
* Chromedriver
* Junit 4.11


### Execution details:

* In case you dont have Maven2 :`sudo apt-get install maven2`
* `mvn clean install -X`
* For local execution set flag `executeLocal=Y` in `src/test/resources/uat.properties`

#### Run the below mvn command to start the test execution
* To run the Regression test on Production (Chrome browser)
 `mvn clean test -Denvironment=uat -Dbrowser=chrome -Dcucumber.options="--tags @RegressionTests" exec:java`

### With HTML Report
* Open terminal
* Go to project root
* `mvn site`
* `mvn test surefire-report:report`
* Report location `target/site/surefire-report.html`
* Cucumber Report `/target/cucumber/index.html`
* Cucumber Jenkins Report `/target/cucumber-html-reports/feature-overview.html`


