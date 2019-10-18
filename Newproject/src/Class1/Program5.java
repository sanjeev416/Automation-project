package Class1;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program5 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		WebElement e1 = driver.findElement(By.linkText("Click Here"));
		e1.click();
		String currentwindow = driver.getWindowHandle();
		Set<String> allwindows = driver.getWindowHandles();
		
		ArrayList<String> list = new ArrayList<String>();
		list.addAll(allwindows); 
		String name = list.get(1);
		driver.switchTo().window(name);
		driver.close();
		
		driver.switchTo().window(currentwindow);
		 System.out.println(driver.findElement(By.tagName("h3")).getText());
		
		
		
		
		


	}

}
