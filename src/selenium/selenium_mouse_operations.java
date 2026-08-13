package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class selenium_mouse_operations {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://shivohamautomation.com/");

        Thread.sleep(5000);

        //cSSSelector with Class
        driver.findElement(By.cssSelector("span.close-arrow")).click();
        Thread.sleep(1000);

        WebElement onlineCourse = driver.findElement(By.xpath("//a[@href='courses.html' and @class='col-lg-3 col-sm-6 wow fadeInUp']"));
        WebElement courousalLeft = driver.findElement(By.xpath("//i[@class='bi bi-chevron-left']"));

        Actions builder = new Actions(driver);

        Action hoverOverOnlineCourse = builder.moveToElement(onlineCourse).build();
        hoverOverOnlineCourse.perform();
        Thread.sleep(3000);

        builder.moveToElement(courousalLeft).contextClick().build().perform();
        //Action hoverAndRightClickOnLeftCourasal = builder.moveToElement(courousalLeft).contextClick().build();
        //hoverAndRightClickOnLeftCourasal.perform();
        Thread.sleep(3000);

        driver.quit();
    }
}
