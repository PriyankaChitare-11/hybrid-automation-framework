package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	private static ExtentReports extent;
	
	public static ExtentReports getInstance() {
		
		if(extent == null) {
			
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			
			String reportPath = System.getProperty("user.dir")

					+ "/reports/extent-report_" + timestamp + ".html";
			
			ExtentSparkReporter reporter = 
					new ExtentSparkReporter(reportPath);
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
					
		}
		return extent;
	}

}
