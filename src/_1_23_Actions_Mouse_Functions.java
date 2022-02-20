import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_23_Actions_Mouse_Functions
{

	public static void main(String[] args) 
	{	
		// rahul shetty video -84,85
		
		// Action class - Mouse operations , is used for below purpose
		// how to mousehover on webelement
		// performing mouse and keyboard interactions
		// context click on element
		// double click on element
		// drag and drop of an element
		
		// used in case when we have to validate just a screen pop-up on mouse hover
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// 
		/*//option 1 - way 1
		Actions a = new Actions(driver);	// now driver will get the properties of Actions class method
		a.moveToElement(driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"))).build().perform();
		 */
		
		
		//option 1 - way 2
		// how to hover to web element
		WebElement element = driver.findElement(By.cssSelector("span#nav-link-accountList-nav-line-1"));
		Actions a = new Actions(driver);
		a.moveToElement(element).build().perform();
		
		//option 2
		// to hover mouse to a input box, enter value , but in capitals
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox")))
			.click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		
		// option 3
		// to select or highlight the inserted text in an input box
		a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox")))
		.click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		// option 4
		// to right click on a element
		a.moveToElement(element).contextClick().build().perform();
	}

}
