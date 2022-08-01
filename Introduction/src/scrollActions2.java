import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollActions2{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver= new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollTo(0,600)");
        //Scenario 1
        int rowCount = driver.findElements(By.cssSelector("[name='courses'] tr")).size();
        System.out.println(rowCount);
        //Scenario 2
        int columnCount = driver.findElements(By.cssSelector("[name='courses'] th")).size();
        System.out.println(columnCount);
        //Scenario 3
        System.out.println(driver.findElement(By.cssSelector("[name='courses'] tr:nth-child(3)")).getText());

    }
}
