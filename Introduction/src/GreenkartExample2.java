import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class GreenkartExample2{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        String[] items = {"Cucumber","Brocolli","Carrot","Beans"};
        // Convert array to arraylist

        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
        List itemsNeeded = Arrays.asList(items);

        for(int i = 0;i<products.size();i++){

            String[] productName = products.get(i).getText().split("-");
            String veggies = productName[0].trim();

            int j = 0;
            if(itemsNeeded.contains(veggies)){
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

                if (j==items.length) {
                    break;
                }
            }
        }

    }
}
