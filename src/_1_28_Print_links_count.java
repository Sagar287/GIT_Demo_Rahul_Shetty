import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_28_Print_links_count {

	public static void main(String[] args) throws InterruptedException
	{
		//// rahul shetty video -91, 92, 93, 94
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		// Requirement 1 - to give the links count on the page
		// all links have tagname "a" 
		// find elements - because it is plural
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		// Requirement 2 - to "Limiting webdriver scope"
		// "Limiting webdriver scope"
		// to get the links count only in footer section
		// for that we need to limit our web driver scope
		// currently it is set to whole page, but we want it for footer section only
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		System.out.println(footer.findElements(By.tagName("a")).size());

		// Requirement 3 - to print links in left section of footer section only
		WebElement coloumndriver = footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));	
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
	}

}
