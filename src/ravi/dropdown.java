package ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

    public static void main(String st[]) throws InterruptedException{   //Select drop down from options
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaplayground.com/practice/dropdowns");
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        String expectedTitle = "How to Handle Dropdowns in Selenium and Playwright | QA Playground | QA Playground";

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Page launched successfully");

        }else{
            System.out.print("Page fails to load");
        }

        Thread.sleep(3000);

        Select drop1 = new Select(driver.findElement(By.id("fruitSelect")));
        drop1.selectByIndex(1);    //Select drop down from index

        Thread.sleep(2000);

        System.out.println("Code executed successfully");

        driver.quit();

    }
}