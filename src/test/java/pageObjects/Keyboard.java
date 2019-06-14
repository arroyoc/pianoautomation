package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyboard extends PageBase{

    public Keyboard(WebDriver wdriver){
        super(wdriver);
    }

    private By firstNote = By.id("a84d");
    private By secondNote = By.id("a89d");

    public Keyboard pressFirstNote(){
        waitAndClick(firstNote);
        return this;
    }

    public Keyboard pressSecondNote(){
        waitAndClick(secondNote);
        return this;
    }
}
