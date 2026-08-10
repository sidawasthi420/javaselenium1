package yashwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Css_selector{
public static void main(String[] args) throws InterruptedException{

    //TypeCasting(Because WebDriver is an interface) - Creating object(Opening Chrome Browser)
    WebDriver driver = new ChromeDriver();

    //Navigating to the website by using ".get" method
    driver.get("https://practicetestautomation.com/");

    //Delaying in code so that website can load properly
    Thread.sleep(3000);

    //Storing website title using "getTitle" method
    String webTitle = driver.getTitle();

    //Printing website title
    System.out.println(webTitle);

    //Pre-defined website title.
    String title = "Practice Test Automation | Learn Selenium WebDriver";

    //Validating if website open successfully
    if(webTitle.equals(title)){

        //Printing successful message if website opens
        System.out.println("Website opens Successfully");
    }
    else {
        
        //Printing Failure message if website failed to open
        System.out.println("Failed to open website");
    }

    //Opening Practice Page using "cssSelector" locator with suffix selector and clicking on it using ".click()" method
    driver.findElement(By.cssSelector("a[href$='/practice/']")).click();

    //Delaying to load the page successfully
    Thread.sleep(3000);

    //Validating if the Practice Page opens successfully
    //Accessing "Practice" heading using "cssSelector" locator with class selector and returning boolean value using ".isDisplayed()" method
    if (driver.findElement(By.cssSelector("h1.post-title")).isDisplayed()) {
        System.out.println("Practice Page opened Successfully");
    } else {
    System.out.println("Failed to open Practice Page");
    }

    //Opening Test Login Page using "cssSelector" locator with substring selector and clicking on it using ".click()" method
    driver.findElement(By.cssSelector("a[href*='practice-test-login']")).click();

    //Delaying to load the page successfully
    Thread.sleep(3000);

    //Validating if the Test Login Page opens successfully
    //Accessing Login section using "cssSelector" locator with ID selector and returning boolean value using ".isDisplayed()" method
    if (driver.findElement(By.cssSelector("section#login")).isDisplayed()) {
        System.out.println("Test Login Page opened Successfully");
    } else {
        System.out.println("Failed to open Test Login Page");
    }

    //Accessing the Username input by using "cssSelector" locator with attribute selector and sending value by using "sendKeys" method
    driver.findElement(By.cssSelector("input[name='username']")).sendKeys("student");

    //Accessing the Password input by using "cssSelector" locator with prefix selector and sending value by using "sendKeys" method
    driver.findElement(By.cssSelector("input[name^='pass']")).sendKeys("Password123");

    //Accessing Submit button by using "cssSelector" locator with attribute selector and clicking on it using ".click()" method
    driver.findElement(By.cssSelector("button[id='submit']")).click();

    //Delaying to load the page successfully
    Thread.sleep(3000);

    //Validating if login is successful
    //Accessing "Logged In Successfully" heading using "cssSelector" locator with class selector and returning boolean value using ".isDisplayed()" method
    if (driver.findElement(By.cssSelector("h1.post-title")).isDisplayed()) {
        System.out.println("Login Successfully");
    } else {
        System.out.println("Login Failed");
    }

    driver.quit();
}
}