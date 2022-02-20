import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.netty.util.internal.SystemPropertyUtil;

public class _1_05_rahul_shetty_site 
{

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		System.out.println(driver.findElement(By.xpath("//body/header/div/button/following-sibling::button[1]")).getText());
		// just to use following sibling , no output of the program
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/parent::header")).getText());
		
		//get  - have little wait mechanism
		// and navigate method - just land to page though full web components are not loaded
		
		driver.navigate().to("https://google.com");
		System.out.println(driver.findElement(By.xpath("img.lnXdpd")).getText());
		
		driver.navigate().back();
		driver.navigate().forward();
		
	}

}
