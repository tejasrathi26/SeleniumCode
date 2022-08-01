import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.testng.asserts.SoftAssert;

import java.util.List;

public class Assignment8{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("autocomplete")).sendKeys("ind");
        Thread.sleep(3000);
        /*List<WebElement> country = driver.findElements(By.className("ui-menu-item"));

        for (WebElement option : country) {

            if (option.getText().equalsIgnoreCase("United States (USA)")) {
                option.click();
                break;
            }
        }*/

        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        driver.findElement(By.id("autocomplete")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.id("autocomplete")).getAttribute("value"));


    }
}

