import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CalenderEventsAssignment2{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[text()=' Mumbai (BOM)']")).click();
        //Explicit wait
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']")));

        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR']/descendant::a[@text='Delhi (DEL)']")).click();

        while (!driver.findElement(By.className("ui-datepicker-title")).getText().contains("June")){
            driver.findElement(By.cssSelector(".ui-datepicker-next.ui-corner-all")).click();
        }

        List<WebElement> dates = driver.findElements(By.className("ui-state-default"));
        int count = driver.findElements(By.className("ui-state-default")).size();
        for (int i =0; i<count;i++){
            String selectDate = dates.get(i).getText();
            if(selectDate.equalsIgnoreCase("15")){
                dates.get(i).click();
                break;
            }
        }
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int j =1;j<4;j++){
            driver.findElement(By.id("hrefIncAdt")).click();
            Thread.sleep(1000);
        }
        int k = 0;
        while(k<2){
            driver.findElement(By.id("hrefIncChd")).click();
            k++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println( driver.findElement(By.id("divpaxinfo")).getText());

        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();

        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropDown = new Select(staticDropdown);
        dropDown.selectByValue("AED");
    }
}
