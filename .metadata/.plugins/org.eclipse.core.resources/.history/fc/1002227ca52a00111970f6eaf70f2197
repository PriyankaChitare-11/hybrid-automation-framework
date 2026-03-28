package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import driver.DriverFactory;
import enums.BrowserType;
import enums.Environment;
import factory.EnvFactory;
import utils.ConfigReaderUtility;

public class BaseTest {
	
	ConfigReaderUtility config = new ConfigReaderUtility();
	
	@BeforeMethod
	public void setup() {
		
		ConfigReaderUtility config = ConfigReaderUtility.getInstance();
		
		
		//Browser - Here we are actual calling browser
		BrowserType bowser = BrowserType.fromString(config.getBrowser());
		DriverFactory.initDriver(bowser);
		
		//Environment
		Environment env = Environment.fromString(config.getENV());
		String url = EnvFactory.getBaseUrl(env);
		
		//open URL
		DriverFactory.getDriver().get(url);
		
	}
	
	@AfterMethod
	public void tearDown() {
		DriverFactory.quitDriver();
	}

}
