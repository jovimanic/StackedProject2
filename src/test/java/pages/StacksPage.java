package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class StacksPage extends CommonMethods {

    public StacksPage(){
        PageFactory.initElements(driver, this);
    }

    /**__________ Common stacks page elements __________*/

    @FindBy(xpath = "//span[@class='pnl success--text']")
    public WebElement pnlCardValueText;

    @FindBy(xpath = "//main[@data-booted='true']//a[2]")
    public WebElement secondStackCard;

    @FindBy(xpath = "//p[@class='stacks-title']")
    public WebElement stacksTitleText;

    @FindBy(xpath = "//h1[contains(@class, \"header-title\")]")
    public WebElement individualStacksText;

    @FindBy(xpath = "//div[@layout='LayoutFullscreenDefault']//div//div//p")
    public WebElement stacksCompositionText;

}
