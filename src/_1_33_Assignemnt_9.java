import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_33_Assignemnt_9 {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().window().maximize();
		
		//Requirement 1
		System.out.println("No. of rows - " + driver.findElements(By.cssSelector("table#product:nth-child(2) tr")).size());
		
		//Requirement 2
		System.out.println("No. of columns - " + driver.findElements(By.cssSelector("table#product:nth-child(2) tr:nth-child(2) td")).size());
		
		// Learning - to print the column name only or to count column we can say that also
		// th - basically refers to column name
		System.out.println("No. of columns - " + driver.findElements(By.xpath("//table[@id='product']/tbody/tr/th")).size());
		
		//Requirement 3
		System.out.println("2nd row text is printed below-------" + driver.findElement(By.cssSelector("table.table-display tbody tr:nth-child(3)")).getText());
		
		/*
		
		// trainer way
		WebElement table=driver.findElement(By.id("product"));



		System.out.println(table.findElements(By.tagName("tr")).size());



		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());



		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));



		System.out.println(secondrow.get(0).getText());



		System.out.println(secondrow.get(1).getText());



		System.out.println(secondrow.get(2).getText());
		*/
}
}
