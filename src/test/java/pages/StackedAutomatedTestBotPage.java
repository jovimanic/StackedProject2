package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.Driver;

public class StackedAutomatedTestBotPage extends CommonMethods {

    public StackedAutomatedTestBotPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**__________ Common stacked automated test bot elements __________*/
    @FindBy(xpath = "//span[.=\" Purchase \"]")
    public WebElement purchaseButton;
}
