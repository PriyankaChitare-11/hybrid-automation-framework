package driver;
import enums.BrowserType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static void initDriver(BrowserType browser) {
    	
    	switch (browser) {
    	
    	case CHROME :
    		driver.set(new ChromeDriver());
    		break;
    		
    	case EDGE :
    		driver.set(new EdgeDriver());
    		break;
    		
    	case FIREFOX :
    		 driver.set(new FirefoxDriver());
    		  break;
    
    	default:
    		throw new RuntimeException("Invalid browser:" + browser);
    	}
    }

    public static WebDriver getDriver() {
    	return driver.get();
    }
    
    public static void quitDriver() {
        driver.get().quit();
        driver.remove();
    }
}