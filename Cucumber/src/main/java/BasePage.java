import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	public static WebDriver driver;
	public String browser = "chrome";

	public BasePage() {
		if (driver == null) {
			if (browser.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver",  
						"C:\\Users\\sanjeev\\Downloads\\Selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
				
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "Firefox Driver Server Path");
				driver = new FirefoxDriver();
			}
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);			
		}
	}

	public boolean elementFound(WebElement element ) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	public void setText(WebElement element, String name) {
		if (name != null) {
			element.click();
			element.clear();
			element.sendKeys(name);
		}
	}

	public String getTxtAttribute(WebElement element) {
		return element.getAttribute("value");
		
	}

	public String selectFromDropDown(WebElement element, String option) {
		Select obj = new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
		
	}
	
	public void selectoption(java.util.List<WebElement> orgs, WebElement element,String opti) {
		Select ab = new Select(element);
		 orgs = ab.getOptions();
		 orgs = ab.getAllSelectedOptions();
		 
  
		  }
		

	public boolean isElementVisible(WebElement element) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 15);
			wait.until(ExpectedConditions.visibilityOf(element));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public String getTitlte() {
		return driver.getTitle();
	}	
	
	public void moveMouseCursor(WebElement element) {
		
		new Actions(driver).moveToElement(element).build().perform();
	}
	

	public void popups(WebElement element) throws InterruptedException
	
	{
		driver.switchTo().alert();
		Thread.sleep(5000);

					
	}
	
	
	
	public void quitDriver() {
		driver.quit();
	}
}


