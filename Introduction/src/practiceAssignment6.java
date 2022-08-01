import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class practiceAssignment6{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver =new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.id("checkBoxOption3")).click();
        String text = driver.findElement(By.xpath("//label[@for='honda']")).getText();

        driver.findElement(By.name("dropdown-class-example")).click();
        WebElement dropDown = driver.findElement(By.name("dropdown-class-example"));
        Select staticDropdown = new Select(dropDown);
        staticDropdown.selectByVisibleText(text);

        driver.findElement(By.cssSelector("#name")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        String[] alertText = driver.switchTo().alert().getText().split(",")[0].split(" ");
        System.out.println(alertText[1]);
        Assert.assertEquals(text, alertText[1]);
        driver.switchTo().alert().accept();
    }
}
