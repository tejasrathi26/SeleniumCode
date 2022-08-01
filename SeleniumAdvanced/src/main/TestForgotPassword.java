package src.main;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestForgotPassword{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/");

        driver.findElement(By.xpath("//a[contains(@href,'sign_in')]")).click();
        driver.findElement(By.cssSelector("[href*=forgot_password]")).click();
    }
}
