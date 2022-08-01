package TestNG;

import org.testng.annotations.*;

public class secondTest{

    @Test(dependsOnMethods = {"logout"})
    void login()
    {
        System.out.println("Login");
    }

    @Test(timeOut = 4000)
    void logout()
    {
        System.out.println("Logout");
    }

    @Test(priority = 3)
    void mobileTest(){
        System.out.println("This is mobile test");
    }

    @BeforeTest
    void beforeTest(){
        System.out.println("Before test executes");
    }

    @AfterTest
    void afterTest(){
        System.out.println("After test executes......");
    }

    @BeforeSuite
    void beforeSuite(){
        System.out.println("Before Suite executes");
    }

    @AfterSuite
    void AfterSuite(){
        System.out.println("After Suite executes...........");
    }
}
