
public class _1_7_Cucumber {
	
	// rahul shetty video ( SECTION 35 ) - 307
	// Cucumber
	// 1. Understand the importance of behaviour driver development
	// 2. Cucumber Framework Architecture and its core functinalities
	// 3. Selenium integration with Cucumber - E2E
	
	// 308
	// Requirements are given by business i.e. stakeholders
	// BA, Developers and QA might differ in understanding requirements and hence
	// their workking can also be different based on understanding
	// to overcome this gap between stakeholders and all agile team
	// introduced "Ubiquitous language" - a template to be followed by all
		
	// 309
	// Syntax - Testcase should be defined in a Business language by below way
	// IN ORDER TO ( achieve somehting )
	// AS A (ROLE)
	// I WANT TO ( do this )
	// eg
	// In ORDER TO pay credit card payment
	// AS A netbanking sole owner who have credit card section access
	// I WANT TO navigate to credit card section , enter amonut and process payment.
	
	// 310
	// Writing test cases with BDD - GIVEN WHEN THEN
	// GIVEN (what you need to have, to perform action - Pre-requisites
	// WHEN (performs action) - Action
	// THEN (the desired outcome of the user) - Validation
	// eg
	// GIVEN : An account with zero balance
	// WHEN: I navigate to credit card section , & click on pay option
	// THEN: IT should throw error messages
	
	// 311
	// This can be used as a Standard Template where all QA can one single process
	// The "Given-when-then" format can be tagged to automation file
	// which can help us in analyzing the error in test cases
	// common test template for both manual and automation test case
	
	// 312 - downloads
	
	// 313 
	// cucumber template
	// to support "jerkins" language we need to download a plugin
	// Go to " help -> Eclipse marketplace -> Install Cucumber
	// Cucumber project skeleton - can be obtained by Maven
	// after getting skeleton - push out testcases into it
	// go to " File->new->other->Maven Project->click next->choose template
	// cucumber supports quickstart only
	// group id - org.apache.maven.archetypes
	// artifact id - maven-archetypes-quickstart
}
