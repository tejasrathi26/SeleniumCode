import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class brokenLinksHttpConnection{

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        // USing get attribute method store URl in string obj
        String url = driver.findElement(By.cssSelector("a[href*='brokenlink']")).getAttribute("href");

        //Create connection to HTTP server for getting response code
        HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
        conn.setRequestMethod("HEAD");
        conn.connect();

        System.out.println(conn.getResponseCode());
    }
}
