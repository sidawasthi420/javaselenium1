package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_window_handle {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver= new ChromeDriver();

        //driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS());        //Selenium 3.14
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        driver.manage().window().maximize();
        
        driver.get("https://qaplayground.com/practice/tabs-windows");

        String mainWindowHandle = driver.getWindowHandle();

        driver.findElement(By.id("tw-tab-c")).click();
 
        Set<String> windowHandles = driver.getWindowHandles();

        for(String handle : windowHandles)
        {
            if(!handle.equals(mainWindowHandle))
            {
                driver.switchTo().window(handle);
            }
        }

        String newTabLabel = driver.findElement(By.xpath("//nav[@aria-label='Breadcrumb']//following-sibling::div/h1")).getText();
        if(newTabLabel.contains("How to Handle Links in Selenium and Playwright"))
        {
            System.out.println("Switched to new Tab successfully");
        }
        else{
            System.out.println("Failed to switch to new Tab");
        }
        
        driver.close();

        driver.switchTo().window(mainWindowHandle);

        driver.close();
    }
}
