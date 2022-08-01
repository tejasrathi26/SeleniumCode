import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class windowHandlesExample{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();
        driver.getWindowHandles().iterator();
        driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material")).click();
        Set<String> windows = driver.getWindowHandles();

        Iterator<String> it = windows.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        Thread.sleep(2000);
        //driver.findElement(By.cssSelector(".im-para.red")).getText();

        String[] text = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ");

        driver.switchTo().window(parentWindow);
        driver.findElement(By.id("username")).sendKeys(text[0]);
        System.out.println(text[0]);


    }
}
