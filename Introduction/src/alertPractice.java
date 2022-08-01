import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class alertPractice {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String text = "Tejas";
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();

        driver.findElement(By.xpath("//input[@class='inputs']")).sendKeys(text);
        driver.findElement(By.id("confirmbtn")).click();
       //System.out.println(driver.switchTo().alert().getText());
        String alertText = driver.switchTo().alert().getText();
        String[] alertArray = alertText.split("Hello ");
        String alertNew[] = alertArray[1].split(",");
        System.out.println(alertNew[0]);
        driver.switchTo().alert().dismiss();

    }
}
