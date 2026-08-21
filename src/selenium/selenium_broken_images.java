package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_broken_images {


    public static void verifyLinks(String urlString){
        try{
             URL url = new URL(urlString);
             HttpURLConnection httpConnection = (HttpURLConnection)url.openConnection();
             httpConnection.setConnectTimeout(5000);
             httpConnection.connect();

             if(httpConnection.getResponseCode() >= 400)
             {
                System.out.println(urlString + " ----- " + httpConnection.getResponseMessage() + " ------ Broken URL");
             }
             else{
                System.out.println(urlString + " ----- " + httpConnection.getResponseMessage() + " ------ Valid URL"); 
             }
             
             httpConnection.disconnect();
        }
        catch(Exception ex)
        {
            System.out.println("Invalid URL");
        }  
    }

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://shivohamautomation.com/");

        Thread.sleep(10000);

        List<WebElement> allLinks = driver.findElements(By.tagName("img"));
        System.out.println("Total available links on page:- " + allLinks.size());

        for(WebElement we : allLinks)
        {
           String url = we.getAttribute("src"); 
           verifyLinks(url);
           try{
                boolean imageDisplayed = (Boolean) ((JavascriptExecutor)driver).executeScript("return (typeof arguments[0].naturalWidth !=\"undefined\" && arguments[0].naturalWidth > 0);", we);
                
                if(imageDisplayed)
                {
                    System.out.println("Images Display :- Passed");
                }
                else{
                    System.out.println("Images Display :- Failed");
                }
           }
           catch(Exception ex)
           {
                System.out.println("Issue with the code");
           }
        }
        driver.quit();
    }
}
