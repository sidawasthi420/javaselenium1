package tariq;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Home work :- Create an automation code-- -wheremore than 2 tabs exists and try to switch on third tab 

public class selenium_window_handle_3tab {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://qaplayground.com/practice/tabs-windows");

        Thread.sleep(3000);

        // current focus
        String mainWindowHandle = driver.getWindowHandle();
        Thread.sleep(1000);

        // click tab b
        driver.findElement(By.id("tw-tab-b")).click();
        Thread.sleep(3000);

        // click tab c
        driver.findElement(By.id("tw-tab-c")).click();
        Thread.sleep(3000);

        String tabB_URL = "https://qaplayground.com/practice";
        String tabC_URL = "https://qaplayground.com/practice/links";

        Set<String> windowHandles = driver.getWindowHandles();

        for (String handle : windowHandles) {
            if (!handle.equals(mainWindowHandle)) {
                driver.switchTo().window(handle);
                if (driver.getCurrentUrl().equals(tabB_URL)) {
                    break;
                }
            }
        }

        System.out.println(driver.getCurrentUrl());

        WebElement inputFieldsOnTab_B = driver.findElement(By.xpath("//h3[text()='Input Fields']"));
        inputFieldsOnTab_B.click();

    //    WebElement homeButtonOnTab_C = driver.findElement(By.id("link-internal-home"));
    //    homeButtonOnTab_C.click();

    }
}