import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Iterator;
import java.util.Set;

public class windowHandlingAssignment{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");
        driver.findElement(By.linkText("Click Here")).click();

        Set<String> win = driver.getWindowHandles();
        Iterator<String> it = win.iterator();
        String parentWin = it.next();
        String childWin = it.next();

        driver.switchTo().window(childWin);
        System.out.println(driver.findElement(By.tagName("h3")).getText());
        driver.switchTo().window(parentWin);
        System.out.println(driver.findElement(By.tagName("h3")).getText());

    }
}
