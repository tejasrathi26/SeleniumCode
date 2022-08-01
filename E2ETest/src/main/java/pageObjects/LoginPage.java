package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{

    WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }


    private By emailId = By.id("email");
    private By password = By.name("password");
    private By submit = By.cssSelector("input[name='commit']");
    private By validateText = By.xpath("//div[contains(text(),'Your email or password is incorrect.')]");
    private By forgotPassword = By.cssSelector("[href*=forgot_password]");



    public WebElement setEmailId(){
        return driver.findElement(emailId);
    }

    public WebElement setPassword(){
        return driver.findElement(password);
    }

    public WebElement setSubmit(){
        return driver.findElement(submit);
    }

    public WebElement setValidateText(){
        return driver.findElement(validateText);
    }

    public ForgotPassword forgotPassword() throws InterruptedException {
        driver.findElement(forgotPassword).click();
        Thread.sleep(2000);
        return new ForgotPassword(driver);
    }
}
