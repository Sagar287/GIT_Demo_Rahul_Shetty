import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class _1_22_Wait_Fluent {

	public static void main(String[] args)
	{
		// rahul shetty video -82
		
		// FLUENT Wait
		// this is just an another explicit wait mechanism, but advanced one
		// this wait tries to find the web element repeatedly at regular intervals of time
		// until the timeout or till the objects get found
		// explicit wait = 10s
		// fluent wait = 10s, polling 2s
		// i.e it will check every 2s till 10s	
		// both WebDriverWait and FluentWait classes implements Wait Interface
		// disadvantage -> Unlike webDriver wait , we need to build Customized wait methods
		//		based on conditions, no predefined methods like webDriver wait are given here
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("div#start button")).click();
		
		//steps 1	FluentWait		//FluentWait is one class
		//steps 2	new FluentWait
		//steps 3	wait = new FluentWait 
		//steps 4	Wait wait = new FluentWait	//and it is implementing Wait interface
		//steps 5	Wait wait = new FluentWait(driver)	//
		//steps 6	Wait wait = new FluentWai<WebDriver>(driver)
		//steps 7	Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
				
		WebElement foo = wait.until(new Function<WebDriver, WebElement>()
			{
			  public WebElement apply(WebDriver driver) 
			  {
				  if(driver.findElement(By.cssSelector("div#finish h4")).isDisplayed())
				  {
					   return driver.findElement(By.cssSelector("div#finish h4"));
				  }
				  else
					  return null;
			  }
			}	);
		
		System.out.println(driver.findElement(By.cssSelector("div#finish h4")).isDisplayed());
	}
	

}
