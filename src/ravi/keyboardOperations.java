package ravi;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class keyboardOperations {
    public static void main(String st[]) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        WebElement emailbox = driver.findElement(By.name("email"));
        Actions builder = new Actions(driver);
        builder.moveToElement(emailbox).click().keyDown(Keys.SHIFT).sendKeys("raviraj").keyUp(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).keyDown(Keys.TAB).keyUp(Keys.TAB).keyUp(Keys.TAB).keyDown(Keys.ENTER).build().perform();
        Thread.sleep(3000);
        builder.dragAndDrop(emailbox, emailbox).build().perform();
        driver.quit();
    }
}