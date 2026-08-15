package luv;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class dropdown3 {
    public static void main(String[]args) throws Exception{
    WebDriver driver = new ChromeDriver();

    driver.get("https://rssb.rajasthan.gov.in/results");
    Thread.sleep(2000);


    //WebElement dropdownbox = driver.findElement(By.xpath("//select[@name='exam_name' and @id='exam_name']"));
     //Select dropdown = new Select(dropdownbox);
    
Select dropdown =new Select(driver.findElement(By.xpath("//select[@name='exam_name' and @id='exam_name']")));
   
  


dropdown.selectByVisibleText("Aayush Officer (Contractual) (Aayurved/Homeo/Unani)");
 Thread.sleep(2000);
  dropdown.selectByValue("Agriculture Supervisor");
Thread.sleep(2000);
dropdown.selectByIndex(3);
Thread.sleep(2000);
dropdown.selectByIndex(0);
Thread.sleep(2000);
JavascriptExecutor JS =(JavascriptExecutor) driver;
JS.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(2000);

driver.findElement(By.xpath("//a[@class='page-link' and @aria-label='Next']")).click();
Thread.sleep(2000);
driver.close();
}
}