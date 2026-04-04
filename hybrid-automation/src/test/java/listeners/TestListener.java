package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        System.out.println(" LISTENER START : " + result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("PASS : " + result.getName());
    }

    @Override
    public void onTestFailure(ITestResult result) {
    	
    	System.out.println("FAIL : " +result.getName());
    	
    	try {
    		ScreenshotUtils.takeScreenshot(result.getName());
        //System.out.println("Screenshot saved at: " + "/hybrid-automation/screenshots");
    }catch (Exception e) {
    	System.out.println("Screenshot failed!");
    	e.printStackTrace();
    }
}
}