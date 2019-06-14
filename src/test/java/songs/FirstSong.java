package songs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.Keyboard;
import pageObjects.PageSetup;
import testBase.TestBase;

public class FirstSong extends TestBase {

    @BeforeClass
    public static void setUp() throws Exception {
        webSetup();
    }

    @AfterClass
    public static void tearDown() {
        webTearDown();
    }

    @Test
    public void firstSong() throws InterruptedException {
        Keyboard kb = new Keyboard(wdriver);

        Thread.sleep(5000);
        kb.pressThreeC();
        Thread.sleep(1000);
        kb.pressThreeC();
        Thread.sleep(1000);
        kb.pressThreeG();
        Thread.sleep(1000);
        kb.pressThreeG();
        Thread.sleep(1000);
        kb.pressFourA();
        Thread.sleep(1000);
        kb.pressFourA();
        Thread.sleep(1000);
        kb.pressThreeG();
        Thread.sleep(5000);
    }
}
