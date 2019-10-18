package Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Program1

{

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.adactin.com/HotelApp/SearchHotel.php");

		WebDriverWait wait = new WebDriverWait(driver, 30);

		WebElement obj = driver.findElement(By.id("username"));

		obj.sendKeys("sanjeev416");

		WebElement sr = driver.findElement(By.id("password"));

		sr.sendKeys("sanjeev123");

		WebElement ab = driver.findElement(By.id("login"));

		ab.click();

		WebElement loc = driver.findElement(By.name("location"));
		Select sa = new Select(loc);
		sa.selectByValue("Brisbane");

		WebElement pri = driver.findElement(By.id("hotels"));
		Select wpc = new Select(pri);
		wpc.selectByValue("Hotel Sunshine");
		WebElement lap = driver.findElement(By.name("Submit"));
		lap.click();

		WebElement De = driver.findElement(By.id("radiobutton_1"));
		De.click();

		WebElement na = driver.findElement(By.id("continue"));
		na.click();

		WebElement vs = driver.findElement(By.id("first_name"));

		vs.sendKeys("sanjeev");

		WebElement wl = driver.findElement(By.id("address"));

		wl.sendKeys("chennai");

		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("order_no"))));

	}

}














