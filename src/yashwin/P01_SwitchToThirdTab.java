package yashwin;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_SwitchToThirdTab {

    public static void main(String[] args) throws InterruptedException {

        // Creating ChromeDriver object
        WebDriver driver = new ChromeDriver();

        // Opening a first webpage
        driver.get("https://qaplayground.com/practice/tabs-windows");

        // Waiting for the page to load
        Thread.sleep(2000);

        //Opening the first window
        driver.findElement(By.id("tw-tab-a")).click();
        
        //Opening the second window
        driver.findElement(By.id("tw-tab-b")).click();

        // Getting all available window handles
        Set<String> windowHandles = driver.getWindowHandles();

        // Converting Set into List
        List<String> tabs = new ArrayList<>(windowHandles);

        // Checking whether at least 3 tabs exist
        if (tabs.size() >= 3) {

            // Switching to the third tab
            driver.switchTo().window(tabs.get(2));

            System.out.println("Switched to third tab successfully.");

            // Printing the title of third tab
            System.out.println("Third tab title: " + driver.getTitle());

        } else {
            System.out.println("Less than 3 tabs are available.");
        }

        // Waiting for the page to load
        Thread.sleep(4000);

        // Closing browser
        driver.quit();
    }
}