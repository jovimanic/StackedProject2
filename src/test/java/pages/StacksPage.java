package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

import java.util.List;

public class StacksPage extends CommonMethods {

    public StacksPage(){
        PageFactory.initElements(driver, this);
    }

    /**__________ Common stacks page elements __________*/

    @FindBy(xpath = "//span[@class='pnl success--text']")
    public WebElement pnlCardValueText;

    @FindBy(xpath = "//main[@data-booted='true']//a[2]")
    public WebElement secondStackCard;
    @FindBy(xpath = "//span[contains(text(),' Diversify your crypto into pre-built Stacks. ')]")
    public WebElement diversifyYourCryptoIntoPreBuiltStacksHeaderText;
    @FindBy(xpath = "//p[contains(text(),'Stack Composition')]")
    public WebElement stacksCompositionText;

    //dynamic method to locate each stack card
    public static WebElement stackCards(int stackCount){
     WebElement stackCards = driver.findElement(By.xpath("//body//div[@id='app']//div[@layout='LayoutFullscreenDefault']//div//div//div[2]//a["+stackCount+"]"));
        return stackCards;
    }

}
