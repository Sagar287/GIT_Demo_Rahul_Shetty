import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_43_Invoking_Multiple_Windows {

	public static void main(String[] args) 
	{
		// rahul shetty video - 124
		// driver.switchTo().newWindow(WindowType.TAB);
		// driver.switchTo().newWindow(WindowType.WINDOW);
		
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
				
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		// option 1
		//driver.switchTo().newWindow(WindowType.TAB);	//line 30
		//try line 30 also instead of line 34
		
		// option 2
		driver.switchTo().newWindow(WindowType.WINDOW);	//line 34
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String parent_window = it.next();
		String child_window = it.next();
		driver.switchTo().window(child_window);
		driver.get("https://rahulshettyacademy.com/#/index");
		
		String courseName = driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p/\"]")).get(1).getText();
		driver.switchTo().window(parent_window);
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys(courseName);
		
		//driver.findElement(By.cssSelector("input.form-control.ng-pristine.ng-invalid.ng-touched")).sendKeys(courseName);
		// don't know why above selector is not giving proper output
		
		
			
	}

}
