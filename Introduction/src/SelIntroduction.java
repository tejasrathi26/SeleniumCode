import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelIntroduction {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D://ChromeDriver/chromedriver.exe");
        //Invoking Browser
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        //driver.close();

    }
}
