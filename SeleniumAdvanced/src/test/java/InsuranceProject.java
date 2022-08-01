import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class InsuranceProject{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.guru99.com/insurance/v1/index.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[text()='Register']")).click();

        WebElement dropDown = driver.findElement(By.id("user_title"));
        Select staticDropDown = new Select(dropDown);
        staticDropDown.selectByVisibleText("Miss");

        driver.findElement(By.id("user_firstname")).sendKeys("Alexa");
        driver.findElement(By.id("user_surname")).sendKeys("Roger");
        driver.findElement(By.name("phone")).sendKeys("7457579448");

        driver.findElement(By.name("year")).sendKeys("1995");
        driver.findElement(By.name("month")).sendKeys("November");
        driver.findElement(By.name("date")).sendKeys("18");

        driver.findElement(By.xpath("//input[@value='Provisional']")).click();
        driver.findElement(By.id("user_licenceperiod")).sendKeys("2");
        driver.findElement(By.id("user_occupation_id")).sendKeys("Engineer");

        driver.findElement(By.name("street")).sendKeys("Guruwar Peth");
        driver.findElement(By.name("city")).sendKeys("Karad");
        driver.findElement(By.name("county")).sendKeys("India");

        driver.findElement(By.name("post_code")).sendKeys("415110");
        driver.findElement(By.name("email")).sendKeys("tjsrth48@gmail.com");
        driver.findElement(By.name("password")).sendKeys("123456");
        driver.findElement(By.name("c_password")).sendKeys("123456");
        driver.findElement(By.name("submit")).click();

    }
}
