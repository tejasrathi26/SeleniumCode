import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class staticDropdown2{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        driver.findElement(By.id("divpaxinfo")).click();
        // To add 5 adults using while  or for loop
       /*
        for(int i =1;i<5;i++)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
        } */
        //Same using while loop
        int i = 1;
        while (i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        for (int j=0;j<2;j++)
        {
            driver.findElement(By.id("hrefIncChd")).click();
        }
        int k= 0;
        do {
            driver.findElement(By.id("hrefIncInf")).click();
            k++;
        }while (k<1);
        driver.findElement(By.xpath("//input[@value='Done']")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
    }
}
