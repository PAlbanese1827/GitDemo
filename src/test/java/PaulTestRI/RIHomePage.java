package PaulTestRI;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObjects.rocketInsightsHome;
import WebDriverStuff.initializeDriver;



public class RIHomePage extends initializeDriver {
	
	
	//Pass which browser you want to use in initialize driver(options are chrome, firefox, edge)
	public WebDriver driver = initializeDriver("chrome");
	
	
	@BeforeTest
	public void navigateToRIHomePage() {
		driver.get("https://www.rocketinsights.com/");
		Assert.assertEquals("Rocket Insights", driver.getTitle());
	}
	
	@Test
	public void verifyLinks() {
		rocketInsightsHome riHP = new rocketInsightsHome(driver);
		Assert.assertEquals(riHP.getWorkLink().isEnabled(), true);
		Assert.assertEquals(riHP.getServicesLink().isEnabled(), true);
		Assert.assertEquals(riHP.getAboutLink().isEnabled(), true);
	}
	
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
