package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_cssSelector {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();
        driver.get("https://shivohamautomation.com/");

        Thread.sleep(10000);

        //cSSSelector with Class
        driver.findElement(By.cssSelector("span.close-arrow")).click();
        Thread.sleep(3000);

        //cSSSelector with ID
        driver.findElement(By.cssSelector("h5#onln-class")).click();
        Thread.sleep(2000);

        //cSSSelector with SubString - prefix
        String titleOfPage = driver.findElement(By.cssSelector("h1[class^='display-3']")).getText();

        if(titleOfPage.equals("Courses"))
        {
            System.out.println("Courses page opened successfully");
        }
        else{
            System.out.println("Courses page not found");
        }

        //org.openqa.selenium.InvalidSelectorException: Compound class names not permitted
        //driver.findElement(By.className("text-center wow fadeInUp courses categories")).isDisplayed();
        driver.findElement(By.cssSelector("div[class='text-center wow fadeInUp courses categories']")).isDisplayed();
        Thread.sleep(2000);

        //cSSSelector with SubString - suffix
        driver.findElement(By.cssSelector("div[class$='popular courses']")).isDisplayed();
        Thread.sleep(2000);

        //cSSSelector with SubString - matching substring
        driver.findElement(By.cssSelector("div[class*='fadeInUp courses']")).isDisplayed();
        // driver.close();// currently opened window
        driver.quit();/// closes all window
    }
}
