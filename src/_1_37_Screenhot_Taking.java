import java.io.File;
import java.io.IOException;
import java.time.Duration;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class _1_37_Screenhot_Taking {

	public static void main(String[] args) throws IOException 
	{
		// rahul shetty video - 107
		
		// Concept about - Take screenshot
				
				
		//System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().deleteCookieNamed("asdf");
		
		// we need to convert our webDriver object into screenshot object
		driver.get("https://www.google.com");
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	
		// Firstly we are casting our driver object to TakeScreenshot method object
		// which is using method "getScreenshotAs" to take screenshot
		// & we are asking webdriver to get the output in the "FILE" format
		// & that we are storing in object "src"
		FileUtils.copyFile(src, new File("C:\\Users\\Gupta2 Sagar\\OneDrive - The Boston Consulting Group, Inc\\Desktop\\Take screenshot\\screenshot.png"));
		
	}

}



