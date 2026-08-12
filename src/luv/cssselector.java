package luv;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class cssselector {
public static void main(String[]args) throws Exception
{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  Thread.sleep(2000);
///class css selector
  driver.findElement(By.cssSelector("span.b3wTlE")).click();
  Thread.sleep(2000);
////class css selector
driver.findElement(By.cssSelector("span.v1zwn27")).click();
  Thread.sleep(2000);

 //class css selector 
driver.findElement(By.cssSelector("a.nYcTDx")).click();
Thread.sleep(2000);

///attribute css selector
driver.findElement(By.cssSelector("div[class='XizdcU Zl53fz']")).click();
Thread.sleep(2000);

//class css selector
driver.findElement(By.cssSelector("a.DDNGCa")).click();
Thread.sleep(2000);

/////prefix substring
driver.findElement(By.cssSelector("button[class^='styles__ButtonStyle']")).click();
Thread.sleep(2000);

////suffix css selector
driver.findElement(By.cssSelector("div[class$='login-input-container']")).click();
Thread.sleep(2000);

///matching substring
driver.findElement(By.cssSelector("button[class*='sc-oTaAA eBoKzo']")).click();
Thread.sleep(2000);
driver.close();




}
}
















  ////class css selector
  //driver.findElement(By.cssSelector("span.hm-icon-label")).click();
//Thread.sleep(2000);
////id css selector
//driver.findElement(By.cssSelector("div#hmenu-close-icon")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("a[href='/fresh?ref_=nav_cs_fresh']")).click();
//Thread.sleep(2000);
//driver.findElement(By.cssSelector("a[class^='a-link-normal']")).click();
///flkejnfkhf
///attribute css selector
// ////location
//driver.findElement(By.cssSelector("span[id='glow-ingress-line2']")).click();
//Thread.sleep(2000);





  //driver.close();
