package songs;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pageObjects.Keyboard;
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
    public void firstSong(){
        Keyboard kb = new Keyboard(wdriver);

        kb.pressFirstNote()
                .pressSecondNote();
    }
}
