
public class _1_54_Page_Object_Pattern {
	
	// rahul shetty video - 182, 183
	// Page Object Pattern
	// Advantages
	// 1. Easy to maintain
	// 2. Easy readability of scripts
	// 3. Reduce eliminate duplicacy
	// 4. Re-usability of code
	// 5. Reliability
	
	// 183
	// create different class for HomePage, Login Page
	// and separate test cases class which would be same always, no change
	// would be done to these test cases , never
	// only when locator get changed, we will change it in HOmePage or Login Page
	// Home Page - Java class ( Rediff Homepage ) - objects of Homeage
	// Login Page - Java class ( LoginPage ) - objects of LoginPeage
	// TestCase
	
	// 184
	// Object Repository Mechanism
	// refer "_7_Object Repository Mechanism" project
	// download the jar file of "selenium-server-standalone"
	// create 2 packages "_1_object_Repository" and "_2_Test_cases"
	
	// 185
	// now we have created classes in both the packages
	// now we have to check their accessiblity part
	// to access any method of class "_1_gmail_loginPage" in the testcase class
	// "_1_login_application" , we need to create object of that class first
	// create a parameterized constructor in "_1_gmail_loginPage" class
	// which can accept constructor from "_1_login_application" class
	
	// 186
	// to have multiple object repository pages like
	// "_1_gmail_loginPage", "_2_gmail_Help_Page"
	
	// 187, 188, 189
	// Page Factory annotations "FindBy"
	// created other class "_3_gmail_loginPage2_PageFactory" for using "findBY" annotation

}
