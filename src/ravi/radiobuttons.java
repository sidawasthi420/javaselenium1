package ravi;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class radiobuttons{
    public static void main(String st[]) throws InterruptedException{      //Checkbox Group — Select All using for each loop and for loop
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://qaplayground.com/practice/radio-checkbox");

        String expectedTitle = "How to Handle Radio Buttons and Checkboxes in Selenium and Playwright | QA Playground";

        String actualTitle = driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Page launched Successfully");

        }else{
            System.out.println("Page fails to load");
        }

        Thread.sleep(2000);

        WebElement element = driver.findElement(By.xpath("(//span[text()='Scenario 4: Assert Checked / Unchecked State'])[1]"));

           Actions actions = new Actions(driver);

           actions.scrollToElement(element).perform();

           Thread.sleep(2000);

        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox' and @name='skills']"));

        for(WebElement ref : checkboxes){ //Checkbox Group — Select All using for each loop
           if(!ref.isSelected()){          //If checkbox is NOT selected, then click

            ref.click();
           }
        }

        Thread.sleep(3000);

        WebElement element1 = driver.findElement(By.xpath("(//span[text()='Scenario 7: Scoped Card Controls (Medium)'])[1]"));

           Actions actions1 = new Actions(driver);

           actions1.scrollToElement(element1).perform();

           Thread.sleep(2000);

            List<WebElement> checkboxes2 = driver.findElements(By.xpath("//input[@type='checkbox' and starts-with(@name,'notif_')]"));

              for(int i= 0;i<checkboxes2.size();i++){ //Checkbox Group — Select All using for loop
               checkboxes2.get(i).click();

               Thread.sleep(2000);
           }

            System.out.println("Code Executed Successfully");

            driver.quit();
        }
    
    }