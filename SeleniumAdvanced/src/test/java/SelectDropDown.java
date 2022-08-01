import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectDropDown{

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();
        System.out.println(driver.manage().window().getSize());
        Dimension dim = new Dimension(1280,945);
        driver.manage().window().setSize(dim);

        //driver.findElement();
        //Select dd = new Select();
        driver.manage().coo

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("")));

        driver.findElement(By.id("dropdown-class-example")).click();

        WebElement staticDropDown = driver.findElement(By.id("dropdown-class-example"));
        Select dropDown = new Select(staticDropDown);
        //dropDown.selectByValue("option2");
        //dropDown.selectByIndex(3);
        dropDown.selectByVisibleText("Option1");

    }
}
