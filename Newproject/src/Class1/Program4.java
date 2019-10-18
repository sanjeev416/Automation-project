package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program4 {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		Actions bc = new Actions(driver);
		bc.dragAndDrop(driver.findElement(By.xpath("//li[@class='block13 ui-draggable'][1]/a")), driver.findElement(By.xpath("//*[@id = 'amt7']/li")))
		.build().perform();
	


	}

}
