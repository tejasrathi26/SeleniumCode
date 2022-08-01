import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class BrokenLink{

    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get
        /*driver.findElement(By.id("opentab")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);*/
        List<WebElement> links = driver.findElements(By.cssSelector("[class=gf-li] a"));
        //System.out.println(links);
        SoftAssert as = new SoftAssert();
        for(WebElement link :links){
           // String title = Keys.chord(Keys.CONTROL,Keys.ENTER);
            String url = link.getAttribute("href");
            HttpURLConnection conn = (HttpURLConnection)new URL(url).openConnection();
            conn.setRequestMethod("HEAD");
            conn.connect();
            int RespCode = conn.getResponseCode();
            System.out.println(RespCode);
            as.assertTrue(RespCode<400,"The Link "+ url + " has response code "+RespCode);
        }
        as.assertAll();
    }
}
