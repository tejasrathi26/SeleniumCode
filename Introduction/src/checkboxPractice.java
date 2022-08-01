import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class checkboxPractice{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        Assert.assertFalse(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).click();
        Assert.assertTrue(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        //System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$chk_SeniorCitizenDiscount']")).isSelected());
        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
        driver.close();

    }
}
