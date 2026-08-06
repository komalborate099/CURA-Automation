package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.openqa.selenium.WebDriver;
import base.BaseTest;
import utils.ScreenshotUtil;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import reports.ExtentManager;

public class TestListener implements ITestListener {

    ExtentReports extent = ExtentManager.getReport();

    ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        System.out.println("Execution Started");
    }


    @Override
    public void onTestStart(ITestResult result) {

        test = extent.createTest(result.getName());

        System.out.println(result.getName() + " Started");
    }


    @Override
    public void onTestSuccess(ITestResult result) {

        test.pass("Test Passed");

        System.out.println(result.getName() + " Passed");
    }


    @Override
    public void onTestFailure(ITestResult result) {

        test.fail(result.getThrowable());

        WebDriver driver = BaseTest.driver;

        String screenshotPath = ScreenshotUtil.captureScreenshot(driver, result.getName());

        try {
        	test.addScreenCaptureFromPath(screenshotPath, "Failure Screenshot");
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(result.getName() + " Failed");
    }


    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println("Execution Finished");
    }
}