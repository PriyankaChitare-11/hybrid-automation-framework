package utils;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.nio.file.Files;
import driver.DriverFactory;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

	public static String takeScreenshot(String testName) {

		try {

			File directory = new File("screenshots");
			if (!directory.exists()) {
				directory.mkdir();
			}

			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());

			String path = System.getProperty("user.dir") + "/screenshots/" + testName + "_" + timestamp + ".png";

			File src = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);

			Files.copy(src.toPath(), new File(path).toPath());

			System.out.println("Screenshot saved at : " + path);

			return path;

		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Screenshot failed");
		}
	}

}
