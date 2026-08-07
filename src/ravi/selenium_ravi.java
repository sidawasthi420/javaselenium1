package ravi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_ravi {
    public static void main(String st[]) throws InterruptedException{
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.chinooklumber.com/");
        String expectedTitle = "Chinook Lumber";
        String actualTitle = driver.getTitle();
        System.out.println(driver.getTitle());
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Website launched successfully");
        }
        else{
            System.out.println("Invalid page");
        }
        Thread.sleep(3000);
        driver.findElement(By.id("search")).isDisplayed();
        Thread.sleep(3000);
        driver.findElement(By.linkText("Careers")).click(); //selecting locator By.linktext()
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Contr")).click(); //selecting locator By.Partialinktext()
        Thread.sleep(3000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(2000);
        driver.findElements(By.name("email")).get(0).sendKeys("test@gmail.com"); //locator By.name();

        Thread.sleep(3000);

        js.executeScript("window.scrollTo(0,0)");

        Thread.sleep(2000);

        WebElement search = driver.findElement(By.id("search"));    //selecting locator By.id();
        search.clear();

        search.sendKeys("Decking");

        Thread.sleep(5000);

        driver.findElement(By.xpath("//span[contains(text(),'Deck2Wall')]")).click(); //selecting locator By.xpath()
    
        Thread.sleep(3000);
        driver.findElement(By.id("search")).sendKeys("lumber");
        // driver.findElements(By.className("action")).get(12).click();  //selecting locator By.className()
        List<WebElement> actions = driver.findElements(By.className("action"));  //selecting locator By.className()

        for (WebElement action : actions) {
            if (action.isDisplayed() && action.isEnabled()) {
                action.click();
                break;
            }
        }
        Thread.sleep(2000);
        List<WebElement> images = driver.findElements(By.tagName("img"));      //selecting locator By.TagName()

        System.out.println("This the size of the displayed images: " + images.size());

        Thread.sleep(3000);
        driver.findElement(By.linkText("Careers")).click(); //selecting locator By.linktext()
         Thread.sleep(3000);
         driver.findElement(By.cssSelector(".text")).click();  //selecting locator By css selector (using class)
         Thread.sleep(2000);
         driver.close();
    }
}