package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPassword{

    WebDriver driver;
    public ForgotPassword(WebDriver driver){
        this.driver = driver;
    }

    private By recoveryEmailID = By.id("email");
    private By next = By.xpath("//input[@name='commit']");


    public WebElement getRecoveryEmailId(){
        return driver.findElement(recoveryEmailID);
    }

    public WebElement next(){
        return driver.findElement(next);
    }

}
