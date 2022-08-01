package TestNG;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ParallelTest{

    @Test
    void getTest(){
        System.out.println("It will execute parallel .......1");
        Assert.assertTrue(true);
    }

    @Test
    void getTest2(){
        System.out.println("It will execute parallel .......2");
        Assert.assertFalse(true);
    }

    @Test
    void getTest3(){
        System.out.println("It will execute parallel .......3");
        throw new SkipException("This is skip Exception");
    }

    @Test
    void getTest4(){
        System.out.println("It will execute parallel .......4");
    }
}
