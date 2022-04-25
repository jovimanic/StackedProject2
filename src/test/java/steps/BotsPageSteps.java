package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.JavascriptUtils;

import java.io.IOException;
import java.util.List;

import static steps.PageInitializer.botsPage;
import static steps.PageInitializer.dashboardPage;


public class BotsPageSteps extends CommonMethods {

    @When("a user is on the dashboard and clicks the Bots tab")
    public void a_user_is_on_the_dashboard_and_clicks_the_Bots_tab() {
        Assert.assertEquals(DASHBOARD_HEADER, driver.getTitle());
        waitForVisibility(botsPage.botsTab);
        botsPage.botsTab.click();
    }

    @Then("all bot set up cards will display including bot name, text {string},and button {string}")
    public void all_bot_set_up_cards_will_display_including_bot_name_text_and_button(String setUpYourBotToStartTrading, String setUp) throws IOException {
        //for loop to iterate through list of bots on bots tab, searching for stacked bots
        for (WebElement listOfBotNames : botsPage.botNamesText) {
            if (listOfBotNames.getText().trim().equalsIgnoreCase(STACKED_TEST_BOT)
                    || listOfBotNames.getText().trim().equalsIgnoreCase(STACKED_TEST_BOT2) ||
                    listOfBotNames.getText().trim().equalsIgnoreCase(STACKED_AUTOMATED_TEST_BOT)) {    //increasing bot count as each bot is located

                //asserting each bot has a bot button displayed and enabled iterating through list of bot links
                for (WebElement setUpYourbots : botsPage.setUpYourBotToStartTradingLinkText) {
                    Assert.assertTrue(setUpYourbots.isDisplayed());
                    Assert.assertTrue(setUpYourbots.isEnabled());
                    Assert.assertEquals(setUpYourBotToStartTrading, setUpYourbots.getText().trim());
                }
                for (WebElement setUpbutton : botsPage.setUpBotButtons) {
                    Assert.assertTrue(setUpbutton.isDisplayed());
                    Assert.assertTrue(setUpbutton.isEnabled());
                    Assert.assertEquals(setUp, setUpbutton.getText().trim());
                }
            }
        }
        takeScreenshot("STK-2367/STK-2367_BotsTab");
    }

    @When("a user clicks on all of the bot Set up buttons, the bot set up page displays with data :")
    public void a_user_clicks_on_all_of_the_bot_Set_up_buttons_the_bot_set_up_page_displays_with_data(List<String> botSetUpPageDataTable) throws IOException {
        //increasing bot count as each bot is located
        //accessing each bot set up page
        for(int bot=1; bot<=3; bot++) {
            if (bot == 1) {
                waitForVisibility(botsPage.setUpBotButton1);
                JavascriptUtils.jsScrollIntoView(botsPage.setUpBotButton1);
                botsPage.setUpBotButton1.click();
            } else if (bot == 2) {
                waitForVisibility(botsPage.setUpBotButton2);
                JavascriptUtils.jsScrollIntoView(botsPage.setUpBotButton2);
                botsPage.setUpBotButton2.click();
            } else {
                waitForVisibility(botsPage.setUpBotButton3);
                JavascriptUtils.jsScrollIntoView(botsPage.setUpBotButton3);
                botsPage.setUpBotButton3.click();
            }
            waitForVisibility(botsPage.myBotsHeaderText);
            //asserting all bot set up page details are displayed
            String basicSettings = botSetUpPageDataTable.get(0) + "\nReset to default";
            String riskManagement = botSetUpPageDataTable.get(1) + "\nReset to default";
            String tradeManagement = botSetUpPageDataTable.get(2) + "\nReset to default";
            String selectExchange = botSetUpPageDataTable.get(3);
            String executionEnabled = botSetUpPageDataTable.get(4);
            String equity = botSetUpPageDataTable.get(5);
            String leverage = botSetUpPageDataTable.get(6);
            String crossMargin = botSetUpPageDataTable.get(7);
            String stopLoss = botSetUpPageDataTable.get(8);
            String takeProfit = botSetUpPageDataTable.get(9);
            Assert.assertEquals(basicSettings, botsPage.basicSettingsHeaderText.getText().trim());
            //taking screenshot of all bot Set up pages
            takeScreenshot("STK-2367/STK-2367_BotsSetUpPageTop" + bot);
            JavascriptUtils.jsScrollDown(1000);
            takeScreenshot("STK-2367/STK-2367_BotsSetUpPageBottom" + bot);
            Assert.assertEquals(riskManagement, botsPage.riskManagementHeaderText.getText().trim());
            Assert.assertEquals(tradeManagement, botsPage.tradeManagementHeaderText.getText().trim());
            Assert.assertEquals(selectExchange, botsPage.selectExchangeText.getText().trim());
            Assert.assertEquals(executionEnabled, botsPage.executionEnabledText.getText().trim());
            Assert.assertEquals(equity, botsPage.equityText.getText().trim());
            Assert.assertEquals(leverage, botsPage.leverageText.getText().trim());
            JavascriptUtils.jsScrollIntoView(botsPage.crossMarginText);
            Assert.assertEquals(crossMargin, botsPage.crossMarginText.getText().trim());
            Assert.assertEquals(stopLoss, botsPage.stopLossText.getText().trim());
            Assert.assertEquals(takeProfit, botsPage.takeProfitText.getText().trim());
            JavascriptUtils.jsClick(dashboardPage.dashboardTextButton);
            waitForVisibility(botsPage.botsTab);
            botsPage.botsTab.click();
        }
        }

    @When("a user clicks on the {string} button text")
    public void a_user_clicks_on_the_button_text(String viewAllBots) {
        waitForVisibility(botsPage.viewAllBotsLinkText);
        Assert.assertEquals(viewAllBots, botsPage.viewAllBotsLinkText.getText().trim());
        botsPage.viewAllBotsLinkText.click();
    }

    @Then("a user is navigated to the Bots page and is able to view all bots available")
    public void a_user_is_navigated_to_the_Bots_page_and_is_able_to_view_all_bots_available() throws IOException {
        waitForVisibility(botsPage.automateYourInvestmentsWithBotsText);
        takeScreenshot("STK-2367/STK-2367_BotsPage");
        Assert.assertEquals(BOTS_PAGE_HEADER, driver.getTitle());
    }
}
