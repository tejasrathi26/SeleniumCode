import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class scrollActions{

    public static void main(String[] args) throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,400)");
        Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");

        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum = 0;

        for(int i =0;i<values.size();i++){
            sum = sum + Integer.parseInt(values.get(i).getText());
        }
        System.out.println(sum);
        int totalAmount = Integer.parseInt(driver.findElement(By.className("totalAmount")).getText().split(":")[1].trim());
        System.out.println(totalAmount);
        Assert.assertEquals(sum,totalAmount);
    }
}
