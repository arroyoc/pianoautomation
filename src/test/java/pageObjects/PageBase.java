package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageBase {

    protected WebDriver driver;
    private int timeout = 15;
    private int elementExistsTimeout = 5;

    public PageBase(WebDriver wdriver){
        this.driver = wdriver;
    }

    public WebElement waitForElement(By locator)
    {
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        return driver.findElement(locator);
    }

    public WebElement waitAndClick(By locator)
    {
        WebElement element = waitForElement(locator);
        element.click();
        return element;
    }
}
