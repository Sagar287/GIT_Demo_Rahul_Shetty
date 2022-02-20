import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1_00_Browsers 
{

	public static void main(String[] args)
	{
		/*selenium can run on dif browser chrome, firefox, safari etc..
		let work for chrome now
		so with help of special methods we can invoke chrome
		
		but  to use methods of a class we need to create object of class to use methods
		ChromeDriver dr = new ChromeDriver();
		or ChromeDriver driver = new ChromeDriver(); 
		 className    objectName  = new is a keyword to create object
		 
		but as all classes for each browser are following same rule
		so there must be some regulation force fo that & i.e interface
		webdriver interface........
		
		interface has empty methods, which all others classes are forced to follow 
		as they are implementing webDriver interface 
		
		Classes can implement personal methods along with webdriver interface
		But we want to implement only webdriver realted methods , so for that we write
		WebDriver driver = new ChromeDriver();  
		bcz our object might use methods which are implemented outside webdriver
		so to restrict object to webdriver we write like above statement		*/
		
		/* ------------------------------------------------------
		//@@1 with Google Chrome & chrome driver
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.rahulshettyacademy.com");
		
		//check the title of the page
		System.out.println(driver.getTitle());
		
		// to check the current URL of the website
		System.out.println(driver.getCurrentUrl());
	
		// to close the browser
		driver.close();			*/
		
		/* ------------------------------------------------------------ 
		//@@2 with Firefox & gecko driver
		System.setProperty("webdriver.gecko.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.rahulshettyacademy.com");
		
		//check the title of the page
		System.out.println(driver.getTitle());
		
		// to check the current URL of the website
		System.out.println(driver.getCurrentUrl());
	
		// to close the browser
		driver.close();                 */
		
		/* ---------------------------------------------------------- */
		//@@3 with Mocrosoft Edge & gecko driver
		System.setProperty("webdriver.edge.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.rahulshettyacademy.com");
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		
	}

}
