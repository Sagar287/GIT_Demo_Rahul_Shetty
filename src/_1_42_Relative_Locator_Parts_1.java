import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class _1_42_Relative_Locator_Parts_1 {

	public static void main(String[] args) 
	{
		// rahul shetty video - 122, 123
		// selenium will not give auto suggestion for the package of the relative locators
		// we have to write in on our own
		// import static org.openqa.selenium.support.locators.RelativeLocator.*;

		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().deleteCookieNamed("asdf");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// 1st method - which is normal one
		System.out.println(driver.findElement(By.xpath("//div[@class='form-group']//label[text()='Name']")).getText());
		
		// 2nd method -the one which we are learning
		// task 1 - searching an element with "above"
		WebElement ele = driver.findElement(By.cssSelector("input[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(ele)).getText());
		
		// task 2 - searching an element with "below"
		WebElement ele1 = driver.findElement(By.cssSelector("label[for=dateofBirth]"));
		driver.findElement(with(By.tagName("input")).below(ele1)).click();
		// here flex element is used in the webElement "date selector"
		// hence our above findElement statement is clicking on some other webElement
		
		// task 2 - searching an element with "left"
		WebElement ele2 = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(ele2)).click();
		
		// task 3 - searching an element with "right"
		WebElement ele3 = driver.findElement(By.cssSelector("#inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(ele3)).getText());
				

	}

}
