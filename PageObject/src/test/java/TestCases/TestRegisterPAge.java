package TestCases;

import ObjectRepository.RegisterPAge;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestRegisterPAge{

    @Test
    public void registerPage(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        RegisterPAge rp = new RegisterPAge(driver);
        rp.setFirstName().sendKeys("Tejas");
        rp.setLastName().sendKeys("Rathi");
        rp.setEmailId().sendKeys("tjsrth48@gmail.com");
        rp.setPhone().sendKeys("123456");
    }
}
