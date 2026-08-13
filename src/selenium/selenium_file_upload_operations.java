package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium_file_upload_operations {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://qaplayground.com/practice/file-upload");

        Thread.sleep(5000);

        WebElement chooseFile = driver.findElement(By.xpath("//input[@id='fu-single-input']"));
        //Thread.sleep(5000);
        
        chooseFile.sendKeys("C:\\Users\\Siddhant\\Downloads\\Playwright Cheat Sheet.pdf");

        Thread.sleep(5000);

        driver.quit();
    }
}
