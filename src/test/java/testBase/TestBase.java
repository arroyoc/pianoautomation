package testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
    }

    public static void webTearDown() {
        wdriver.quit();
        wdriver = null;
    }
}
