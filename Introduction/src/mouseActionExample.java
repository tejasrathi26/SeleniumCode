import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class mouseActionExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();

        WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
        Actions act = new Actions(driver);
        act.moveToElement(move).build().perform();
        act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
    }
}
