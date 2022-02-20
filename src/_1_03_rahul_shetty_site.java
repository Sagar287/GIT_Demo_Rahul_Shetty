import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_03_rahul_shetty_site 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String name="rahul";		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.submit")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='login'] h2")).getText(), "Hello " + name + ",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
		}

}//div[contains[@text(),'one-way')]
