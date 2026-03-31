package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import driver.DriverFactory;

public class WaitUtils {
	
	private WebDriver driver;
	private WebDriverWait wait;
	
	public WaitUtils() {
		
		this.driver = DriverFactory.getDriver();
		
		this.wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	
	public WebElement waitForElementVisible(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public WebElement waitForElementClickable(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public boolean waitForTextPresent(By locator, String text) {
	    return wait.until(ExpectedConditions.textToBePresentInElementLocated(locator, text));
	}
	
}
