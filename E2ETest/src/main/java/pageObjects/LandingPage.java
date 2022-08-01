package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage{

    WebDriver driver;

    public LandingPage(WebDriver driver){
        this.driver = driver;
    }

    private By title = By.xpath("//h2[text()='Featured Courses']");
    private By loginButton = By.xpath("//a[contains(@href,'sign_in')]");

    public LoginPage loginButton(){
        driver.findElement(loginButton).click();
        LoginPage l = new LoginPage(driver);
        return l;
    }

    public WebElement getTitle(){
        return driver.findElement(title);
    }
}
