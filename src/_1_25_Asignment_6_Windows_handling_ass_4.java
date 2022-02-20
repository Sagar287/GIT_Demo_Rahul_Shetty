import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class _1_25_Asignment_6_Windows_handling_ass_4 {

	public static void main(String[] args)
	{
		// rahul shetty video -86, 87 , 88
		
				
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Actions a = new Actions(driver);
		//a.moveToElement(driver.findElement(By.xpath("//a[@href=\"/windows\"]"))).keyDown(Keys.SHIFT).click().build().perform();
		
		
		driver.findElement(By.xpath("//a[@href=\"/windows\"]")).click();
		
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		// now we need to move or iterate to window through their id
		Set<String> window_id = driver.getWindowHandles();
		Iterator<String> it = window_id.iterator();
		String parent_id = it.next();
		String child_id = it.next();
		driver.switchTo().window(child_id);
		
		System.out.println(driver.findElement(By.cssSelector("div.example")).getText());
		
		driver.switchTo().window(parent_id);
		System.out.println(driver.findElement(By.xpath("//div[@class='example']//h3")).getText());
		
		
		
		
	}

}
