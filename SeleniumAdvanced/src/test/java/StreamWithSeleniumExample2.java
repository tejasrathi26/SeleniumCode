import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamWithSeleniumExample2{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.linkText("Top Deals")).click();
        
        Set<String> window = driver.getWindowHandles();
        Iterator<String> it = window.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);

        driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
        List<String> price;
        do
        {
            List<WebElement> elementList = driver.findElements(By.xpath("//tr/td[1]"));
            price = elementList.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVegPrice(s))
                    .collect(Collectors.toList());
            price.forEach(s -> System.out.println(s));
            if (price.size() < 1) {
                driver.findElement(By.cssSelector("a[aria-label='Next']")).click();
            }
        }while (price.size()<1);
    }

    private static String getVegPrice(WebElement s) {
        String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
        return priceValue;
    }
}
