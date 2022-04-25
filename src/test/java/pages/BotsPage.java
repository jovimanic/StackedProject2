package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.Driver;

import java.util.List;

public class BotsPage extends CommonMethods {

    public BotsPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    /**__________ Common bot page elements __________*/

    @FindBy(xpath = "//div[@role='tablist']//div[5]")
    public WebElement botsTab;

    @FindBy(xpath = "//a[contains(text(),'View all Bots')]")
    public WebElement viewAllBotsLinkText;

    @FindBy(xpath = "//div[.=\" Stacked Automated Test Bot \"]")
    public WebElement stackedAutomatedTestBot;

    @FindBy(xpath = "//span[@class=\"bot__title-text\"]")
    public List<WebElement> botNamesText;

    @FindBy(xpath = "//span[normalize-space()='My Bots']")
    public WebElement myBotsHeaderText;

    @FindBy(xpath = "//span[contains(text(),'Automate your investments with Bots.')]")
    public WebElement automateYourInvestmentsWithBotsText;

    @FindBy(xpath = "//span[contains(text(),' Set up your bot to start trading')]")
    public List<WebElement> setUpYourBotToStartTradingLinkText;

    @FindBy(xpath = "//button[@class=\"bot__setup v-btn v-btn--has-bg v-btn--rounded theme--light v-size--default primary ui-kit-button outlined-icon\"]")
    public List<WebElement> setUpBotButtons;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/a[1]/div[3]/button[1]/span[1]/span[1]")
    public WebElement setUpBotButton1;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/a[2]/div[3]/button[1]/span[1]/span[1]")
    public WebElement setUpBotButton2;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[1]/div[2]/a[3]/div[3]/button[1]")
    public WebElement setUpBotButton3;

    /**__________ Set up bots page details __________*/

    //Basic Settings section
    @FindBy(xpath = "//div[contains(text(),'Basic Settings')]")
    public WebElement basicSettingsHeaderText;

    @FindBy(xpath = "//div[contains(text(),'Select Exchange')]")
    public WebElement selectExchangeText;

    @FindBy(xpath = "//div[contains(text(),'Execution enabled')]")
    public WebElement executionEnabledText;

    //Risk Management section
    @FindBy(xpath = "//div[contains(text(),'Risk management')]")
    public WebElement riskManagementHeaderText;

    @FindBy(xpath = "//div[contains(text(),'Equity')]")
    public WebElement equityText;

    @FindBy(xpath = "//div[contains(text(),'Leverage')]")
    public WebElement leverageText;

    @FindBy(xpath = "//div[contains(text(),'Cross margin')]")
    public WebElement crossMarginText;

    //Trade management section
    @FindBy(xpath = "//div[contains(text(),'Trade management')]")
    public WebElement tradeManagementHeaderText;

    @FindBy(xpath = "//div[contains(text(),'Stop loss')]")
    public WebElement stopLossText;

    @FindBy(xpath = "//div[contains(text(),'Take profit')]")
    public WebElement takeProfitText;


}



