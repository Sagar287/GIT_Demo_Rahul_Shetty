import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_18_Practise_onGREENKART_COM 
{

	public static void main(String[] args) throws InterruptedException 
	{
				// rahul shetty video -71
		
				System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.get("https://www.bigbasket.com/cl/fruits-vegetables/#!page=2");
				
				Thread.sleep(3000);
				int j=0;
				//creating array for the items that we need
				String[] itemsNeeded = {"Cucumber", "Brocoli"};
				//to select/prepare the list of all items belonging to same class 'ProductItem__Wrapper'
				List<WebElement> products = driver.findElements(By.cssSelector(".btn.btn-add.col-xs-9"));
				
				
				// the loop is to check whether the vegetables in the Array (that we need)
				// are present in the extracted list
				
				for (int i=0;i<products.size();i++)
				{
					//String Vege_name = products.get(i).getText(); editing it to get splited names
					String[] Vege_name = products.get(i).getText().split("-");	//Brocoli - 1kg
					String Formatted_Vege_name= Vege_name[0].trim();			//Brocoli, 1kg
					
					//so we are first creating arrayList from the array at run time to save memory
					List itemsNeededList = Arrays.asList(itemsNeeded);
					
					
					//if(Vege_name.contains("TOMATO")) changing if condition also
					if(itemsNeededList.contains(Formatted_Vege_name))
					{
						j++;
						driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
						//break; after Cucumber is found it will not validate for Brocoli
			
						//if(j==3)		making it more dyanamic
						if(j==itemsNeeded.length)
							break;
					}
				}  

	}

}
