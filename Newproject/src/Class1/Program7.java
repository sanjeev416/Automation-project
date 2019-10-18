package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program7 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.globalsqa.com/demo-site/draganddrop/");
driver.switchTo().frame(driver.findElement(By.xpath("//li[@class = 'ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle'][1]/img//iframe")));

}

}
