package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selenium_xpath {

    public static void main(String[] args) throws InterruptedException {
        
        WebDriver driver= new ChromeDriver();

        driver.manage().window().maximize();
        
        driver.get("https://shivohamautomation.com/");

        Thread.sleep(10000);

        //cSSSelector with Class
        driver.findElement(By.cssSelector("span.close-arrow")).click();
        Thread.sleep(1000);

        //absolute xpath for Online Classes
        //driver.findElement(By.xpath("/html/body/div[3]/div/div/a[2]/div/div/h5")).click();
        //Thread.sleep(2000);

        //xpath for Online Classes
        driver.findElement(By.xpath("//a[@href='courses.html' and @class='col-lg-3 col-sm-6 wow fadeInUp']")).click();
        //If multiple webelements are found using findElement than it will perform operation on the vary first element being found
        Thread.sleep(2000);

        driver.findElement(By.xpath("//img[starts-with(@src,'img/cat-1')]")).click();
        Thread.sleep(2000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        js.executeScript("window.scrollTo(0,1200)");
        Thread.sleep(8000);

        driver.findElement(By.xpath("//a[text()='Enroll Now']")).click();
        Thread.sleep(5000);

        //Registration page title verification
        String labelTextOfRegistrationPage = driver.findElement(By.xpath("//label[text()='Preferred Start Date']//ancestor::form//preceding-sibling::h2")).getText();
        String expectedTextOfRegistrationPage = "Register for Software Testing Course";

        if(labelTextOfRegistrationPage.equals(expectedTextOfRegistrationPage))
        {
            System.out.println("Registration Page is opened successfully");
        }
        Thread.sleep(3000);

        driver.findElement(By.xpath("//form[@id='registrationForm']//following::input[@placeholder='Enter your full name']")).sendKeys("Siddhant Awasthi");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//label[text()='Phone Number']//preceding::input[@type='email']")).sendKeys("siddhantawasthi006@gmail.com");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//form[@id='registrationForm']/div[3]//child::input")).sendKeys("8804767857");
        Thread.sleep(3000);

        WebElement dropdownBox = driver.findElement(By.xpath("//label[@for='course']//following-sibling::select"));
        //Dropdown
       // Select dropdown = new Select(driver.findElement(By.xpath("//label[@for='course']//following-sibling::select")));
        Select dropdown = new Select(dropdownBox);
        dropdown.selectByVisibleText("Data Driven & Cucumber Framework");
        Thread.sleep(3000);
        dropdown.selectByValue("cucumber-bdd");
        Thread.sleep(3000);
        dropdown.selectByIndex(2);       //API Testing
        Thread.sleep(3000);

        driver.findElement(By.xpath("//div[@class='registration-form']//descendant::input[@type='date']")).sendKeys("31-08-2026");
        Thread.sleep(3000);

        driver.quit();
    }
}
