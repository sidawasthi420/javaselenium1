package tariq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_cssSelectors {

    public static void main(String[] args) throws InterruptedException {

        P02_cssSelectors obj = new P02_cssSelectors();
//        obj.cssSelectorOld();
        obj.cssSelectorNew();
      

    }

    public void cssSelectorOld() throws InterruptedException{
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

    public void cssSelectorNew() throws InterruptedException{

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.shivohamautomation.com/index.html");

        driver.manage().window().maximize();
        Thread.sleep(5000);

        String expectedTitle = "Shivoham Automation Expert - Consultancy Services";
        String actualTitle = driver.getTitle();

        if(expectedTitle.equals(actualTitle)){
            System.out.println("Website Opened successfully");
        }
        else{
            System.out.println("Website not Opened successfully");
        }

        WebElement joinNowButton = driver.findElement(By.cssSelector("a.join-now-btn"));
        joinNowButton.click();

        WebElement fullNameInputField = driver.findElement(By.cssSelector("input#name"));
        fullNameInputField.sendKeys("Tariq Ahmad");
        
        WebElement emailInputField = driver.findElement(By.cssSelector("input[type='email']"));
        emailInputField.sendKeys("tariqahmad8057@gmail.com");
        
        WebElement mobileNumberInputField = driver.findElement(By.cssSelector("input[placeholder^='Enter your p']"));
        mobileNumberInputField.sendKeys("9258678692");

        WebElement fullNameInputField1 = driver.findElement(By.cssSelector("input[placeholder$='ull name']"));
        fullNameInputField1.clear();
        fullNameInputField1.sendKeys("Tariq");

        WebElement emailInputField1 = driver.findElement(By.cssSelector("input[placeholder*='er your ema']"));
        emailInputField1.clear();
        emailInputField1.sendKeys("tariq8057@gmail.com");

        driver.close();
    }
}
