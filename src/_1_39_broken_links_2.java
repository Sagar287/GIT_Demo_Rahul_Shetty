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

public class _1_39_broken_links_2 {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		// rahul shetty video - 110
		// Concept about - Broken links 
		
		// but here in the code, there is problem
		// bcz as the broken link is found, code will top checking further links
		// which should not be the case, as we want to check the other links also
		// so then we use soft assertion
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asdf");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> footer_links = driver.findElements(By.cssSelector("div#gf-BIG a"));
		// enhanced For loo
		int i=0;
		for( WebElement link : footer_links)
		{
			
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode = conn.getResponseCode();
			System.out.println("Link " + i + "status - " + respCode);	
			i++;
			
			if (respCode>400)
			{
				System.out.println("The link with text '" + link.getText() + "' is broken with code '" + respCode + "'");
				Assert.assertTrue(false);		// this is a hard assertion
			}
		}
		
		

	}

}
