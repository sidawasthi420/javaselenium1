package tariq;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_NormalLocators {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.shivohamautomation.com");
        Thread.sleep(5000);

        driver.manage().window().maximize();

        String actualTitle = driver.getTitle();

        String expectedTitle = "Shivoham Automation Expert - Consultancy Services";

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Website opened Successfully");
        } else {
            System.out.println("Website not opened Successfully");
        }
        System.out.println(actualTitle);

        WebElement closePopup = driver.findElement(By.id("close-popup"));
        closePopup.click();

        WebElement loginButton = driver.findElement(By.className("btn-primary"));
        loginButton.click();
        Thread.sleep(3000);

        WebElement usernameTextField = driver.findElement(By.name("username"));
        usernameTextField.sendKeys("Tariqahmad8057@gmail.com");

        WebElement passwordTextField = driver.findElement(By.id("password"));
        passwordTextField.sendKeys("Tariqahmad@8057");

        WebElement homeButton = driver.findElement(By.linkText("Home"));
        homeButton.click();

        WebElement closePopup1 = driver.findElement(By.id("close-popup"));
        closePopup1.click();

        Thread.sleep(2000);

        WebElement enhancedLearningButton = driver.findElement(By.partialLinkText("Skills with Tailored, Enh"));
        enhancedLearningButton.click();
        Thread.sleep(2000);

        driver.navigate().back();

        List<WebElement> imagesList = driver.findElements(By.tagName("img"));
        System.out.println("Total number of images on home page:- " + imagesList.size());

        driver.close();
    }
}
