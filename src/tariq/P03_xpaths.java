package tariq;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P03_xpaths {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shivohamautomation.com/");

        driver.manage().window().maximize();

        Thread.sleep(5000);

        String expectedTitle = "Shivoham Automation Expert - Consultancy Services";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Website opened Successfully");
        } else {
            System.out.println("Website not opened Successfully");
        }

        WebElement joinNowButton = driver.findElement(By.xpath("html/body/div[10]/a"));
        joinNowButton.click();

        WebElement fullNameInputField = driver.findElement(By.xpath("//input[@id='name']"));
        fullNameInputField.sendKeys("Tariq Ahmad");

        WebElement mobileNumberInputField = driver.findElement(By.xpath("//input[starts-with(@placeholder,'Enter your phone')]"));
        mobileNumberInputField.sendKeys("9258678692");

        WebElement homeButton = driver.findElement(By.xpath("(//a[text()='Home'])[1]"));
        homeButton.click();

        Thread.sleep(3000);
        WebElement closeButton = driver.findElement(By.xpath("//span[text()='✖']"));
        closeButton.click();

        WebElement onlineClassesButton = driver.findElement(By.xpath("//h5[contains(@name,'ine-clas')]"));
        onlineClassesButton.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,400)");

        Thread.sleep(2000);

        WebElement automationTestingButton = driver.findElement(By.xpath("//h5[text()='Automation Testing']"));
        automationTestingButton.click();

        WebElement shivohumAutomationButton = driver.findElement(By.xpath("(//img[@alt='Shivoham Automation Expert'])[2]"));
        shivohumAutomationButton.click();

        WebElement closeButton1 = driver.findElement(By.xpath("//span[@id='close-popup' or @class='close-arrow']"));
        closeButton1.click();

        WebElement contactUsButton = driver.findElement(By.xpath("//a[@class='nav-item nav-link' and text()='Contact']"));
        contactUsButton.click();

        JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.scrollTo(0,document.body.scrollHeight)");

        Thread.sleep(4000);
        WebElement yourEmailTextField = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
        yourEmailTextField.sendKeys("tariqahmad8057@gmail.com");

        WebElement signUpButton = driver.findElement(By.xpath("//button[@type='button' and text()='SignUp']"));
        signUpButton.click();

        driver.close();

    }
}
