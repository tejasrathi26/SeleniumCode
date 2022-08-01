import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class interviewPractice{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();
        //1. Find number of links present on webpage
        System.out.println(driver.findElements(By.tagName("a")).size());

        //2. find number of links present on footer of page
        WebElement footer = driver.findElement(By.id("gf-BIG"));
        System.out.println(footer.findElements(By.tagName("a")).size());

        //3. To find number of links present under 1st column of footer

        //WebElement subFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]"));
        //WebElement subFooter = driver.findElement(By.xpath("//div[@id='gf-BIG']/descendant::td[1]/ul"));
        WebElement subFooter = footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(subFooter.findElements(By.tagName("a")).size());

        //4. Click on each link in the 1st column
        for(int i =1; i<subFooter.findElements(By.tagName("a")).size();i++){

            String clickOnTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            subFooter.findElements(By.tagName("a")).get(i).sendKeys(clickOnTab);
            Thread.sleep(2000);
        }
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> it = windows.iterator();

        while (it.hasNext()){
            driver.switchTo().window(it.next());
            System.out.println(driver.getTitle());
        }
    }
}
