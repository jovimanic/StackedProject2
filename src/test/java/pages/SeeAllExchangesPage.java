package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;

public class SeeAllExchangesPage {
    public SeeAllExchangesPage(){
        PageFactory.initElements(WebDriverUtils.driver, this);
    }

    @FindBy(xpath = "//*[@id=\"mainMenu\"]/div/a[1]/button")
    public WebElement dashboardButton;
}
