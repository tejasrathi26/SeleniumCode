package qaclickacademy;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExtentReport{

    ExtentReports extent;

    @BeforeTest
    public void config(){
        String path = System.getProperty("user.dir")+"\\reports\\index.html";
        ExtentSparkReporter report = new ExtentSparkReporter(path);
        report.config().setReportName("Web Automation Result");
        report.config().setDocumentTitle("Test Results");
        report.config().setTheme(Theme.STANDARD);
        extent = new ExtentReports();
        extent.attachReporter(report);

    }

    @Test
    public void extentReportTest(){

        extent.createTest("extentReportTest");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        System.out.println(driver.getTitle());
        extent.flush();

    }

}
