import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class _1_32_Scrolling_in_tabel_n_Window_level {

	public static void main(String[] args) throws InterruptedException 
	{
		
		// rahul shetty video - 100
		
		// Concept about - Java Script Executor
		// Identifies objects which has hidden elements
		
		// whatever test we are performing, we should first bring it into our focus
		// so we should actually scroll to exact web element
		
		// 1. how to "window scroll" in selenium
		// by default selenium dosen't provide any scrolling technique
		// so we have to execute java script, all browsers are made of java script
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		// choose option "change to JavaScriptExecutor"
		// we are actually casting our driver to JavaScriptExecutor
		// our driver will be aware that it can go ahead & it can execute Java scripts
		js.executeScript("window.scrollBy(0,700)");
		
		
		// 2. now how to scroll inside a "table"
		Thread.sleep(3000);
		js.executeScript("document.querySelector(\".tableFixHead\").scrollTop=200;");
		// another learning - try to use this - to extract value from a field with help of Javascript Executor?
		// String val = "return document.getElementById(\"hiddentext\").value;";
		// String text=(String) js.executeScript(val);
		
		// 3. to add all the 4th column values
		// tells us how to convert strig value to int value in below code
		int sum=0,number;
		List<WebElement> column = driver.findElements(By.xpath("//div[@class='tableFixHead']//td[4]"));
		//	css for above element only ->	".tableFixHead td:nth-child(4)"
		for(int i=0;i<column.size();i++)
		{
			number = Integer.parseInt(column.get(i).getText());
			sum = sum + number;
		}
		System.out.println("Sum of all number is - " + sum);
		
		// 4. to compare the total of all number from our code and output from website itself
		String[] text = driver.findElement(By.cssSelector("div.totalAmount")).getText().split(": ");
		int number_check = Integer.parseInt(text[1]);
		// another way of writing line 54
		// int number_check = Integer.parseInt(driver.findElement(By.cssSelector("div.totalAmount")).getText().split(": ")[1].trim());
		
		//mine way
		/*if(number_check==(sum))
		{
			System.out.println("sum ->" + sum);
			System.out.println("number_check ->" + number_check);
			System.out.println("matched");
		}
		else
		{
			System.out.println("sum ->" + sum);
			System.out.println("number_check ->" + number_check);
			System.out.println("Not matched");
		}	*/
		
		// trainer way
		Assert.assertEquals(sum, number_check);
		
		
		
		
		
	}

}
