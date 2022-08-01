package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(Listener.class)
public class fiveTest{

    @Test(invocationCount = 2)
    void newTest(){
        System.out.println("This is new Test");
    }

    @Test(dataProvider = "getData")
    void setData(String uname,String pword){
        System.out.println(uname);
        System.out.println(pword);
    }

    @Test
    void newTest2(){
        System.out.println("This is new Test 2");
    }

    @DataProvider
    public Object[][] getData(){

        Object[][]  obj = new Object[3][2];
        obj[0][0] = "Username";
        obj[0][1] = "Password";

        obj[1][0] = "Username1";
        obj[1][1] = "Password1";

        obj[2][0] = "Username2";
        obj[2][1] = "Password2";
        return obj;
    }
}
