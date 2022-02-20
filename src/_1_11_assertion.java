import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _1_11_assertion 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//clicking on "Senior citizen dropdown"
		//using assertion methods
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		
		//checking the number of checkboxes and printing them
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		
		//using loops with assertion to enter number of passengers
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); //passenger dropdown
		Thread.sleep(2000);
		for (int i=1;i<=5;i++)
		{	
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	//1 adult
			i++;
		}
		
		Assert.assertEquals((driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText()), "4 Adult");
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		

	}

}
