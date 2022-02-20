import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Capabilities;

public class _1_35_SSL_Certifications {

	public static void main(String[] args)
	{	
		// rahul shetty video - 104
		
		// Concept about - SSL Certifications
		// we have to customize our chrome browser using desired capabilities
		
		// general chrome profile
		// DesiredCapabilities - class used to customize the Chrome browser.
		
		DesiredCapabilities ch= DesiredCapabilities.chrome();
		
		//ch.acceptInsecureCerts();		// 1st way
		ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);	// (string capabilityName, boolean value) wala select karna hai
		ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);		
		// below to your local profile
		// capability is used for creating general profile
		
		ChromeOptions c = new ChromeOptions();
		// what ChromeOptions is used for?
		// it is used to set the local browser settings
		c.merge(ch);
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver(c);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		/*
		// trainer way
		
		//Create instance of ChromeOptions Class
				ChromeOptions handlingSSL = new ChromeOptions();
		 
				//Using the accept insecure cert method with true as parameter to accept the untrusted certificate
				handlingSSL.setAcceptInsecureCerts(true);
						
				//Creating instance of Chrome driver by passing reference of ChromeOptions object
				System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
				
				WebDriver driver = new ChromeDriver(handlingSSL);
				
				//Launching the URL
				driver.get("https://expired.badssl.com/");
				System.out.println("The page title is : " +driver.getTitle());
				driver.quit();
		 */
	}

}

