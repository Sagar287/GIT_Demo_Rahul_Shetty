import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_45_Height_and_Width_WebElement {

	public static void main(String[] args) throws IOException 
	{
		// rahul shetty video - 127
		// Width and Height of a WebElment
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.switchTo().newWindow(WindowType.WINDOW);	//line 34
		Set<String> handles= driver.getWindowHandles();
		Iterator<String> it= handles.iterator();
		String parent_window = it.next();
		String child_window = it.next();
		driver.switchTo().window(child_window);
		driver.get("https://rahulshettyacademy.com/#/index");
		
		String courseName = driver.findElements(By.cssSelector("a[href*=\"https://courses.rahulshettyacademy.com/p/\"]")).get(1).getText();
		driver.switchTo().window(parent_window);
		WebElement name = driver.findElement(By.cssSelector("input[name='name']"));
		name.sendKeys(courseName);
		File file =name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("logo.png"));
		
		//get height and width
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
