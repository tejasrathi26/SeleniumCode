package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersTest{

    @Test
    @Parameters({"URL","Pword"})
    void setData(String url, String password){
        System.out.println("Set Data 1 ......");
        System.out.println(url);
        System.out.println(password);
    }

    @Test(dataProvider ="loginData",dataProviderClass = TestNG.CustomeDataProvider.class)
    void setData2(String id, String pwd){
        System.out.println("Set Data 2 ......");
        System.out.println(id+"  "+pwd);
    }


}
