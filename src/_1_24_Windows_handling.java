import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_24_Windows_handling {

	public static void main(String[] args)
	{
		// rahul shetty video -86, 87
		
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		// at this point new window will be opened
		// the scope of driver is just to the url we have provided in the top
		// so we share knowledge to selenium
		// so first get window id of all the windows initailly to handle this situation
		
		//driver.getWindowHandles();
		// as its return type is Set<String> so we have used that
		// String Childwindow = MainWindow;
	    // String ChildWindow1 = Childwindow;
	    // String ChildWindow2 = ChildWindow1;
		
		//this will provide all window's id in the window_id variable
		Set<String> windows_id= driver.getWindowHandles();	//	[parent_id, child_id]
		System.out.println(driver.getWindowHandle());	// see window id before iterator concept
		
		// now we need to move or iterate to window through their id
		Iterator<String> it = windows_id.iterator();
		String parent_id = it.next();
		System.out.println(driver.getTitle());	
		System.out.println(parent_id);				// see parent id after iterator concept
		
		String child_id = it.next();
		driver.switchTo().window(child_id);
		System.out.println(driver.getTitle());
		System.out.println(child_id);				// see child id before iterator concept
		
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
		String email = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		System.out.println(email);
		
		driver.switchTo().window(parent_id);
		driver.findElement(By.id("username")).sendKeys(email);
	}

}
