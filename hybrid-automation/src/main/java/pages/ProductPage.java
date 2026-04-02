package pages;

import org.openqa.selenium.By;



public class ProductPage extends BasePage {

	private By addToCartBtn = By.xpath("//*[@type='submit']|//*[@value=\"Add to Cart\"]");
	private By cartDrawer = By.xpath("//*[contains(@class,'drawer') or contains(@class,'cart')]");

	public void addToCard() {

	    click(addToCartBtn);

	    getWaitUtils().waitForElementVisible(cartDrawer);
	}
	public boolean isProductPageLoaded() {
		return isDisplayed(addToCartBtn);
	}

}
