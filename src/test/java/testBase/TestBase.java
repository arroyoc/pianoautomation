package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.PageSetup;

import java.io.IOException;

public class TestBase {

    protected static WebDriver wdriver;

    protected static void webSetup() throws IOException {

        // Check if web driver has already been instantiated
        // Driver options are 'PhantomJSDriver', 'ChromeDriver', 'FireFoxDriver'
        if (wdriver == null) {
            System.setProperty("webdriver.chrome.driver", "./../pianoautomation//src//test//java//webDrivers//ChromeDriver//chromedriver.exe");
            wdriver = new ChromeDriver();
        }
        PageSetup ps = new PageSetup(wdriver);

        ps.loadPage("https://virtualpiano.net/");
    }

    public static void webTearDown() {
        wdriver.quit();
        wdriver = null;
    }
}
