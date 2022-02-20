
public class _1_49_Maven {

	public static void main(String[] args) 
	{
		// rahul shetty video - 149, 150
		// It is build management, project management tool
		// it has a central repository for getting project dependencies
		// can be integrated easily with Continous Integration tools like Jenkins
		// we can get JAR of all the project, java, python both
		// and whenever there is version update in any application, JAR gets changed then
		// so it needs to be updated to all who are using that JAR file
		// So Maven then take care of all the changes as it update evrything
		// in the build of each system who are connected to that Maven project
		
		// maintaing common structure accross the organization
		// Flexibility in integrating CI tools
		// Plugin for Test Framework execution eg TestNG
		
		// maven installation
		// setup environment variables path for maven bin location and its internal bin location
		// we need to check in cmd by " .mvn --version" whether installed or not
		

		// rahul shetty video - 151
		// Sure file plugin - helps to execute test cases from test folder in Maven project
		// Maven - please refer project Mavenjava
		// group id - the main project name, package name is nothing but group id
		// artifact id - the sub project name, project name is nothing but artifact id
		// artifact id - maven-archetype-quickstart, group id - org.apache.maven.archetypes
		// while choosing for a maven project please refer above names
		// group id -  that we created for our first project = qaclickacademy
		// artifact id -  that we created for our first project = Mavenjava
		// and pom.xml i the heart of our all
		// can delete class 'appTest' which is generated automatically
		// In classs file '_SeleniumTest', it is a test class only 
		// our Maven do not know testNG, we have to pass dependency
		// though we have created dummy classes as 'Appiumtest', 'RestAPITest', 
		// 'SeleniumTest', but asssumimg them as real class we will have to inject
		// dependency from them in pom.xml file
		// so download jar files for testng, appium (java client), rest assured, seleniumJava
		// and paste them in pom.xml file
		// importance of 'maven sure fire' plugin, download from google in usage section
		// and paste it in pom.xml file
		// plugin helps in executing all our test cases in test folder
		// use some commands in cmd for Maven at project level
		// mvn clean
		// mvn compile = it checks the syntax error in all project
		// mvn test = it by defualt clean, compile and then test the project
		// maven only works on classes with keyword 'test' in their name
		
		// rahul shetty video - 152, 153
		// Integrating maven with TestNG
		// Maven reads the pom.xml, it search for the dependencies in Local Repository
		// to publish our project in Maven, the mandatory piece of information that is needed is
		// groupId, artifactID, version
		
		// rahul shetty video - 154
		// trigerring testng from maven
		// go to maven project, click on properties tab, click on TestNG and convert to testNG
		// now in sure file plugin dependency in pom.xml file, add the 'configuration' section
		// which you have copied from web from "using testng' section after searching sureFire
		// in google
		
		// rahul shetty video - 155
		// Switching the test with maven profiling
		// suppose if we want to control different xml file from maven
		// then we should not be changing it again in pom.xml file
		// it should be easy to switch
		// like one xml for regression and other xml for smoke, then swithcing can be 
		// done with profile concept
		// with changes done in xml file 'testng2.xml' and in pom also
		// added profile section and then cut N paste the build section into it
		// <profiles> is a parent and under it we can have mutliple <profile> 
		// like for regression, smoke
		// cmd command for using profiles is ' mvn test -PRegression' or 'mvn test -PSmoke'
		
		
	}

}
