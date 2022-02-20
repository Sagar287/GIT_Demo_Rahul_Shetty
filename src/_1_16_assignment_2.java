import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1_16_assignment_2
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.cleartrip.com");
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"Adults\"]/option[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"Childrens\"]/option[5]")).click();

		driver.findElement(By.xpath("//*[@id=\"Infants\"]/option[2]")).click();

		driver.findElement(By.xpath("//*[@id=\"MoreOptionsLink\"]")).click();

		//System.out.println(driver.switchTo().alert().getText());

		//driver.switchTo().alert().dismiss();
		Thread.sleep(3000);

		
		//String MainWindow=driver.getWindowHandle();

		//driver.switchTo().window(MainWindow);

		driver.findElement(By.xpath("//*[@id='AirlineAutocomplete']")).sendKeys("airindia");

		driver.findElement(By.xpath("//*[@id=\"ORtrip\"]/section[2]/div[1]/dl/dd/div/a/i")).click();

		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

		driver.findElement(By.xpath("//*[@id='SearchBtn']")).click();

		System.out.println(driver.findElement(By.cssSelector("#homeErrorMessage")).getText());



		}
}
