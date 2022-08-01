package Tasty;

import org.junit.*;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@FixMethodOrder(MethodSorters.JVM)
@Ignore
public class JunitTest{

    @BeforeClass
    public static void setup(){
        System.out.println("This will execute once before class");
    }

    @Before
    public void testmethod(){
        System.out.println("It will execute before every test");
    }


    @After
    public void testmethod2(){
        System.out.println("It will execute after every test");
    }

    @Test
    public void TestA(){
        System.out.println("This is test A");
    }

    @Test
    public void TestC(){
        System.out.println("This is test C");

    }

    @Test
    public void TestB(){
        System.out.println("This is test B");
    }

    @Test
    public void seleniumTest(){
        System.out.println("This is Selenium test");

    }


    @Test
    public void APITest(){
        System.out.println("This is RestApi test");
    }

    @AfterClass
    public static void tearDown(){
        System.out.println("This is teardown and will execute after class");

    }

}
