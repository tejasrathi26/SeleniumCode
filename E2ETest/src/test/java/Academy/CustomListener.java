package Academy;

import Resources.Base;
import Resources.ExtentReportObject;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.reporters.*;

import java.io.IOException;

public class CustomListener extends Base implements ITestListener{

    ExtentTest test;
    ExtentReports extent = ExtentReportObject.reports();
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("onTestStart");
        test = extent.createTest(iTestResult.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        extentTest.get().log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

        extentTest.get().fail(iTestResult.getThrowable());
        WebDriver driver = null;
        String testMethodName = iTestResult.getMethod().getMethodName();

        try {
            driver = (WebDriver) iTestResult.getTestClass().getRealClass().getDeclaredField("driver").get(iTestResult.getInstance());
        } catch (Exception e){

        }
        try {
            extentTest.get().addScreenCaptureFromPath(getScreenshot(testMethodName,driver),iTestResult.getMethod().getMethodName());
            getScreenshot(testMethodName,driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {
        System.out.println("onTestSkipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onStart(ITestContext iTestContext) {
        System.out.println("Test Started");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish");
        extent.flush();
    }
}

