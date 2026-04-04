package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.nio.file.Files;
import driver.DriverFactory;

public class ScreenshotUtils {
	
	public static String takeScreenshot(String testName) {
		
		try {
			
			if(DriverFactory.getDriver() == null) {
				
				throw new RuntimeException("Driver is NULL during screenshot");
			}
			
			File directory = new File("screenshots");
			
			if(!directory.exists()) {
				
			  directory.mkdir();
			}
			
			File src = ((TakesScreenshot) DriverFactory.getDriver())
					
					.getScreenshotAs(OutputType.FILE);
			
			String path = "screenshots/" + testName + ".png";
			
			Files.copy(src.toPath(), new File(path).toPath());
			
			System.out.println("Screenshot saved at : " + path);
			
			return path;
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Screenshot failed");
		}
	}

}
