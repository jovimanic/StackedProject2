package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import utils.WebDriverUtils;

import static steps.PageInitializer.*;

public class STK2362_2422Steps {
    Actions actions = new Actions(WebDriverUtils.driver);
    @Then("Click on the Top tab")
    public void click_on_the_Top_tab() {
        dashboardPage.topTab.click();
    }

    @Then("Hover over on the coin is not enabled for purchasing with Gem")
    public void hover_over_on_the_coin_is_not_enabled_for_purchasing_with_Gem() {
        actions.moveToElement(dashboardPage.aave).clickAndHold().perform();
    }

    @Then("Hover over on the Buy XXX button")
    public void hover_over_on_the_Buy_XXX_button() {
        actions.moveToElement(dashboardPage.buyAAVE);
    }

    @Then("Click on the Learn more text")
    public void click_on_the_Learn_more_text() {
        dashboardPage.learnMoreLink.click();
        Assert.assertEquals("Market Watch | AAVE | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click the See more link")
    public void click_the_See_more_link() {
        dashboardPage.seeMoreTab.click();
        Assert.assertEquals("Market Watch | Stacked", WebDriverUtils.driver.getTitle());
    }

}
