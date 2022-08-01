package Academy;

import Resources.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.ForgotPassword;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

import java.io.IOException;

public class HomePage extends Base {

    WebDriver driver;
    @BeforeTest
    public void initialize() throws IOException{
        driver = setupBrowser();
        //driver.manage().window().maximize();

    }

    @Test(dataProvider = "getData")
    public void homePageNavigation(String name,String password) throws InterruptedException {

        Thread.sleep(2000);
        driver.get(prop.getProperty("url"));
        LandingPage lp = new LandingPage(driver);
        LoginPage l = lp.loginButton();
        l.setEmailId().sendKeys(name);
        l.setPassword().sendKeys(password);
        l.setSubmit().click();
        //Assert.assertEquals("Your email or password is incorrect.",l.setValidateText().getText());
        ForgotPassword fp = l.forgotPassword();
        fp.getRecoveryEmailId().sendKeys("tjsrth48@gmail.com");
        fp.next().click();
    }

    @DataProvider
    public Object[][] getData(){
        Object[][] obj = new Object[2][2];

        obj[0][0] = "Tejas";
        obj[0][1] = "654321";

        obj[1][0] = "Rathi";
        obj[1][1] = "789654";
        return obj;
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
