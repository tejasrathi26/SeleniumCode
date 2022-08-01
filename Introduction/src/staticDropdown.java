import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class staticDropdown{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        /*
         Print default Currency Selected
         System.out.println(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).getText());
          Change Currency using Select Class
          Since Select class returns  web element we need to tell selenium where exactly the select class is present
        */
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        // Object for Select class needs to created same as we create for other classes

        Select dropdown = new Select(staticDropdown);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByIndex(2);
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByValue("USD");
        System.out.println(dropdown.getFirstSelectedOption().getText());
        dropdown.selectByVisibleText("AED");
        System.out.println(dropdown.getFirstSelectedOption().getText());





    }
}
