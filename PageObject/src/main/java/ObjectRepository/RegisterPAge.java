package ObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class RegisterPAge{

    WebDriver driver;
    public RegisterPAge(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By emailId = By.id("userName");

    public WebElement setFirstName(){

        return driver.findElement(firstName);
    }

    public WebElement setLastName(){

        return driver.findElement(lastName);
    }

    public WebElement setPhone(){

        return driver.findElement(phone);
    }

    public WebElement setEmailId(){

        return driver.findElement(emailId);
    }


}
