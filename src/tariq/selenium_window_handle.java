package selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_window_handle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://qaplayground.com/practice/tabs-windows");

        Thread.sleep(10000);

        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(1000);

        driver.findElement(By.id("tw-tab-c")).click();
        Thread.sleep(3000);

        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle : windowHandles)
        {
            if(!handle.equals(mainWindowHandle))
            {
                driver.switchTo().window(handle);
            }
        }
        Thread.sleep(3000);

        String newTabLabel = driver.findElement(By.xpath("//nav[@aria-label='Breadcrumb']//following-sibling::div/h1")).getText();
        if(newTabLabel.contains("How to Handle Links in Selenium and Playwright"))
        {
            System.out.println("Switched to new Tab successfully");
        }
        else{
            System.out.println("Failed to switch to new Tab");
        }
        
        driver.close();
        Thread.sleep(3000);

        driver.switchTo().window(mainWindowHandle);
        Thread.sleep(3000);

        driver.close();
    }
}
