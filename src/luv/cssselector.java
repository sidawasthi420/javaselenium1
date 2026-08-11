package luv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssselector {
public static void main(String[]args) throws Exception
{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.amazon.in/");
  Thread.sleep(2000);
    //driver.findElement(By.className("a-button-text")).click();
  //Thread.sleep(2000);

  ////class css selector
  driver.findElement(By.cssSelector("span.hm-icon-label")).click();
Thread.sleep(2000);
////id css selector
driver.findElement(By.cssSelector("div#hmenu-close-icon")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[href='/fresh?ref_=nav_cs_fresh']")).click();
Thread.sleep(2000);
driver.findElement(By.cssSelector("a[class^='a-link-normal']")).click();

///attribute css selector
// ////location
//driver.findElement(By.cssSelector("span[id='glow-ingress-line2']")).click();
//Thread.sleep(2000);



  //driver.findElement(By.className("nav-line-1-container")).click();
  driver.findElement(By.id("ap_email_login")).sendKeys("9910858927");
  //Thread.sleep(2000);
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
