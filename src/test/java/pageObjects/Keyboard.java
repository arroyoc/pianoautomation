package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Keyboard extends PageBase{

    public Keyboard(WebDriver wdriver){
        super(wdriver);
    }

    private By threeC = By.id("a84d");
    private By threeD = By.id("a89d");
    private By threeE = By.id("a85d");
    private By threeF = By.id("a73d");
    private By threeG = By.id("a79d");

    private By fourA = By.id("a80d");


    public Keyboard pressThreeC(){
        waitAndClick(threeC);
        return this;
    }

    public Keyboard pressThreeG(){
        waitAndClick(threeG);
        return this;
    }

    public Keyboard pressFourA(){
        waitAndClick(fourA);
        return this;
    }
}
