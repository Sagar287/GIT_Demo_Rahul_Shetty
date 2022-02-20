import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _1_13_Calender_Handling 
{
	
	// rahul shetty video -62
	// to check enableness of a system if not working through isenable function in selenium
	
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		/*//this code from 21 to 24 is giving wrong output acutally as "true,true" 
		//which should be"False,true" actually
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());*/
		
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).click();
		System.out.println(driver.findElement(By.cssSelector("#ctl00_mainContent_view_date2")).isEnabled());
		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(false);
		}
		driver.close();

	}

}
