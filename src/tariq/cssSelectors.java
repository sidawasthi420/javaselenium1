package tariq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectors {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://practicetestautomation.com/practice-test-login");

        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("student");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Password123");

        WebElement loginButton = driver.findElement(By.className("btn"));
        loginButton.click();

        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current URL after clicking submit: " + currentUrl);

        String expectedUrl = "https://practicetestautomation.com/logged-in-successfully/";
        if (currentUrl.equals(expectedUrl)) {
            System.out.println("Test Passed: URL matches the expected URL.");
        } else {
            System.out.println("Test Failed: URL does not match the expected URL.");
        }

        WebElement logOut = driver.findElement(By.partialLinkText("Log o"));
        logOut.click();

        Thread.sleep(3000);
        // WebElement practiceButton =
        // driver.findElement(By.cssSelector("li.menu-item-20"));
        WebElement practiceButton = driver.findElement(By.cssSelector("li#menu-item-20"));
        practiceButton.click();

        WebElement testExceptionsButton = driver.findElement(By.linkText("Test Exceptions"));
        testExceptionsButton.click();

        WebElement addButton = driver.findElement(By.cssSelector("button#add_btn"));
        addButton.click();

        Thread.sleep(10000);

        WebElement removeButton = driver.findElement(By.cssSelector("button[id*='move_b']"));
        removeButton.click();

        WebElement getHeading = driver.findElement(By.cssSelector("h5.wp-block-heading"));
        System.out.println(getHeading.getText());

        driver.quit();
    }

}
