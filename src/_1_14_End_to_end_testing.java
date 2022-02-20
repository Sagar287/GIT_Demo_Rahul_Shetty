/*
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_14_End_to_end_testing 
{

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.manage().window().maximize();
		
		// clicking on "One way" button
		driver.findElement(By.xpath("//*[text()='one way']")).click();
		
		// clicking on "From Place-High level" option
		driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']")).click();
		
		// clicking on "From Place" option
		driver.findElement(By.xpath("//div//div//*[text()='IXA']")).click();
		Thread.sleep(2000);
		
		// clicking on "To Place" option
		driver.findElement(By.xpath("//div//*[text()='IXU']")).click();
		
		// clicking on "Departure Date" option
		driver.findElement(By.xpath("//*[@data-testid='departure-date-dropdown-label-test-id']")).click();
		
		// clicking on "Specific Date" option
		driver.findElement(By.xpath("//div[@data-testid='undefined-calendar-day-16']")).click();
		//driver.findElement(By.xpath("//*[text()='Welcome aboard.']")).click();
		
		//clicking passengers option
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[1]")).click();
		driver.findElement(By.xpath("//*[text()='Welcome aboard.']")).click();
		
		// increasing number of passengers
		driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//*[@data-testid='Adult-testID-plus-one-cta']")).click();
		driver.findElement(By.xpath("//div[@class='css-1dbjc4n r-18u37iz r-19h5ruw r-184en5c']/div[1]")).click();
		
		//selecting "family & friends" options
		driver.findElement(By.xpath("//div[contains(text(),'Family & Friends')]")).click();
		driver.findElement(By.xpath("//*[text()='Search Flight']")).click();
	}
}

*/

/////////////////@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_14_End_to_end_testing 
{

	static String URL = "https://www.phptravels.net/flights";
	public static void main(String[] args) throws InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		
        //WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();

         

         driver.get(URL);

         driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.findElement(By.xpath("//input[@id='autocomplete']")).click();

driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Del");

driver.findElement(By.xpath("//*[@id='onereturn']/div[1]/div/div[1]/div/div/div/div/div[1]")).click();

driver.findElement(By.xpath("//input[@id='autocomplete2']")).click();

driver.findElement(By.xpath("//input[@id='autocomplete2']")).sendKeys("Mum");

driver.findElement(By.xpath("//*[@id='onereturn']/div[1]/div/div[2]/div/div/div/div/div[1]")).click();

selectDate("January 2022", "20", driver);

getPassengers(driver);

// search

driver.findElement(By.xpath("//button[@id='flights-search']")).click();

}

	
public static void selectDate(String monthName, String date, WebDriver driver)

{

  driver.findElement(By.xpath("(//input[@id='departure'])[1]")).click();

  //(//table[@class=' table-condensed']//th)[2]

  WebElement month = driver.findElement(By.xpath("(//table[@class=' table-condensed']//th)[2]"));

while(!month.getText().contains(monthName))

{

     driver.findElement(By.cssSelector("(//th[@class='next'])[1]")).click();

     

}

int count= driver.findElements(By.cssSelector("td[class='day ']")).size();

for(int i=0;i<count;i++)

{

     String text=driver.findElements(By.xpath("//td[@class='day ']")).get(i).getText();

     if(text.equalsIgnoreCase(date))

     {

   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

driver.findElements(By.xpath("//td[@class='day ']")).get(i).click();

    System.out.println("Date is:"+text);

    break;

     }

}

}

public static void getPassengers(WebDriver driver)

{

driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn waves-effect']")).click();

//

for(int i=0;i<3;i++ )

    {

      driver.findElement(By.xpath("(//*[@class='la la-plus'])[1]")).click();       

    }

driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn waves-effect']")).click();

}

   

}




/*


// another way from trainer
public class PhpTravelsEndToEnd {

    static String URL = "https://www.phptravels.net/flights";

public static void main(String[] args) {

         WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();

         

         driver.get(URL);

         driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

driver.findElement(By.xpath("//input[@id='autocomplete']")).click();

driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("Del");

driver.findElement(By.xpath("//*[@id='onereturn']/div[1]/div/div[1]/div/div/div/div/div[1]")).click();

driver.findElement(By.xpath("//input[@id='autocomplete2']")).click();

driver.findElement(By.xpath("//input[@id='autocomplete2']")).sendKeys("Mum");

driver.findElement(By.xpath("//*[@id='onereturn']/div[1]/div/div[2]/div/div/div/div/div[1]")).click();

selectDate("January 2022", "20", driver);

getPassengers(driver);

// search

driver.findElement(By.xpath("//button[@id='flights-search']")).click();

}

public static void selectDate(String monthName, String date, WebDriver driver)

{

  driver.findElement(By.xpath("(//input[@id='departure'])[1]")).click();

  //(//table[@class=' table-condensed']//th)[2]

  WebElement month = driver.findElement(By.xpath("(//table[@class=' table-condensed']//th)[2]"));

while(!month.getText().contains(monthName))

{

     driver.findElement(By.cssSelector("(//th[@class='next'])[1]")).click();

     

}

int count= driver.findElements(By.cssSelector("td[class='day ']")).size();

for(int i=0;i<count;i++)

{

     String text=driver.findElements(By.xpath("//td[@class='day ']")).get(i).getText();

     if(text.equalsIgnoreCase(date))

     {

   // driver.findElements(By.cssSelector("td[class*='day']")).get(i).click();

driver.findElements(By.xpath("//td[@class='day ']")).get(i).click();

    System.out.println("Date is:"+text);

    break;

     }

}

}

public static void getPassengers(WebDriver driver)

{

driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn waves-effect']")).click();

//

for(int i=0;i<3;i++ )

    {

      driver.findElement(By.xpath("(//*[@class='la la-plus'])[1]")).click();       

    }

driver.findElement(By.xpath("//a[@class='dropdown-toggle dropdown-btn waves-effect']")).click();

}

   

}	*/