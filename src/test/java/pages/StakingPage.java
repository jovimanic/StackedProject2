package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.WebDriverUtils;

public class StakingPage extends CommonMethods {

    public StakingPage(){
        PageFactory.initElements(driver, this);
    }

    /**__________ Common staking page elements __________*/

    @FindBy(xpath = "//a[@href='/strategies/staking']")
    public WebElement exploreStakingButton;

    @FindBy(xpath = "//body[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")
    public WebElement connectFTXExchangeButton;
}


