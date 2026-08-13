package mukul;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

 public class Selenium3 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shivohamautomation.com/");

        String expectedTitle = "Shivoham Automation Expert - Consultancy Services";

        Thread.sleep(5000);
        String actualTitle = driver.getTitle(); 
        
        if (actualTitle.equals(expectedTitle)) {

            System.out.println("Test Passed!");
        }
        else {
            System.out.println("Test Failed!");
        }

        Thread.sleep(3000);

        driver.findElement(By.xpath("/html/body/div[10]/span")).click(); // Absolute Xpath

        Thread.sleep(3000);



        driver.findElement(By.xpath("//a[@class='btn-primary']")).click();

        Thread.sleep(3000); 

        driver.findElement(By.xpath("//div/a[@href='registration.html']")).click();

        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter your full name')]")).sendKeys("MUKUL VARSHNEY" );
        
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@placeholder,'er your ema')]")).sendKeys("mukulvarshney7071@gamil.com" );
        
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("9149207743" );
        Thread.sleep(3000);

        WebElement dropdownBox = driver.findElement(By.xpath("//select[@id='course']"));
        Thread.sleep(3000);

        Select dropdown = new Select(dropdownBox);
        dropdown.selectByVisibleText("Selenium");
                Thread.sleep(3000);

        dropdown.selectByIndex(3);
                Thread.sleep(3000);

        dropdown.selectByValue("core-java");
                Thread.sleep(3000);

       
        driver.findElement(By.xpath("//input[@type='date']")).sendKeys("14-08-2026");

        Thread.sleep(3000);

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(3000);


        driver.quit();

    }
}