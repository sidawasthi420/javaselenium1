package mukul;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class Selenium2 {

    public static void main(String[] args)throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://sauce-demo.myshopify.com/");
        String expectedTitle = "Sauce Demo";
        Thread.sleep(3000);
        String actualTitle = driver.getTitle();

        if (actualTitle.equals(expectedTitle)) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
        }

       Thread.sleep(3000);


        driver.findElement(By.id("customer_login_link")).click();

        driver.findElement(By.id("customer_email")).sendKeys("mukulvarshney7071@gmail.com");
        driver.findElement(By.id("customer_password")).sendKeys("mukulvarshney@123");
               Thread.sleep(3000);

        driver.findElement(By.className("checkout")).click();

        driver.findElement(By.linkText("Home")).click();

               Thread.sleep(3000);

        driver.findElement(By.partialLinkText("Grey j")).click();

        driver.findElement(By.id("add")).click();
        driver.findElement(By.name("q")).sendKeys("shirts");
        driver.findElement(By.cssSelector("input#search-submit")).click();
        
        driver.findElement(By.cssSelector("a[id*='tomer_login_li']")).click();
    
        driver.findElement(By.cssSelector("input[id^='customer_em']")).sendKeys("mukulvarshney7071@gmail.com");
       
                driver.findElement(By.cssSelector("input[id$='omer_password']")).sendKeys("mukul varshney");

        driver.quit();   //  close the browser window
    }gi
}