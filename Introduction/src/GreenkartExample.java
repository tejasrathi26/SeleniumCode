import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GreenkartExample{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));

        for(int i = 0;i<products.size();i++){
            String productName = products.get(i).getText();
            if(productName.contains("Cucumber")){
                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
                break;
            }
        }

    }
}
