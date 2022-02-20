import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _1_07_dropdowns
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:/Users/Gupta2 Sagar/Downloads/Selenium Course Rahul Shetty/Softwares/3. Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		/* OPTION 1
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();	//passenger dropdown
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	//1 adult
		driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	//2 adult
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();	//done button
		OPTION 1 */
		
		
		/*OPTION 2 using while loop to avoid writing line 4- 5 times
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();	//passenger dropdown
		Thread.sleep(2000);
		int i=1;
		while (i<5)
		{	// it is used 5 times without writing it 5 times with the help of while loop
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	//1 adult
			i++;
		}
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();	
		OPTION 2 */
		
		
		//OPTION 3 using while loop to avoid writing line 4- 5 times
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click(); //passenger dropdown
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		for (int i=1;i<=5;i++)
		{	// it is used 5 times without writing it 5 times with the help of while loop
			driver.findElement(By.xpath("//span[@id='hrefIncAdt']")).click();	//1 adult
			i++;
		}
		
		System.out.println(driver.findElement(By.xpath("//div[@id='divpaxinfo']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
	}

}
