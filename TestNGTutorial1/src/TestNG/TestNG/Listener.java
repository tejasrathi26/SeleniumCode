package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener implements ITestListener{

        public void onTestStart(ITestResult result){
            System.out.println("It will execute on start");
        }

        public void onStart(ITestContext context){
            System.out.println("It will execute on start123");
        }

        public void onFinish(ITestContext context){
            System.out.println("It will execute on fin");
        }

    public void onTestSuccess(ITestResult result){
        System.out.println("It will execute on test success");
    }

    public void onTestSkipped(ITestResult result){
        System.out.println("It will execute on test skip");
    }

    public void onTestFailure(ITestResult result){
        System.out.println("It will execute on test failure");
    }
/*
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

    }*/
}
