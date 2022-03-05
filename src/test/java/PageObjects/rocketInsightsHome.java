package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class rocketInsightsHome {

public WebDriver driver;
	
	By workLink = By.linkText("WORK");
	By servicesLink = By.linkText("SERVICES");
	By aboutLink = By.linkText("ABOUT"); //traverses from ul to li to a
	
	//Constructor for webdriver to pass the driver in
	public rocketInsightsHome(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement getWorkLink() {
		return driver.findElement(workLink);
	}
	
	public WebElement getServicesLink() {
		return driver.findElement(servicesLink);
	}
	
	public WebElement getAboutLink() {
		return driver.findElement(aboutLink);
	}
}
