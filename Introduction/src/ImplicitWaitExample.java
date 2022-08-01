import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWaitExample{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        //Implicit Wait - 5 sec
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] items = {"Cucumber","Brocolli","Carrot","Beans"};
        // Convert array to arraylist
        addItems(driver,items);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

    }
    public static void addItems(WebDriver driver,String[] items){
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
        for(int i = 0;i<products.size();i++){


            String[] productName = products.get(i).getText().split("-");
            String veggies = productName[0].trim();

            List itemsNeeded = Arrays.asList(items);
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
