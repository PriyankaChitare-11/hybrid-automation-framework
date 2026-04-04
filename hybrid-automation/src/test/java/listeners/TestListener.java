package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.ExtentManager;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {
	
	ExtentReports extent = ExtentManager.getInstance();
	ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
    	ExtentTest extentTest = extent.createTest(result.getName());
        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test Passed ");
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	
    	String path = ScreenshotUtils.takeScreenshot(result.getName());
    	
    	test.get().fail("Test Failed ");
    	test.get().fail(result.getThrowable());
    	
    	// Attach Screenshot
    	test.get().addScreenCaptureFromPath(path);
      
}
    @Override
    public void onFinish(org.testng.ITestContext context) {
    	extent.flush();
    }
}