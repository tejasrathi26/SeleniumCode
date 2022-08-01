package TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class thirdTest{

    @Test
    @Parameters({"URL"})
    void mobileLoginIn(String name)
    {
        System.out.println("This is Mobile Login");
        System.out.println(name);
       // Assert.assertTrue(false);
    }

    @Test(groups = {"Smoke"})
    void mobileLoginOut()
    {
        System.out.println("This is Mobile Logout");
    }

    @Test
    void mobileSignup()
    {
        System.out.println("This is Mobile Signup");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }
}
