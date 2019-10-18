package Class1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program6 {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

WebDriver driver = new ChromeDriver();

driver.get("https://the-internet.herokuapp.com/windows");
		
driver.manage().window().maximize();

driver.findElement(By.xpath(" ")).click();;

Alert q = driver.switchTo().alert();
Thread.sleep(5000);
q.accept();
q.dismiss();
		
		

	}

}
