package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import driver.DriverFactory;

public class BasePage {
	protected WebDriver driver;
	
	public BasePage() {
		this.driver = DriverFactory.getDriver();
	}
	
	protected WebElement getElement(By locator) {
		
		return driver.findElement(locator);
		
	}
	
	protected void click(By locator) {
		getElement(locator).click();
	}
	
	protected void sendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	protected String getText(By locator) {
		return getElement(locator).getText();
	}

	protected boolean isDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
}
