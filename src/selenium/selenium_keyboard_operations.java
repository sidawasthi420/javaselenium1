package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_keyboard_operations {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://www.facebook.com/login.php/");

        Thread.sleep(5000);

        WebElement emailInputBox = driver.findElement(By.name("email"));
        //Thread.sleep(5000);
        
        //WebElement passwordInputBox = driver.findElement(By.name("pass"));
        //Thread.sleep(5000);

        //WebElement loginButton = driver.findElement(By.xpath("(//*[text()='Log in'])[2]"));
        //Thread.sleep(5000);

        Actions builder = new Actions(driver);

        builder.moveToElement(emailInputBox).click()
        .keyDown(Keys.SHIFT).sendKeys("siddhantawasthi").keyUp(Keys.SHIFT)
        .keyDown(Keys.TAB).keyUp(Keys.TAB).sendKeys("siddhantawasthi").keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER)
        .keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).build().perform();
        Thread.sleep(5000);


         builder.dragAndDrop(emailInputBox,emailInputBox).build().perform();

        driver.quit();
    }
}
