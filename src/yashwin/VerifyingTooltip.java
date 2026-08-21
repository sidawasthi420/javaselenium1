package yashwin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyingTooltip {
    public static void main(String[] args) throws InterruptedException{
        
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

        Thread.sleep(2000);

        String title = "Please provide your firstname.";

        String tooltip = driver.findElement(By.id("firstname")).getAttribute("title");

        if(tooltip.equals(title)){
            System.out.println("Tooltip verified successfully ");
        }
        else {
            System.out.println("Tooltip verification failed ");

        }

        Thread.sleep(2000);

        driver.quit();
    }
}
