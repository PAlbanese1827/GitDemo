package WebDriverStuff;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class initializeDriver {
	
	
	public WebDriver initializeDriver(String browserDriver) {
		if(browserDriver.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver;
		}
		else if(browserDriver.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\geckodriver\\geckodriver.exe");
			WebDriver driver = new FirefoxDriver();
			return driver;
		}
		else if(browserDriver.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", "C:\\edgedriver\\msedgedriver.exe");
			WebDriver driver = new EdgeDriver();
			return driver;
		}
		return null;
	}
}
