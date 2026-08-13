package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_radio_checkbox_options {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://proleed.academy/exercises/selenium/automation-practice-form-with-radio-button-check-boxes-and-drop-down.php");

        Thread.sleep(5000);

        //Iterate over radio buttons
        List<WebElement> accountTypeRadioButton = driver.findElements(By.name("accounttype"));
        
        for(int i=0; i<accountTypeRadioButton.size();i++)
        {
            accountTypeRadioButton.get(i).click();
            Thread.sleep(2000);
        }

        // for(WebElement ref:accountTypeRadioButton)
        // {
        //     ref.click();
        //     Thread.sleep(2000);
        // }

        // //First option i.e. Saving
        // accountTypeRadioButton.get(0).click();
        // Thread.sleep(2000);

        //  //First option i.e. Saving
        // accountTypeRadioButton.get(1).click();
        // Thread.sleep(2000);

        //  //First option i.e. Saving
        // accountTypeRadioButton.get(2).click();
        // Thread.sleep(2000);


        //Iterate over checkboxes
        List<WebElement> idTypeCheckbox = driver.findElements(By.name("identity_type[]"));
        for(int i=0; i<idTypeCheckbox.size();i++)
        {
            idTypeCheckbox.get(i).click();
            Thread.sleep(2000);
        }

        driver.quit();
    }
}
