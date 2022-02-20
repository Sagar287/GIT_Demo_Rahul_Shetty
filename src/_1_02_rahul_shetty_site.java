import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class _1_02_rahul_shetty_site
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("rahulsheaca");
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys("rahulsheaca");
		driver.findElement(By.cssSelector("button.submit")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.cssSelector("input[placeholder=\"Name\"]")).sendKeys("Sagar Gupta");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).sendKeys("Sagar@rsa.com");
		driver.findElement(By.xpath("//input[@type=\"text\"][2]")).clear();
		driver.findElement(By.cssSelector("input[type=\"text\"]:nth-child(3)")).sendKeys("Sagar@gmail.com");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("9876543210");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector(".infoMsg")).getText());
		driver.findElement(By.xpath("//button[contains(@class,'login')]")).click();
		
		Thread.sleep(2);
		//driver.findElement(By.xpath("//div[@class=\"forgot-pwd-btn-conainer\"]//button[1]")).click();
		driver.findElement(By.cssSelector("input[placeholder*='User']")).sendKeys("rahul");
		// * represents regular expression
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("label[for='chkboxOne']")).click();
		driver.findElement(By.cssSelector("label[for*='Two']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();	
	}

}
