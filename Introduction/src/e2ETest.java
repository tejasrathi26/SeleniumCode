import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class e2ETest{

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='BOM']")).click();
        //Thread.sleep(2000);
       // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
        driver.findElement(By.xpath("//div[contains(@class,'group-first')]/descendant::td[contains(@class,'ui-datepicker-today')]/a")).click();
        ////a[@class='ui-state-default ui-state-highlight ui-state-active']
        if (driver.findElement(By.id("Div1")).getAttribute("style").contains("0.5")){

            System.out.println("It's Disabled");
            Assert.assertTrue(true);
        }
        else {
            Assert.assertTrue(false);
        }
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        for(int i =1;i<5;i++){

            driver.findElement(By.id("hrefIncAdt")).click();
        }
        int j=0;
        while (j<2){
            driver.findElement(By.id("hrefIncChd")).click();
            j++;
        }
        driver.findElement(By.id("btnclosepaxoption")).click();
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
        Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult, 2 Child");

        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select dropdownOption = new Select(staticDropdown);
        dropdownOption.selectByValue("USD");
        System.out.println(dropdownOption.getFirstSelectedOption().getText());
        dropdownOption.selectByVisibleText("INR");
        System.out.println(dropdownOption.getFirstSelectedOption().getText());
        driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();

    }
}
