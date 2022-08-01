import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class calenderEventsAssignment{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.path2usa.com/travel-companions");
        driver.manage().window().maximize();
        driver.findElement(By.id("travel_date")).click();
        //For selecting current date
        /*driver.findElement(By.cssSelector("[class='datepicker-days'] [class='active day']")).click();*/

        while(!driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='datepicker-switch']")).getText().contains("May")){
            driver.findElement(By.cssSelector("div[class='datepicker-days'] th[class='next']")).click();
        }

        List<WebElement> dates = driver.findElements(By.className("day"));
        int count = driver.findElements(By.className("day")).size();

        for(int i =0;i<count;i++){
            String selectDate = dates.get(i).getText();
            if(selectDate.equalsIgnoreCase("14")){
                dates.get(i).click();
                break;
            }
        }

    }
}
