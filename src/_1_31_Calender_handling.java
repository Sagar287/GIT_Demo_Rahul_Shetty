import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_31_Calender_handling {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		// Need to select "April 23"
		driver.findElement(By.id("travel_date")).click();
				
		//  Firstly select Month "April"
		// while loop will keep on executing till it becomes false
		while(!driver.findElement(By.cssSelector(".datepicker-days .datepicker-switch")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector(".datepicker-days .next")).click();
		}
		
		//  Secondly select Date "23"
		List<WebElement> dates = driver.findElements(By.cssSelector(".day"));
		int count = driver.findElements(By.cssSelector(".day")).size();
		for(int i=0;i<count;i++)
		{
			String date = driver.findElements(By.cssSelector(".day")).get(i).getText();
			if(date.contains("23"))
			{
				driver.findElements(By.cssSelector(".day")).get(i).click();
				System.out.println("Date found");
				break;
			}
		}
	}

}
