import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class WindowinNewTab{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://rahulshettyacademy.com/angularpractice/#");
        driver.switchTo().newWindow(WindowType.TAB);
        //driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> childWindow = driver.getWindowHandles();
        Iterator<String> it = childWindow.iterator();
        String parentWin = it.next();
        String childWin = it.next();

        driver.get("https://rahulshettyacademy.com/#/index");
        String text = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
        driver.switchTo().window(parentWin);
        driver.findElement(By.name("name")).sendKeys(text);
    }
}
