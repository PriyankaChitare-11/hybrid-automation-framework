package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import driver.DriverFactory;
import pages.HomePage;
import pages.ProductPage;

public class SetupTest extends BaseTest {

	  @Test
	    public void testAddToCardFlow() {
			 
		  HomePage home = new HomePage();
		  
		  //Assertion in test (Correct place)
		  Assert.assertTrue(home.isHomePageLoaded(),"Home page not loaded");
		  
		  home.clickFirstProduct();
		 
		  ProductPage product = new ProductPage();
		  
		  Assert.assertTrue(product.isProductPageLoaded(), "product page not loaded");
		  
		  product.addToCard();
		  
		  
	    }
}
