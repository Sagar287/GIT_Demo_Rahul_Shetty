import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class _1_06_dropdowns 
{

	public static void main(String[] args)
	{
			System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
			driver.manage().window().maximize();
			
			//selecting "AED" with the "selectbyIndex" option
			WebElement Staticdropdown = driver.findElement(By.xpath("//select[@name='ctl00$mainContent$DropDownListCurrency']"));
			Select dropdown = new Select(Staticdropdown);
			dropdown.selectByIndex(2);
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			//selecting "USD" with the "selectbyVisible" option
			dropdown.selectByVisibleText("USD");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			//selecting "INR" with the "selectbyValue" option
			dropdown.selectByValue("INR");
			System.out.println(dropdown.getFirstSelectedOption().getText());
			
			
	}

}
