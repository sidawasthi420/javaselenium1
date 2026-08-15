package luv;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class xpathprefolldescentsetc {
public static void main(String[]args) throws Exception
{
  WebDriver driver = new ChromeDriver();
  driver.get("https://www.irctc.co.in/nget/profile/user-signup");
  Thread.sleep(2000);

  driver.findElement(By.xpath("//button[text()='English']")).click();
  Thread.sleep(2000);

  driver.findElement(By.xpath("//div[@class='col-xs-12 warning-box']//following::input[@placeholder='User Name']")).sendKeys("lav4841");
  Thread.sleep(2000);

  //driver.findElement(By.xpath("//a[@class='ui-toast-close-icon pi pi-times ng-tns-c22-6 ng-star-inserted']")).click();
//Thread.sleep(2000);
 
driver.findElement(By.xpath("//input[@type='password']//preceding::div[1][@class='col-xs-12 inputBoxPad']")).click();
 Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']//preceding::div[1][@class='col-xs-12 inputBoxPad']")).sendKeys("kumar lav");
Thread.sleep(2000);


    }

}
