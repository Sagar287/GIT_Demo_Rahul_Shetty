import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
		
public class _1_20_Waits_Explicit 
{

	public static void main(String[] args) throws InterruptedException
	{
		
				
			//Explicit Wait
			// Suppose we have used 5sec implicit wait when we were searching hotel in a city
			//but now suppose we have to search for entire US, then it take up to 15sec this time
			// so for that case we need to use explicit wait
			// not applied globally
			// Used for a particular web element or targeted element & no performance issues
			// disadvantage - more code
			// how to write explicit wait---see below---------------------------
			// WebDriverWait w = new WebDriverWait(driver,5);
			// w.until(ExpectedConditions.visibilityOfElementLocated(locator));
		
			
			System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
			String[] itemsNeeded = {"Brocolli", "Cucumber", "Tomato"};
			addItems(driver, itemsNeeded);
			Thread.sleep(3000);
			
			
			
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException
	{
		
		List<String> itemsNeeded_List = Arrays.asList(itemsNeeded);
		
		int j=0;
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
		
		for (int i=0;i<products.size();i++)
		{
			String[] products_array = products.get(i).getText().split("-");	//Brocoli - 1kg
			String Formatted_Vege_name= products_array[0].trim();			//Brocoli, 1kg
					
			if(itemsNeeded_List.contains(Formatted_Vege_name))
			{
				j++;
				buttons.get(i).click();
				Thread.sleep(3000);
				if(j==itemsNeeded.length)
				{	break;	}
			}
		}
		
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		// ExpectedConditions.elementToBeClickable(null)
		// ExpectedConditions.invisibilityOf(null)
		// ExpectedConditions.visibilityOfElementLocated(null)
		// ExpectedConditions.textMatches(null, null)
		// ExpectedConditions.titleContains(null)
		// ExpectedConditions.urlMatches(null)
		
		// locator is = 					  "By.xpath("//img[@alt='Cart']"
		// webElement is = "driver.findElement(By.xpath("//img[@alt='Cart']"))"
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		}
}

