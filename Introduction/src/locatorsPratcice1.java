import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static java.lang.Thread.sleep;

public class locatorsPratcice1{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Tejas");
        driver.findElement(By.name("inputPassword")).sendKeys("Rathi123");
        driver.findElement(By.className("signInBtn")).submit();
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Tejas");
        driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("tejas@rsa.com");
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).clear();
        driver.findElement(By.xpath("//form/input[@placeholder='Email']")).sendKeys("tejas@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9587447856");
        driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
        //driver.findElement(By.className("reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.cssSelector("button[class*='login-btn']")).click();
        // -Xpath - Using Regular Expression //*[contains(@class,'login-btn')] - for above element
        Thread.sleep(1000);
        driver.findElement(By.id("inputUsername")).sendKeys("Tejas");
        driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
        // - //div[@class='form-container sign-in-container']/form/input[2]
        // - //div[contains(@class,'sign-in-container')]/form/input[2]
        driver.findElement(By.cssSelector("#chkboxOne")).click();
        driver.findElement(By.xpath("//*[contains(@class,'signInBtn')]")).click();

    }
}
