package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.WebDriverUtils;

public class StackedAutomatedTestBotPage extends CommonMethods {

    public StackedAutomatedTestBotPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[.=\" Purchase \"]")
    public WebElement purchaseButton;
}
