package pageObjects;

import org.openqa.selenium.WebDriver;

public class PageSetup extends PageBase{

    public PageSetup(WebDriver wdriver) {
        super(wdriver);
    }

    public PageSetup loadPage(String url) {
        this.driver.get(url);
        this.driver.manage().window().maximize();
        return this;
    }
}
