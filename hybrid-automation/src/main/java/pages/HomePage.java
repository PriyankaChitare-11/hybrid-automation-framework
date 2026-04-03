package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {
	
	private By firstProduct = By.xpath("(//a[contains(@href,'/products/')])[1]");
	
	public void clickFirstProduct() {
		click(firstProduct);
	}

	public boolean isHomePageLoaded() {
	    return getWaitUtils().waitForElementVisible(firstProduct).isDisplayed();
	}
	
	public void debugElements() {
	    System.out.println("Links count: " +
	        driver.findElements(By.cssSelector("a")).size());
	}
}
