package ravi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class fileUpload {
    public static void main(String st[]) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaplayground.com/practice/file-upload");
        
        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);

        Thread.sleep(3000);

        WebElement chooseFile = driver.findElement(By.xpath("//input[@type='file']"));

        chooseFile.sendKeys("C:\\Users\\ravi.raj\\Documents\\Lightshot\\Code executed.png");

        Thread.sleep(3000);

        driver.quit();
    }
}