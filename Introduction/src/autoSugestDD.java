import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class autoSugestDD{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("am");
        driver.switchTo().alert().accept();

        Thread.sleep(3000);
        List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item']"));

        for (WebElement option : options){

            if (option.getText().equalsIgnoreCase("Cameroon")){
                option.click();
                break;
            }
        }
        System.out.println(driver.findElements(By.cssSelector("li[class='ui-menu-item']")).size());
    }
}
