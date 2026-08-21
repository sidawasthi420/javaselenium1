package tariq;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoverToolTip {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/demoSite/practice/tooltip/forms.html");

        driver.manage().window().maximize();

        WebElement toolTip = driver.findElement(By.id("firstname"));
        
  //    String actualToolTip = toolTip.getAttribute("title");
        String expectedToolTip = "Please provide your firstname.";

        Actions actions = new Actions(driver);
        actions.moveToElement(toolTip).build().perform();

        String actualToolTip = driver.findElement(By.xpath("//div[@class='ui-tooltip-content']")).getText();
        
        if (actualToolTip.equals(expectedToolTip)) {
            System.out.println("ToolTip Verified");
        } else {
            System.out.println("ToolTip not verified");

        }

    }
}
