import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1_29_Click_on_links {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.gecko.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		WebElement footer = driver.findElement(By.id("gf-BIG"));
		WebElement coloumndriver = footer.findElement(By.xpath("//*[@id='gf-BIG']/table/tbody/tr/td[1]/ul"));	
		List<WebElement> lft_ft = coloumndriver.findElements(By.tagName("a"));
		for(int i=1;i<lft_ft.size();i++)
		{
			String clicklinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			lft_ft.get(i).sendKeys(clicklinkTab);
			
			System.out.println("Link " + i + " opened");
			Thread.sleep(2000);
		}	
		
	/*	for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs	*/
		
		Set<String> windows_id= driver.getWindowHandles();
		Iterator<String> it = windows_id.iterator();
		
		int j=1;
		while (it.hasNext())
		{
			
			driver.switchTo().window(it.next());
			Thread.sleep(3000);
			//System.out.println(driver.getTitle());
			System.out.println("child_id number #"+ j +"# & title is - "+ driver.getTitle());
			Thread.sleep(3000);
			j++;
			
		}
	}

}


/*


//import junit.framework.Assert;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_28_Print_links_count {

	public static void main(String[] args) throws InterruptedException
	{
	
		
//1. Give me the count of links on the page.
		//2. Count of footer section-
		
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://qaclickacademy.com/practice.php");
		
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));// Limiting webdriver scope
		
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3-
		WebElement coloumndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(coloumndriver.findElements(By.tagName("a")).size());
		
		//4- click on each link in the coloumn and check if the pages are opening-
		for(int i=1;i<coloumndriver.findElements(By.tagName("a")).size();i++)
		{
			
			String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			coloumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
			Thread.sleep(5000L);
			
		}// opens all the tabs
		Set<String> abc=driver.getWindowHandles();//4
		Iterator<String> it=abc.iterator();
		
		while(it.hasNext())
		{
			
		   driver.switchTo().window(it.next());
		   System.out.println(driver.getTitle());
		
		}
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}	*/
