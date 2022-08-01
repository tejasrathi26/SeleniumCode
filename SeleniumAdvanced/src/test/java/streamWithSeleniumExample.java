import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
//import org.testng.Assert;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class streamWithSeleniumExample{

    public static void main(String[] args) throws IOException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver(options);

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        driver.findElement(By.xpath("//a[text()='Top Deals']")).click();

        Set<String> childWindow = driver.getWindowHandles();
        Iterator<String> it = childWindow.iterator();
        String parentWin = it.next();
        String childWin = it.next();
        driver.switchTo().window(childWin);

        // Pseudo Code - Click on WebTable column
        driver.findElement(By.xpath("//span[text()='Veg/fruit name']")).click();
        // Grab the elements into the list
        List<WebElement> veggies = driver.findElements(By.xpath("//tr/td[1]"));
        //  original list
        List<String> originalList = veggies.stream().map(s -> s.getText()).collect(Collectors.toList());

        //Sort the List
        List<String> sortedList = originalList.stream().sorted().collect(Collectors.toList());

        //Compare both the list
       // Assert.assertEquals(originalList, sortedList);
      //  Assert.assertTrue(originalList.equals(sortedList));
        Assert.assertEquals(originalList, sortedList);
        Assert.assertTrue(originalList.equals(sortedList));

        // Interview Q - TC Get me the price of Beans from the table
        List<String> price = veggies.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggiePrice(s)).collect(Collectors.toList());
        price.forEach(s-> System.out.println(s));

        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("D://Screenshot1.png"));
    }
        private static String getVeggiePrice(WebElement s) {
            String priceValue = s.findElement(By.xpath("following-sibling::td[1]")).getText();
            return priceValue;
        }

}
