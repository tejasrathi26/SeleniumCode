package TestNG;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class firstTest{

    @Test
    @Parameters({"URL"})
    public void test1(String urlName)
    {
        System.out.println("Hello");
        System.out.println(urlName);
    }

    @Test(enabled = false)
    public void login(){
        System.out.println("Logging In");
    }

    @Test
    public void setUp(){
        System.out.println("Setup");
        //Assert.assertFalse(true);
    }

    @Test(groups = {"Smoke"})
    public void tearDown(){
        System.out.println("Close Browser");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }
}
