package ObjectPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
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
						"C:\\Selenium\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browser.equals("firefox")) {
				System.setProperty("webdriver.gecko.driver", "");
				driver = new FirefoxDriver();
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			driver.get("http://automationpractice.com/index.php");
		}
	}

	public boolean elementFound(WebElement element) {
		boolean res = false;
		try {
			res = element.isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return res;
	}

	

		
	public void quitDriver() {
		driver.quit();
	}
}
