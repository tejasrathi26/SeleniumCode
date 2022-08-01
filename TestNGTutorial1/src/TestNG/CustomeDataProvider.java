package TestNG;

import org.testng.annotations.DataProvider;

public class CustomeDataProvider{

    @DataProvider(name="loginData")
    public Object[][] getData(){
        Object[][] obj = {{"xyz@gmail.com","xyz"},{"abc@gmail.com","abc"},{"def@gmail.com","def"}};
        return obj;
    }
}
