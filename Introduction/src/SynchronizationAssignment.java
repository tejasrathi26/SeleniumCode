import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class SynchronizationAssignment{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.rahulshettyacademy.com/loginpagePractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
        driver.findElement(By.name("password")).sendKeys("learning");
        driver.findElement(By.xpath("//input[@value='user']")).click();

        WebDriverWait wt = new WebDriverWait(driver,Duration.ofSeconds(2));
        wt.until(ExpectedConditions.elementToBeClickable(By.id("okayBtn")));

        driver.findElement(By.id("okayBtn")).click();

        WebElement staticDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
        Select dropDownItem = new Select(staticDropDown);
        dropDownItem.selectByVisibleText("Consultant");
        System.out.println(dropDownItem.getFirstSelectedOption().getText());

        driver.findElement(By.id("terms")).click();
        driver.findElement(By.id("signInBtn")).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[class*='btn-info']")));

        List<WebElement> cartItems = driver.findElements(By.cssSelector("h4[class='card-title']"));
        List items = Arrays.asList(cartItems);

        for (int i = 0; i<cartItems.size(); i++) {
            if (items.contains(cartItems)) {
                driver.findElements(By.cssSelector("button[class*='btn-info']")).get(i).click();
            }
        }
  /*for (int i = 0; i<cartItems.size(); i++) {
            cartItems.get(i).click();
        }*/

        driver.findElement(By.xpath("//a[contains(@class,'btn-primary')]")).click();

    }
}
