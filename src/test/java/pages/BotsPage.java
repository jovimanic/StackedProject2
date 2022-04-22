package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.WebDriverUtils;

public class BotsPage extends CommonMethods {

    public BotsPage(){
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//a[.=\" Bots \"]")
    public WebElement botsTab;

    @FindBy(xpath = "//div[.=\" Stacked Automated Test Bot \"]")
    public WebElement stackedAutomatedTestBot;
}
