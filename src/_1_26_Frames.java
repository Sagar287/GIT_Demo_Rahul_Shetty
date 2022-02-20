import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_26_Frames {

	public static void main(String[] args) 
	{
		// rahul shetty video -89, 90
		
		// Frames
		// what are frames
		// how to identify frames in application - 3ways
		// 1.id		2.webelement	3.index number
		// how to handle frames
		// best practises
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// to know total number of frames in a website
		System.out.println("total number of iframes - " + driver.findElements(By.tagName("iframe")).size());
		
		// option 2 for selecting frames i.e. by web element
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		
		// option 3 for selecting frames i.e. by index
		driver.switchTo().frame(0);
		
		
		Actions a = new Actions(driver);
		WebElement source = driver.findElement(By.id("draggable"));;
		WebElement destination = driver.findElement(By.id("droppable"));;
		a.dragAndDrop(source, destination).build().perform();
		
		driver.switchTo().defaultContent();
		System.out.println("To confirm that we switched back to main window from iframe- so printing below line");
		System.out.println("from main window --> " + driver.findElement(By.xpath("//*[@id=\"logo-events\"]/h2/a")).getText());

	}

}
