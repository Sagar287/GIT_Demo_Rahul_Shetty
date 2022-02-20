import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
		
public class _1_19_Waits_Implicit 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
				//Implicit Wait
				// Till the driver instance is active , it will wait for number of seconds before throwing any error
				// it will wait for maximum 5 seconds , will not wait more if the element is found early
				// more readable code, need to apply just once at a global level only, code looks optimized
				// disadvantage is - suppose if a particular feature normally take 2s but now it starts taking
				//			4.5s which is not acceptable, but as we have used implicit wait with 5s so we 
				//			won't be able to catch that error. So that's why we can't have greater implicit wait value.
				// i.e. performance issues are not discovered
		
				System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
				String[] itemsNeeded = {"Brocolli", "Cucumber", "Tomato"};
				addItems(driver, itemsNeeded);
				Thread.sleep(3000);
				//creating array for the items that we need
				
				
	}

		public static void addItems(WebDriver driver, String[] itemsNeeded) throws InterruptedException
		{
			
			//so we are first creating arrayList from the array at run time to save memory
			List<String> itemsNeeded_List = Arrays.asList(itemsNeeded);
			
			int j=0;
			
			//to select/prepare the list of all items belonging to same class 'ProductItem__Wrapper'
			List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
			List<WebElement> buttons = driver.findElements(By.xpath("//button[text()='ADD TO CART']"));
			
			// the loop is to check whether the vegetables in the Array (that we need)
			// are present in the extracted list
			
			for (int i=0;i<products.size();i++)
			{
				//String Vege_name = products.get(i).getText();// editing it to get splited names
				String[] products_array = products.get(i).getText().split("-");	//Brocoli - 1kg
				String Formatted_Vege_name= products_array[0].trim();			//Brocoli, 1kg
						
				//if(Vege_name.contains("TOMATO")) changing if condition also
				if(itemsNeeded_List.contains(Formatted_Vege_name))
				{
					j++;
					buttons.get(i).click();
					Thread.sleep(3000);
					//break; after Cucumber is found it will not validate for Brocoli
		
					//if(j==3)		making it more dyanamic
					if(j==itemsNeeded.length)
					{	break;	}
				}
			}
			
			driver.findElement(By.xpath("//img[@alt='Cart']")).click();
			driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
			driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
			driver.findElement(By.cssSelector("button.promoBtn")).click();
			System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

		}
}

