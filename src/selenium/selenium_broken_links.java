package selenium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selenium_broken_links {


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
                //System.out.println(urlString + " ----- " + httpConnection.getResponseMessage() + " ------ Valid URL"); 
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
        
        driver.get("https://demoqa.com/broken");

        Thread.sleep(10000);

        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total available links on page:- " + allLinks.size());

        for(WebElement we : allLinks)
        {
           String url = we.getAttribute("href"); 
           verifyLinks(url);
        }
        driver.quit();
    }
}
