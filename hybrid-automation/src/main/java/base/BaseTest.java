package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;
import enums.BrowserType;
import utils.ConfigReaderUtility;

public class BaseTest {
	
	ConfigReaderUtility config = new ConfigReaderUtility();
	
	@BeforeMethod
	public void setup() {
		
		// Here we are calling browser
		
		BrowserType bowser = BrowserType.fromString(config.getBrowser());
		
		DriverFactory.initDriver(bowser);
		
		DriverFactory.getDriver().get("https://sauce-demo.myshopify.com/");
		
	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
