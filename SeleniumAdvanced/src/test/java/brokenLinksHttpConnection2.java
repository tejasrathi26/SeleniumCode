import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class brokenLinksHttpConnection2{

    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);
    

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        SoftAssert sa = new SoftAssert();
        List<WebElement> links = driver.findElements(By.cssSelector("[class='gf-li'] a"));
        int s = driver.findElements(By.cssSelector("[class='gf-li'] a")).size();
        System.out.println(s);
        Iterator<WebElement> it = links.iterator();

        while(it.hasNext()){

            String url = it.next().getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            sa.assertTrue(respCode<400,"The Link "+ url + " has response code "+respCode);
        }
        sa.assertAll();
    }
}
