package tariq;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P04_XPathAxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shivohamautomation.com");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        String expectedTitle = "Shivoham Automation Expert - Consultancy Services";
        String actualString = driver.getTitle();

        if (expectedTitle.equals(actualString)) {
            System.out.println("Website Opened Successfully");
        } else {
            System.out.println("Website not opened successfully");
        }

        WebElement closeButton = driver.findElement(By.xpath("//div[@id='discountPopup']//child::span[@onclick='closePopup()']"));
        closeButton.click();

        WebElement joinNowButton = driver.findElement(By.xpath("(//div[@class='container']//child::a[text()='Join Now'])[4]"));
        joinNowButton.click();

        WebElement nameTextField = driver.findElement(By.xpath("//div[@class='registration-form']//following::input[@id='name']"));
        nameTextField.sendKeys("Tariq Ahmad");

        WebElement emailTextField = driver.findElement(By.xpath("//div[@class='text-center']//preceding::input[@id='email']"));
        emailTextField.sendKeys("tariqahmad8057@gmail.com");

        WebElement phoneNumberTextField = driver.findElement(By.xpath("//div[@class='registration-form']//descendant::input[@id='phone']"));
        phoneNumberTextField.sendKeys("9258678692");

        List<WebElement> dropdownList = driver.findElements(By.xpath("//select[@id='course']//child::option"));
        for (WebElement we : dropdownList) {
            System.out.println(we.getText());
        }

        WebElement dropdownBox = driver.findElement(By.xpath("//option[@value='selenium']//parent::select[@id='course']"));

        Select dropdown = new Select(dropdownBox);
        dropdown.selectByValue("selenium");

        WebElement dateTextField = driver.findElement(By.xpath("//label[@for='date']//following-sibling::input[@id='date']"));
        dateTextField.sendKeys("17-08-2026");

        WebElement submitButton = driver.findElement(By.xpath("//div[@class='text-center']//child::button[@id='registrationButton']"));
        submitButton.click();

        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

        WebElement homeButton = driver.findElement(By.xpath("//div[@id='navbarNav']//descendant::a[text()='Home']"));
        homeButton.click();

        Thread.sleep(3000);
        WebElement closeButton1 = driver.findElement(By.xpath("//div[@id='discountPopup']//child::span[@id='close-popup']"));
        closeButton1.click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,1600)");

        Thread.sleep(4000);
        WebElement automationTestingButton = driver.findElement(By.xpath("//span[@id='count-display-automation']//ancestor::a"));
        automationTestingButton.click();

        js.executeScript("window.scrollTo(0, 1800)");

        Thread.sleep(3000);
        List<WebElement> popularCoursesList = driver.findElements(By.xpath("//h1[text()='Popular Courses']//following::h5[@class='mb-4']"));
        for (WebElement we : popularCoursesList) {
            System.out.println(we.getText());
        }

        WebElement playwrightReadMoreButton = driver.findElement(By.xpath("//a[text()='Join Now']//preceding-sibling::a[@href='playwright.html']"));
        playwrightReadMoreButton.click();

        driver.close();

    }
}