import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1_30_Assignement_8_ 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// requiremet 1
		driver.findElement(By.id("checkBoxOption1")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText());
		String option_value = driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[1]")).getText();
		
		// requiremet 2
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select s = new Select(drop);
		s.selectByVisibleText(option_value);
			
		
		// requiremet 3
		driver.findElement(By.cssSelector("input#name")).sendKeys(option_value);
		Thread.sleep(300);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String[] output = driver.switchTo().alert().getText().split(",");
		String[] match =output[0].split(" ");
		driver.switchTo().alert().accept();
		
		//output way for requirement - mine way
		if(option_value.equals(match[1]))
		{
			System.out.println("Verified");
		}
		else
			System.out.println("Not Verified");
		
		System.out.println("Checking another way to verify--------------");
		
		//output way for requirement 3 - trainer way
		driver.findElement(By.cssSelector("input#name")).sendKeys(option_value);
		Thread.sleep(300);
		driver.findElement(By.cssSelector("input#alertbtn")).click();
		String check = driver.switchTo().alert().getText();
		if(check.contains(option_value))
		
	     {	    System.out.println("Alert message success");	}

	     else

	    System.out.println("Something wrong with execution");
		
		 
	}
}


