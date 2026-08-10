package mukul;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Selenium1 {
    public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver();        //type casting
       driver.get("https://www.shivohamautomation.com/");

       String expectedTitle = "Shivoham Automation Expert - Consultancy Services";

       Thread.sleep(5000);
       String actualTitle = driver.getTitle();
       
       
       System.out.println(actualTitle);

       if (actualTitle.equals(expectedTitle)) {
           System.out.println("Test Passed!");
       } else {
           System.out.println("Test Failed!");
       }
       
       Thread.sleep(5000);
       WebElement Element = driver.findElement(By.className("btn-primary"));
       Element.click();

       Thread.sleep(5000);

       driver.findElement(By.className("navbar-brand")).click();

       Thread.sleep(5000);
       
       driver.findElement(By.id("close-popup")).click();

       Thread.sleep(5000);
       driver.quit();   //  close the browser window

     //  driver.close();
    }
}


