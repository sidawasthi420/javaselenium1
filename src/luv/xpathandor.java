package luv;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class xpathandor {
    public static void main(String[] args) throws InterruptedException {
      
    WebDriver driver = new ChromeDriver();
    driver.get("https://www.flipkart.com/");
    Thread.sleep(2000);

    /////xpath using AND
    driver.findElement(By.xpath("//span[@role='button' and  @class='b3wTlE']")).click();
    Thread.sleep(2000);
    
   driver.findElement(By.cssSelector("img[src='https://static-assets-web.flixcart.com/apex-static/images/svgs/L1Nav/mobiles.svg']")).click();
Thread.sleep(2000);

//////xpath using or
driver.findElement(By.xpath("//div[@dir = 'auto' or @class='css-146c3p1 r']")).click();
Thread.sleep(2000);

/////xpath by text
driver.findElement(By.xpath("//div[text()='Food & Health']")).click();
Thread.sleep(2000);

///xpath using or
driver.findElement(By.xpath("//span[@class='v1zwn27' or @style='color:#333333ff']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//a[text()='New to Flipkart? Create an account']")).click();
Thread.sleep(2000);

driver.close();

driver.get("https://www.facebook.com/reg/?entry_point=login&next=");
}}