package selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_screenshot {

    public static void main(String[] args) throws InterruptedException, IOException {

        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://qaplayground.com/practice/tabs-windows");

        Thread.sleep(10000);

        TakesScreenshot screenshot = ((TakesScreenshot)driver);
        File screenshotFile = screenshot.getScreenshotAs(OutputType.FILE);

        File screenshotDestinationFile = new File(System.getProperty("user.dir")+ "\\screenshot1.jpg");

        FileUtils.copyFile(screenshotFile,screenshotDestinationFile);
        Thread.sleep(5000);

        driver.close();
    }
}
