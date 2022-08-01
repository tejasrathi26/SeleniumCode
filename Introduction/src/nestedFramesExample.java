import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedFramesExample{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/nested_frames");
        driver.manage().window().maximize();

        System.out.println(driver.findElements(By.tagName("frameset")).size());
        driver.switchTo().frame(0).switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.id("content")).getText());

    }
}
