import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamWithSeleniumExample3{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.cssSelector("[href='#/offers']")).click();

        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

        driver.findElement(By.id("search-field")).sendKeys("Rice");
        List<WebElement> products = driver.findElements(By.xpath("//tr/td[1]"));

        List<WebElement> filteredProduct = products.stream().filter(s->s.getText().contains("Rice")).collect(Collectors.toList());

        Assert.assertEquals(products.size(),filteredProduct.size());
    }
}
