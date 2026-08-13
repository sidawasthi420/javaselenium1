package ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chinook_project {
    public static void main(String st[]) throws InterruptedException{ 

        ////xpath practise for selecting locators 
        // And & OR
        // Starts-with xpath
        // text() function
        // following 
        // Preceding
        // Descendant:locator
        // FindElements

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chinooklumber.com/");
        String expectedTitle = "Chinook Lumber";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Website launched successfully");
        }
        else{
            System.out.println("Invalid page");
        }
        Thread.sleep(3000); 

       driver.findElement(By.xpath("//input[@id='search' and @type = 'text']")).sendKeys("ladder"); //slecting locator BY "And" xpath

       Thread.sleep(2000);

       driver.findElement(By.xpath("//*[@class='action search' or @type = 'submit']")).click(); //slecting locator BY "OR" xpath

       Thread.sleep(5000);

       driver.findElement(By.xpath("(//div[starts-with(@class,'overflow-hidden')])[2]")).click();  //slecting locator BY "starts-with" xpath

       Thread.sleep(2000);

       driver.findElement(By.xpath("//div[@class ='product-add-form']//following::input[@id='add']")).click(); //slecting locator BY "following" xpath

       Thread.sleep(2000);

       driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();     //slecting locator BY "text()" xpath

       Thread.sleep(3000);

       driver.findElement(By.xpath("//a[text()='View Cart']")).click();

       Thread.sleep(3000);

       driver.findElement(By.xpath("(//button[@type='submit']//preceding::button[@type='button'])[1]")).click();

       System.out.println("All the Test cases Executed");

        driver.quit();

}

}
