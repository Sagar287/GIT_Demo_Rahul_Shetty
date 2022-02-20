import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class _1_48_Global_Parameter_part1 {

	public static void main(String[] args) throws IOException
	{
		// rahul shetty video - 147, 148
		// Global Parameteres
		// also refer class or file named as 'data.properties'
		
		// we are using properties class, it will help in scanning, executing any
		// dot properties file
		
		
		
		Properties prop = new Properties();
		// first we need to tell location of 'dot properties" file to Properties class
		FileInputStream fis = new FileInputStream("C:\\Users\\Gupta2 Sagar\\Downloads\\Selenium Course Rahul Shetty\\Workspace\\Introduction\\src\\data.properties");
		prop.load(fis);
		System.out.println(prop.getProperty("browser"));	//extracting global variable's value
		System.out.println(prop.getProperty("url"));
		prop.setProperty("browser", "firefox");				// changing browser value at run time
		System.out.println(prop.getProperty("browser"));
		// but browser value isn't changed in the dot properties file
		// so to change it we will use FileOutputStream
		
		/* value in dot properties file was before using setProperty code
		 * browser=chrome
		   url=http//rahulshettyacademy.com
		 */
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Gupta2 Sagar\\Downloads\\Selenium Course Rahul Shetty\\Workspace\\Introduction\\src\\data.properties");
		prop.store(fos, null);
		// and after change you can see in dot property file directly
	}

}
