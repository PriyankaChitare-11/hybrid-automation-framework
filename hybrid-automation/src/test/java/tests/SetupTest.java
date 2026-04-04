package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import base.BaseTest;
import listeners.TestListener;
import pages.HomePage;
import pages.ProductPage;

//@Listeners(TestListener.class)
public class SetupTest extends BaseTest {

    @Test
    public void testAddToCardFlow() {

        HomePage home = new HomePage();
        ProductPage product = new ProductPage();

        Assert.assertTrue(home.isHomePageLoaded(), "Home page not loaded");

        home.clickFirstProduct();

        Assert.assertTrue(product.isProductPageLoaded(), "product page not loaded");

       // Assert.fail("Testing screenshot on failure"); // This is used to intentionally fail a test cases

        product.addToCard();
    }
}