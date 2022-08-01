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

import java.io.IOException;

public class Listeners extends Base implements ITestListener{

   // ExtentTest test;
    //ExtentReports extent = ExtentReportObject.reports();
    @Override
    public void onTestStart(ITestResult iTestResult) {
        System.out.println("onTestStart");
        //ExtentTest test = extent.createTest(iTestResult.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
       // test.log(Status.PASS,"Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        WebDriver driver = null;

       // test.fail(iTestResult.getThrowable());
        String testMethodName = iTestResult.getMethod().getMethodName();

        try {
            driver = (WebDriver) iTestResult.getTestClass().getRealClass().getDeclaredField("driver").get(iTestResult.getInstance());
        } catch (Exception e){

        }
        try {
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
        System.out.println("onTestFailedButWithinSuccessPercentage");
    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        System.out.println("onFinish");

    }
}
