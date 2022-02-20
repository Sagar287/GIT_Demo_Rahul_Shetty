import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _1_12_assignment_checkboxes
{

	public static void main(String[] args)
	{
	System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
	//	WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webrvier.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		Assert.assertTrue(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		
		driver.findElement(By.cssSelector("#checkBoxOption1")).click();
		System.out.println(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
		Assert.assertFalse(driver.findElement(By.cssSelector("#checkBoxOption1")).isSelected());
	
		System.out.println((driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size()));
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type=\"checkbox\"]")).size() , 3);
	}

}
