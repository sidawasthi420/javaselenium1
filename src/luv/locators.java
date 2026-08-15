package luv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class locators {
public static void main(String[]args) throws Exception
{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
  Thread.sleep(2000);
    //driver.findElement(By.className("a-button-text")).click();
  ///Thread.sleep(2000);
  driver.findElement(By.className("nav-line-1-container")).click();
 Thread.sleep(2000);
  driver.findElement(By.id("ap_email_login")).sendKeys("9910858927");
  Thread.sleep(2000);
  driver.findElement(By.id("continue")).click();
  driver.findElement(By.id("auth-fpp-link-bottom")).click();
  Thread.sleep(2000);
  driver.findElement(By.name("signIn")).click();
  Thread.sleep(2000);
  driver.findElement(By.tagName("select")).click();
  Thread.sleep(2000);
  driver.findElement(By.className("a-link-nav-icon")).click();
  Thread.sleep(2000);
  driver.findElement(By.cssSelector("span.hm-icon-label")).click();



  driver.close();
}
}


