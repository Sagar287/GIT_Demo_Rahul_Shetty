import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_34_Assignment_10 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		
		driver.findElement(By.cssSelector("input#autocomplete")).sendKeys("British");
		Thread.sleep(2000);
		List<WebElement> Elements_options= driver.findElements(By.cssSelector("li div.ui-menu-item-wrapper"));
		
		for(WebElement option : Elements_options)
		{
			if(option.getText().equalsIgnoreCase("British Indian Ocean Territory"))
					{
						option.click();
						// to select (for printing purpose) a value that is selected in a dropdown 
						System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));
						break;
					}
		}
		
		
		/*
		 // trainer way
		
		    driver.findElement(By.id("autocomplete")).sendKeys("ind");

		    Thread.sleep(2000);
		    
		    // wonderful operation - to perform arrow key down operation in Selenium

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		    driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);

		   System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));	*/

	}

}
