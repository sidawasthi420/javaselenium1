package luv;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class xpath {
public static void main(String[]args) throws Exception
{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.flipkart.com/");
  Thread.sleep(2000);
  ///driver.findElement(By.cssSelector("span.b3wTlE")).click();
  //Thread.sleep(2000);

  /////absolute xpath
  driver.findElement(By.xpath("/html/body/div/div/span")).click();
  Thread.sleep(2000);
 
  ///relative basic xpath  tag name
  driver.findElement(By.xpath("//a[@class='E7_UTN']")).click();
  Thread.sleep(2000);

  ////relative basic xpath  *
  driver.findElement(By.xpath("//*[@class='nw1UBF v1zwn25']")).click();
  Thread.sleep(2000);

  ///////contains xpath
  ///driver.findElement(By.xpath("(//a[contains(@class,'K05FV0'])[1]")).click();
  driver.findElement(By.xpath("((//a[contains(@class,'K05FV0')])[1])")).click();
  Thread.sleep(4000);

  driver.close();
}}