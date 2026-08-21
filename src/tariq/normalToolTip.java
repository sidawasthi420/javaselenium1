package tariq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class normalToolTip {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

        driver.manage().window().maximize();

        WebElement toolTip = driver.findElement(By.id("firstname"));
        String actualToolTip = toolTip.getAttribute("title");

        String expectedToolTip = "Please provide your firstname.";

        if (actualToolTip.equals(expectedToolTip)) {
            System.out.println("ToolTip Verified");
        } else {
            System.out.println("ToolTip not verified");

        }

    }
}
