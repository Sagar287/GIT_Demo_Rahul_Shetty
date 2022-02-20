import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_38_broken_links_Automation {

	public static void main(String[] args) throws MalformedURLException, IOException 
	{
		// rahul shetty video - 108, 109
		// Concept about - Broken links or we can say "URL" is not working
		
		// to check the non-working urls we will actually not click on evry link 
		// to check whether are working or not
		// we will use status code from the network section after choosing inspecting section
		// like 404 or 200 or 300
		
		// 1. step 1 - to get all url tied to all links usinf selenium
		// so here some JAVA methods will call URL's  & get the status code
		// if the status code>400 then that url is not working
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asdf");
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String url = driver.findElement(By.cssSelector("a[href*=\"soapui\"]")).getAttribute("href");
		// we got the link in the string with above line		
		
		// there is method "openConnection" which comes from  predefined class "URL"
		// to class any method belonging to a class we can use its objects
		HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
		conn.setRequestMethod("HEAD");
		conn.connect();
		int respCode = conn.getResponseCode();
		System.out.println("Link 1 status - " + respCode);
		
		// checking intentionally for a broken link
		String url2 = driver.findElement(By.cssSelector("a[href*=\"brokenlink\"]")).getAttribute("href");
		// we got the link in the string with above line		
		
		// there is method "openConnection" which comes from  predefined class "URL"
		// to class any method belonging to a class we can use its objects
		HttpURLConnection conn2 = (HttpURLConnection)new URL(url2).openConnection();
		conn2.setRequestMethod("HEAD");
		conn2.connect();
		int respCode2 = conn2.getResponseCode();
		System.out.println("Link 2 status - " + respCode2);
		
	}
	
}
