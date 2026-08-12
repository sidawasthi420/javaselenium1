package yashwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testing_Xpath {

    public static void main(String[] args) throws InterruptedException {

        //TypeCasting(Because WebDriver is an interface) - Creating object(Opening Chrome Browser)
        WebDriver driver = new ChromeDriver();

        //Navigating to the website by using ".get" method
        driver.get("https://practicetestautomation.com/practice-test-login/");

        //Delaying in code so that website can load properly
        Thread.sleep(3000);

        //1) Absolute XPath - Starting from the root node using a single forward slash (/)
        if (driver.findElement(By.xpath("/html/body/div[1]/div/section/section/h2")).isDisplayed()) {
            System.out.println("Absolute XPath worked Successfully");
        } else {
            System.out.println("Absolute XPath Failed");
        }

        //2) Relative XPath - Starting from anywhere in the DOM using double forward slash (//)
        if (driver.findElement(By.xpath("//section[@id='login']/h2")).isDisplayed()) {
            System.out.println("Relative XPath worked Successfully");
        } else {
            System.out.println("Relative XPath Failed");
        }

        //3) Basic XPath - Using tagName with attribute and attribute value
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("student");

        //4) contains() - Matching a part of an attribute value
        driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("Password123");

        //5) AND - Both conditions must be true
        if (driver.findElement(By.xpath("//input[@id='username' and @name='username']")).isDisplayed()) {
            System.out.println("AND XPath worked Successfully");
        } else {
            System.out.println("AND XPath Failed");
        }

        //6) OR - Any one of the conditions can be true
        if (driver.findElement(By.xpath("//input[@id='username' or @name='password']")).isDisplayed()) {
            System.out.println("OR XPath worked Successfully");
        } else {
            System.out.println("OR XPath Failed");
        }

        //7) starts-with() - Matching the beginning of an attribute value
        if (driver.findElement(By.xpath("//input[starts-with(@name,'user')]")).isDisplayed()) {
            System.out.println("starts-with() XPath worked Successfully");
        } else {
            System.out.println("starts-with() XPath Failed");
        }

        //8) text() - Matching the exact visible text of an element
        if (driver.findElement(By.xpath("//h2[text()='Test login']")).isDisplayed()) {
            System.out.println("text() XPath worked Successfully");
        } else {
            System.out.println("text() XPath Failed");
        }

        //9) following axis - Selecting an element that comes after the current element
        if (driver.findElement(By.xpath("//label[@for='username']/following::input[@id='username']")).isDisplayed()) {
            System.out.println("following axis worked Successfully");
        } else {
            System.out.println("following axis Failed");
        }

        //10) preceding axis - Selecting an element that comes before the current element
        if (driver.findElement(By.xpath("//input[@id='password']/preceding::label[@for='password']")).isDisplayed()) {
            System.out.println("preceding axis worked Successfully");
        } else {
            System.out.println("preceding axis Failed");
        }

        //11) child axis - Selecting a direct child of the current element
        if (driver.findElement(By.xpath("//div[@id='form']/div[1]/child::input[@id='username']")).isDisplayed()) {
            System.out.println("child axis worked Successfully");
        } else {
            System.out.println("child axis Failed");
        }

        //12) following-sibling axis - Selecting the sibling that comes after the current element
        if (driver.findElement(By.xpath("//div[@id='form']/div[1]/following-sibling::div[1]/input[@id='password']")).isDisplayed()) {
            System.out.println("following-sibling axis worked Successfully");
        } else {
            System.out.println("following-sibling axis Failed");
        }

        //13) preceding-sibling axis - Selecting the sibling that comes before the current element
        if (driver.findElement(By.xpath("//div[@id='form']/div[2]/preceding-sibling::div[1]/input[@id='username']")).isDisplayed()) {
            System.out.println("preceding-sibling axis worked Successfully");
        } else {
            System.out.println("preceding-sibling axis Failed");
        }

        //14) Using basic XPath to click on Submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

        //Delaying to load the page successfully
        Thread.sleep(3000);

        driver.quit();
    }
}