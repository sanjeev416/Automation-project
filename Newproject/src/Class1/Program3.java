package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Program3 {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");	
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		
		Actions ac = new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@id = 'nav-shop']/a/span[2]"))).build().perform();
		
		
	Actions ba = new Actions(driver);
	
	ba.moveToElement(driver.findElement(By.xpath("//span[text()='Mobiles, Computers']"))).build().perform();

		Actions ca = new Actions(driver);
		ca.moveToElement(driver.findElement(By.xpath("//span[text()='Power Banks']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Power Banks']")).click();
	}
	
	
	
	

}
