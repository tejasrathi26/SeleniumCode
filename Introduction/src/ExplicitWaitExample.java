import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class ExplicitWaitExample {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        String[] items = {"Cucumber","Brocolli","Carrot","Beans"};
        // Convert array to arraylist
        addItems(driver,items);

        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoCode")));
        driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(".promoBtn")));
        driver.findElement(By.cssSelector(".promoBtn")).click();


    }
    public static void addItems(WebDriver driver,String[] items){

        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
        List itemsNeeded = Arrays.asList(items);
        for(int i = 0;i<products.size();i++){

            String[] productName = products.get(i).getText().split("-");
            String veggies = productName[0].trim();
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
