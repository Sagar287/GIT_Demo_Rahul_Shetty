import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class _1_21_Assignement_5_ 
{

	public static void main(String[] args)
	{
		
		System.setProperty("webdriver.chrome.driver","C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.cssSelector("label.customradio:nth-child(2)")).click(); //or this ->  //label[2]
		
		WebDriverWait w = new WebDriverWait(driver,7);
		//WebDriverWait w = new WebDriverWait(driver,Duration.ofMillis(7000));
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#okayBtn")));
		driver.findElement(By.id("okayBtn")).click();
		
		WebElement category = driver.findElement(By.cssSelector(".form-control:nth-child(1)"));
		Select dropdown = new Select(category);
		dropdown.selectByIndex(2);
		driver.findElement(By.cssSelector("input#terms")).click();
		
		driver.findElement(By.id("signInBtn")).click();		
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("li.nav-item.active")));
		
		List<WebElement> add_buttons = driver.findElements(By.cssSelector(".btn.btn-info"));
		for(int i=0;i<add_buttons.size();i++)
		{
			add_buttons.get(i).click();
		}
		driver.findElement(By.cssSelector("li.nav-item.active")).click();
		//or we can use this-> driver.findElement(By.partialLinkText("Checkout")).click();

	}

}	