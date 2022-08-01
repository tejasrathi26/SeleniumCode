package Tasty;

import org.testng.annotations.*;

public class TestNGConfirmation{

    @BeforeTest
    public void beforeTest(){
        System.out.println("This is a Before Test ");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("This is a After Test ");
    }

    @Test
    public void testCase1(){
        System.out.println("This is a test method 1");
    }

    @Test
    public void testCase2(){
        System.out.println("This is a test method 2");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is a Before method ");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("This is a After method ");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("This is a Before class ");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("This is a After class ");
    }

}
