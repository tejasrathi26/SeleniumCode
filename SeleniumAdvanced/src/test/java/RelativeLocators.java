import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators{

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","D://ChromeDriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/angularpractice/");

        // To find Label name using Above Locator
        WebElement emailEditBox = driver.findElement(By.name("email"));
        System.out.println(driver.findElement(with(By.tagName("label")).above(emailEditBox)).getText());

        // To enter password using below locator
        WebElement pwdTextBox = driver.findElement(By.cssSelector("label[for='exampleInputPassword1']"));
        driver.findElement(with(By.tagName("input")).below(emailEditBox)).sendKeys("tejasRathi");

        //To click on Radio button using toleft locator
        WebElement clickRadioButton = driver.findElement(By.cssSelector("label[for='inlineRadio1']"));
        driver.findElement(with(By.tagName("input")).toLeftOf(clickRadioButton)).click();

        //To gRab the text present to the right of checkbox
        WebElement iceCreamText = driver.findElement(By.id("exampleCheck1"));
        System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(iceCreamText)).getText().split("you")[1].trim());
    }
}
