import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_08_dynamic_dropdowns {

	public static void main(String[] args) throws InterruptedException 
	{
		// rahul shetty video -53
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'AMD')]//parent::div//parent::div")).click();
//		driver.findElement(By.xpath("//div[contains(text(),'IXA')]")).click();
	
		// or we can use this xpath for destination city
		// this is differernt type of xpath i.e. parent space child in comparison to line 22
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-b5h31w r-95jzfe'] //div[contains(text(),'IXA')]")).click();
		
	}

}
