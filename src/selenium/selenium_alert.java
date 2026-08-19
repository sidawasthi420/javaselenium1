package selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_alert {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://testautomationcentral.com/demo/alerts.html");

        Thread.sleep(10000);

        driver.findElement(By.xpath("//button[@onClick='showAlert()']")).click();
        Thread.sleep(3000);

        Alert alert = driver.switchTo().alert();
        String alert1Message = alert.getText();
        if(alert1Message.contains("This is an alert!")){
            System.out.println("Switched to Alert 1 successfully");
        }
        alert.accept();
        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[text()='Prompt']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@onClick='showPrompt()']")).click();
        Thread.sleep(3000);

        Alert alert2 = driver.switchTo().alert();
        String alert1Message2 = alert2.getText();
        Thread.sleep(3000);
        if(alert1Message2.contains("Please enter something:")){
            System.out.println("Switched to Alert 2 successfully");
        }

        alert2.sendKeys("Siddhant Awasthi");
        Thread.sleep(3000);
        
        alert2.dismiss();
        Thread.sleep(3000);

        String promptCancelMessage = driver.findElement(By.id("prompt-message")).getText();
        if(promptCancelMessage.equals("Prompt was cancelled")){
            System.out.println("Prompt cancelled successfully");
        }

        driver.findElement(By.xpath("//button[text()='Confirm']")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//button[@onClick='showConfirm()']")).click();
        Thread.sleep(3000);

        Alert alert3 = driver.switchTo().alert();
        String alert1Message3 = alert3.getText();
        Thread.sleep(3000);
        if(alert1Message3.contains("Do you confirm this action?")){
            System.out.println("Switched to Alert 3 successfully");
        }
        alert3.accept();
        Thread.sleep(3000);

        String confirmMessage2 = driver.findElement(By.id("confirm-message")).getText();
        if(confirmMessage2.equals("Confirmed")){
            System.out.println("Prompt accepted successfully");
        }

        driver.quit();
    }
}
