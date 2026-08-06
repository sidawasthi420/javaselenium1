package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium1 {

    public static void main(String[] args) {
        
         WebDriver driver= new ChromeDriver();
         driver.get("https://shivohamautomation.com/");
         
         String expectedTitle = "Shivoham Automation Expert - Consultancy Services";

         Thread.sleep(5000);

         String actualTitle = driver.getTitle();

         //System.out.println(actualTitle);
         ///System.exit(0);/// it will terminate the programme

        if(actualTitle.equals(expectedTitle)){
               System.out.println("Website opened successfully");
        }
        else   {
                System.out.println("Website not opened successfully");      
        }

        Thread.sleep(5000);

        //Login button click
        driver.findElement(By.className("btn-primary")).click();   ///By.className("btn-primary") ------- Locator 

        Thread.sleep(5000);

        //Home page logo click
        driver.findElement(By.className("navbar-brand")).click();
        
        Thread.sleep(3000);

        //Close icon click for popover
        driver.findElement(By.id("close-popup")).click();
        
        Thread.sleep(3000);

        //Click on Skilled Instructor
        //driver.findElement(By.name("skilled-instructors")).click();

        //Thread.sleep(3000);

        //Click on Enhanced Learning
        driver.findElement(By.tagName("he5")).click();

        
        Thread.sleep(10000);

        //Course Overview webelement need to get visible on web page
        driver.findElement(By.linkText("Course Overview")).isDisplayed();  //org.openqa.selenium.NoSuchElementException
        // driver.close();// currently opened window
        driver.quit();/// closes all window
    }
}
