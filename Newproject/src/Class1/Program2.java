package Class1;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Program2 {
	
	

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		

		driver.get("https://www.adactin.com/HotelApp/SearchHotel.php");
		
		driver.manage().window().maximize();
		 
		TakesScreenshot tk = (TakesScreenshot) driver;
		File snap = tk.getScreenshotAs(OutputType.FILE);
	    FileHandler.copy(snap, new File("C:\\eclipse\\Newproject\\Screenshot\\ss.png"));
		
		
		
		

	}

}
