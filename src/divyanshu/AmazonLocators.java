package divyanshu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AmazonLocators {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.amazon.com/");

        WebElement searchById =
                driver.findElement(By.id("twotabsearchtextbox"));

        System.out.println(" ID Locator: "
                + searchById.getAttribute("id"));


        WebElement searchByName =
                driver.findElement(By.name("field-keywords"));

        System.out.println("Name Locator: "
                + searchByName.getAttribute("name"));

        WebElement searchByClass =
                driver.findElement(By.className("nav-input"));

        System.out.println(" ClassName Locator: "
                + searchByClass.getAttribute("class"));


        WebElement searchByTag =
                driver.findElement(By.tagName("input"));

        System.out.println("TagName Locator: "
                + searchByTag.getTagName());


        WebElement dealsLink =
                driver.findElement(By.linkText("Today's Deals"));

        System.out.println("LinkText Locator: "
                + dealsLink.getText());

        WebElement partialDealsLink =
                driver.findElement(By.partialLinkText("Today's"));

        System.out.println("PartialLinkText Locator: "
                + partialDealsLink.getText());

        // XPATH LOCATORS

        WebElement xpathBasic =
                driver.findElement(
                        By.xpath("//input")
                );

        System.out.println("Basic XPath: "
                + xpathBasic.getTagName());

        WebElement xpathId =
                driver.findElement(
                        By.xpath("//input[@id='twotabsearchtextbox']")
                );

        System.out.println("XPath using ID: "
                + xpathId.getAttribute("id"));

        WebElement xpathName =
                driver.findElement(
                        By.xpath("//input[@name='field-keywords']")
                );

        System.out.println("XPath using Name: "
                + xpathName.getAttribute("name"));

        WebElement xpathClass =
                driver.findElement(
                        By.xpath("//input[@class='nav-input']")
                );

        System.out.println("XPath using Class: "
                + xpathClass.getAttribute("class"));

        WebElement xpathAnd =
                driver.findElement(
                        By.xpath("//input[@id='twotabsearchtextbox' and @name='field-keywords']")
                );

        System.out.println("XPath using AND: "
                + xpathAnd.getAttribute("id"));


        WebElement xpathOr =
                driver.findElement(
                        By.xpath("//input[@id='twotabsearchtextbox' or @name='field-keywords']")
                );

        System.out.println("XPath using OR: "
                + xpathOr.getAttribute("id"));


        WebElement xpathContains =
                driver.findElement(
                        By.xpath("//input[contains(@id,'search')]")
                );

        System.out.println(" XPath using contains(): "
                + xpathContains.getAttribute("id"));

        WebElement xpathStartsWith =
                driver.findElement(
                        By.xpath("//input[starts-with(@id,'twotab')]")
                );

        System.out.println(" XPath using starts-with(): "
                + xpathStartsWith.getAttribute("id"));

        WebElement xpathText =
                driver.findElement(
                        By.xpath("//a[text()=\"Today's Deals\"]")
                );

        System.out.println(" XPath using text(): "
                + xpathText.getText());


        WebElement xpathNormalizeSpace =
                driver.findElement(
                        By.xpath("//a[normalize-space()=\"Today's Deals\"]")
                );

        System.out.println("XPath using normalize-space(): "
                + xpathNormalizeSpace.getText());


        WebElement xpathIndex =
                driver.findElement(
                        By.xpath("(//input)[1]")
                );

        System.out.println("Index-based XPath: "
                + xpathIndex.getTagName());

        WebElement xpathStar =
                driver.findElement(
                        By.xpath("//*[@id='twotabsearchtextbox']")
                );

        System.out.println("XPath using *: "
                + xpathStar.getAttribute("id"));


        

        WebElement xpathParent =
                driver.findElement(
                        By.xpath("//input[@id='twotabsearchtextbox']/parent::*")
                );

        System.out.println(" Parent XPath: "
                + xpathParent.getTagName());


        WebElement xpathChild =
                driver.findElement(
                        By.xpath("//form[@role='search']/child::*[1]")
                );

        System.out.println(" Child XPath: "
                + xpathChild.getTagName());

        
        try {

            WebElement followingSibling =
                    driver.findElement(
                            By.xpath("//input[@id='twotabsearchtextbox']/following-sibling::*[1]")
                    );

            System.out.println("Following-Sibling XPath: "
                    + followingSibling.getTagName());

        } catch (Exception e) {

            System.out.println(" Following-Sibling element not found.");
        }


        // CSS SELECTOR
        

        WebElement searchByCSS =
                driver.findElement(
                        By.cssSelector("#twotabsearchtextbox")
                );

        System.out.println("CSS Selector: "
                + searchByCSS.getAttribute("id"));


        
        try {

            Thread.sleep(3000);

        } catch (InterruptedException e) {

            e.printStackTrace();
        }


        driver.quit();
    }
}
```
