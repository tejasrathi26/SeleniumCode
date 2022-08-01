package Academy;

import Resources.Base;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.LandingPage;

import java.io.IOException;


public class ValidateTitle extends Base{
    WebDriver driver;

    @BeforeTest
    public void initialize() throws IOException {
        driver = setupBrowser();
        driver.get(prop.getProperty("url"));
        //driver.manage().window().maximize();
    }

    @Test
    public void homePageTitle() throws IOException {

        LandingPage lp = new LandingPage(driver);
        String actualText = lp.getTitle().getText();
        Assert.assertEquals(actualText,"Featured Courses11");

    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }
}
