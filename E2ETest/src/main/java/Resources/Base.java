package Resources;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class Base{

    public Properties prop;
    public WebDriver driver;

    public WebDriver setupBrowser() throws IOException {

        prop = new Properties();
        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");

        prop.load(fis);

       // String browserName = System.getProperty("browser");
        String browserName = prop.getProperty("browser");
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("start-maximized");
            options.addArguments("headless");
            driver = new ChromeDriver(options);

        }
        else if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if(browserName.equals("edge")){
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        return driver;
    }

    public String getScreenshot(String testCaseName, WebDriver driver) throws IOException {

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        String destinationFile = System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
        FileUtils.copyFile(src, new File(destinationFile));
        return destinationFile;


    }
}
