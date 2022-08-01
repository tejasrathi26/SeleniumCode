import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dynamicDropdown{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //Thread.sleep(2000);
        //driver.findElement(By.xpath("//a[@value='JDH']")).click();
        //driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).sendKeys("Jodhpur");
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR']//a[@value='JDH']")).click();
        Thread.sleep(1000);
        //driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
    }
}
