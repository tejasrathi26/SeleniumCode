package Resources;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportObject{

    static ExtentReports extent;

    public static ExtentReports reports() {

        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        ExtentSparkReporter report = new ExtentSparkReporter(path);
        report.config().setReportName("Web Automation Results");
        report.config().setDocumentTitle("Test Results");
        extent = new ExtentReports();
        extent.attachReporter(report);

        return extent;
    }
}
