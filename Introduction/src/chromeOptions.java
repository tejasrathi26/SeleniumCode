import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

public class chromeOptions {

    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.setAcceptInsecureCerts(true);
        options.addArguments("start-maximized");

        //For Timeout or wait
        //options.setImplicitWaitTimeout(Duration.ofSeconds(1));

        //Another method to run script in headless mode
        /*options.setHeadless(true);*/

        //For adding extension to chrome
        /*options.addExtensions(new File("X://extension_3_40_1_0.crx"));*/

        //Different methods in chromeoptions class
        /* System.out.println(options.getBrowserName());
        System.out.println(options.getBrowserVersion());
        System.out.println(options.getPlatformName());
        System.out.println(options.getClass());*/

        //For running TC or script in incognito window use below
        /*options.addArguments("--incognito");*/

        //For running the browser in headless mode
        /*options.addArguments("--headless");*/

        //For Blocking unnecessary popup use below chrome option method
        /*options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));*/

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://expired.badssl.com/");
        System.out.println(driver.getTitle());

        //TakeScreenshot

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("D://Screenshot.png"));



    }
}
