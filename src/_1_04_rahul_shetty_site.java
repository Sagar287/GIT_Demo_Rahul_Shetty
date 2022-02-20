import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _1_04_rahul_shetty_site 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String password = getpassword(driver);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String name="Mira";		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys(name);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(password);
		driver.findElement(By.cssSelector("button.submit")).click();
		
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.xpath("//p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class*='login'] h2")).getText(), "Hello " + name + ",");
		
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		driver.close();
	}

	
		public static String getpassword (WebDriver driver) throws InterruptedException
		{
			driver.get("https://rahulshettyacademy.com/locatorspractice/");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			
			driver.findElement(By.linkText("Forgot your password?")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
			String passwordtext = driver.findElement(By.cssSelector("p")).getText();
			String[] array1 = passwordtext.split("'");
			String[] array2 = array1[1].split("'");
			String password1 = array2[0];
			return password1;
		}

}

