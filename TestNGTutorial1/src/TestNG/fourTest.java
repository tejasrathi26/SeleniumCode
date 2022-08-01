package TestNG;

import org.testng.Assert;
import org.testng.annotations.*;

public class fourTest{

    @Test//(dependsOnGroups = {"Smoke"})
    void packageTest()
    {
        System.out.println("This is Package Test");
    }

    @Test(groups = {"Smoke"})
    void mobileApp()
    {
        System.out.println("This is Mobile App");
        //Assert.assertFalse(true);
    }

    @Test
    public void test1(){
        System.out.println("Hello");
    }

    @BeforeClass
    void beforeClass()
    {
        System.out.println("It will execute before class executes");
    }

    @AfterClass
    void afterClass(){
        System.out.println("It will execute After class executes......");
    }

    @BeforeGroups("Smoke")
    void beforeGroups(){
        System.out.println("This will execute before group.....");
    }


    @AfterGroups("Smoke")
    void afterGroup(){
        System.out.println("This will execute After group");
    }
}
