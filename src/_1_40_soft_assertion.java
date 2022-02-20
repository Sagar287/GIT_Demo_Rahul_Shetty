import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class _1_40_soft_assertion {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
		// rahul shetty video - 111
		// Concept about - Soft Assertion
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asdf");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> footer_links = driver.findElements(By.cssSelector("div#gf-BIG a"));
		SoftAssert a = new SoftAssert();	// creating object for softAssert class
		int i=0;
		for( WebElement link : footer_links)
		{
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println("Link " + i + "status - " + respCode);
			// the below line is a short form of writing code from the previous program
			//Assert.assertTrue(respCode<400, "The link with text '" + link.getText() + "' is broken with code '" + respCode + "'")
			// will not Aseert.   , will use softAssert objects
			// the below line dosen't halts the program, it just stores the failures in it
			a.assertTrue(respCode<400, "The link with #IndexValue-" + i + " and #Linktext-'" + link.getText() + "' is broken with #code-'" + respCode + "'.");
			i++;
		}
		a.assertAll();	// this line will the script if line 46 has any stored failures with it
		// the above line is used for reporting
	}

}
