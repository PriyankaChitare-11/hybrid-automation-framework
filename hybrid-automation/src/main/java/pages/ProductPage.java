package pages;

import org.openqa.selenium.By;

public class ProductPage extends BasePage{
	
	private By addToCartBtn = By.name("add");
	
	public void addToCard() {
		click(addToCartBtn);
	}
	
	public boolean isProductPageLoaded() {
		return isDisplayed(addToCartBtn);
	}

}
