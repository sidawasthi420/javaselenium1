package yashwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Locators{
    public static void main(String[] args) throws InterruptedException{

        //TypeCasting(Because WebDriver is an interface) - Creating object(Opening Chrome Browser)
        WebDriver driver = new ChromeDriver();

        //Navigating to the website by using ".get" method
        driver.get("https://practicetestautomation.com/practice/");

        //Delaying in code so that website can load properly
        Thread.sleep(3000);

        //Storing website title using "getTitle" method
        String webTitle = driver.getTitle();

        //Printing website title
        System.out.println(webTitle);

        //Pre-defined website title.
        String title = "Practice | Practice Test Automation";

        //Validating if website open successfully
        if(webTitle.equals(title)){

            //Printing successful message if website open
            System.out.println("Website opens Successfully");
        }
        else {
            
            //Printing Failure message if website failed to open
            System.out.println("Failed to open website");
        }

        //Accessing Test Login Page using "linkText" locator and clicking on it using ".click()" method
        driver.findElement(By.linkText(("Test Login Page"))).click();

        //Delaying to load the page successfully
        Thread.sleep(3000);

        //Validating if the Login Page open successfully
        //Accessing "Test login" header using "tagName" locator and returning boolean value using ".isDisplayed()" method
        if(driver.findElement(By.tagName("h2")).isDisplayed()){

            //Printing successful message if Login Page open
            System.out.println("Login Page open Successfully");
        }
        else {

            //Printing Failure message if Login Page failed to open
            System.out.println("Failed to open Login Page");
        }

        //Delaying to load the page successfully
        // Thread.sleep(2000);

        //Accessing the Username input by using "id" locator and sending value by using "sendKeys" method
        driver.findElement(By.id("username")).sendKeys("student");
        
        //Delaying to see the input
        Thread.sleep(2000);

        //Accessing the Password input by using "className" locator and sending value by using "sendKeys" method
        driver.findElement(By.name("password")).sendKeys("Password123");

        //Delaying to see the input
        Thread.sleep(4000);

        //Accessing Submit button using "linkText" locator and clicking on it using ".click()" method
        driver.findElement(By.className("btn")).click();

        //Delaying to load the page successfully
        Thread.sleep(3000);

        //Validating if Login successfully
        //Accessing "Logout" button by using "partialLinkText" locator and returning boolean value using ".isDisplayed()" method
        if(driver.findElement(By.partialLinkText("Log out")).isDisplayed()){

            //Printing Successful message if logout button found 
            System.out.println("Login Successfully");
        }
        else {
            
            //Printing Failure message if logout button not found 
            System.out.println("Login Failed");
        }

        driver.quit();
    }
}