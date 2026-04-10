package base;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import driver.DriverFactory;
import enums.BrowserType;
import enums.Environment;
import env.EnvFactory;
import utils.ConfigReaderUtility;

public class BaseTest {
	
	ConfigReaderUtility config = new ConfigReaderUtility();
	
	@BeforeMethod
	@Parameters({"browser","env"})
	public void setup(String browser, String env) {
		
		  //Convert String into Enum
        BrowserType browserType = BrowserType.fromString(browser);
        Environment environment = Environment.fromString(env);
        
		DriverFactory.initDriver(browserType); // dynamic browser
		
		String url = EnvFactory.getUrl(environment); // dynamic env
		
		DriverFactory.getDriver().get(url);	
		
		System.out.println("Thread: " + Thread.currentThread().getId() 
				+ "| Browser : " + browser 
				+ "| Env : " + env);
	}
	
	@AfterMethod
	public void tearDown(ITestResult result) {
		DriverFactory.quitDriver();
	}

}
