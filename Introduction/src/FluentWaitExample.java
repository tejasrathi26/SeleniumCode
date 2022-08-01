import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class FluentWaitExample{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Thread.sleep(2);
        driver.findElement(By.cssSelector("div[id='start'] button")).click();

        Wait<WebDriver> w = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(10)).pollingEvery(Duration.ofSeconds(2))
                .ignoring(NoSuchElementException.class);

        WebElement foo = w.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()){
                    return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                }
                else {
                    return null;
                }
            }
        });
        System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());


    }
}
  /*driver.findElement(By.cssSelector("button[class*=btn-success]")).click();
          driver.findElement(By.id("country")).sendKeys("ind");*/