package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class StackedAutomatedTestBotPage {

    public StackedAutomatedTestBotPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//span[.=\" Purchase \"]")
    public WebElement purchaseButton;
}
