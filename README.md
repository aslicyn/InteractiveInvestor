**Full Name :** 
Aslihan CAP YURTSEVEN
**Project Title :**
CASE STUDY – Intereact Invester Flow Examples
**Installation guide:** 
This is a maven project. so It's assumed that the host running this code have Java and maven installed and JAVA_HOME already set. 
Here is the guide for maven installation just in case : https://maven.apache.org/install.htmlProject get all dependencies from maven repository. So no additional installation needed.
**Below are the dependencies are being used for this project :** Junit,
Cucumber,
cucumber-junit,
Selenium Webdriver, 
Bonigarcia Webdrivermanager
 **Credentials :** 
No Credentials required for the project. 
**Build and run your project :** 
This is maven project and tests are written in JUnit . So we use maven command line commands to run the project as below to pick up JUnit tests:  
mvn clean testFramework can be built with using TestNg or Cucumber BDD but preferred to use Junit.
It is created basic Page Object Model design pattern but it can be improved if needed.

If any test fails after running the CukesRunner, FailedTestRunner automatically re-runs the failed scenario(s)

 **Test Reports Locations :** 
1- Cucumber HTML Plugin Reports "target" -> default-html-reports -> index.html
2- if you open index.html with any browser, it gives you the failed scenario(s) and the screen shoot where the test failed.

