package mukul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sauce-demo.myshopify.com/");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("shirts");

        Thread.sleep(3000);
         driver.findElement(By.cssSelector("input#search-submit")).click();
         Thread.sleep(3000);
        driver.quit();
    }
}