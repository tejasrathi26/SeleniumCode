import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.*;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class brokenLinkHttpConnection3{

    // Using for each method to iterate
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        List<WebElement> links = driver.findElements(By.cssSelector("[class=gf-li] a"));
        SoftAssert a = new SoftAssert();
        for (WebElement link : links){

            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int respCode = conn.getResponseCode();
            System.out.println(respCode);
            a.assertTrue(respCode<400,"The Link "+ url + " has response code "+respCode);
        }
        a.assertAll();
    }
}
