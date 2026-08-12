package tariq;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class P00_ShivohumGifts {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shivohamgifts.in/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        String actualTitle = driver.getTitle();

        String expectedTitle = "Shivoham Gifts - Free eCommerce Gifts and Crockeries Store";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("WebSite Opend Successfully");
        } else {
            System.out.println("WebSite not Opend");
        }

        WebElement yourCart = driver.findElement(By.id("summary-total"));
        yourCart.click();

        Thread.sleep(3000);
        WebElement yourCartClose = driver.findElement(By.xpath("(//button[@type='button' and @aria-label='Close' and @data-bs-dismiss='offcanvas'])[3]"));
        yourCartClose.click();
     
        driver.findElement(By.name("name")).sendKeys("Tariq");
        driver.findElement(By.id("subscribe_email")).sendKeys("tariqahmad8057@gmail.com");
        driver.findElement(By.id("submitBtn")).click();
     
        //   driver.close();

    }

}
