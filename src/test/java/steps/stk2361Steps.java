package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.DashboardPage;
import pages.LoginPage;
import pages.SeeAllExchangesPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class stk2361Steps {
    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    SeeAllExchangesPage seeAllExchangesPage = new SeeAllExchangesPage();

    @Given("Valid user is logged in")
    public void valid_user_is_logged_in() throws InterruptedException {
        WebDriverUtils.driver.get(ConfigReader.getPropertyValue("url"));
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username2"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password2"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(15000);
        loginPage.continueButton.click();
        Assert.assertEquals("Dashboard | Stacked", WebDriverUtils.driver.getTitle());
    }

    @And("Click the right > button")
    public void clickTheRightButton() {
        dashboardPage.rightArrowButton.click();

    }

    @And("Click the left < button")
    public void clickTheLeftButton() {
        dashboardPage.leftArrowButton.click();
    }

    @Given("Click the > button until it disappears")
    public void click_the_button_until_it_disappears() {
        dashboardPage.rightArrowButton.click();
        if (dashboardPage.rightArrowButton.isDisplayed()){
            dashboardPage.rightArrowButton.click();
        }
    }

    @Given("Click the See All Exchanges card")
    public void click_the_See_All_Exchanges_card() throws InterruptedException {
        dashboardPage.seeAllExchangesCard.click();
        Thread.sleep(1000);
        Assert.assertEquals("Let's Set You Up | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click the Dashboard link")
    public void click_the_Dashboard_link() {
        seeAllExchangesPage.dashboardButton.click();
        Assert.assertEquals("Dashboard | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click the Coinbase card")
    public void click_the_Coinbase_card() {
        dashboardPage.coinbaseCard.click();
        Assert.assertEquals("Connect Coinbase", dashboardPage.connectCoinbase.getText());
    }

    @Then("Click the FTX card")
    public void click_the_FTX_card() {
        dashboardPage.ftxCard.click();
        Assert.assertEquals("Connect FTX",dashboardPage.connectFtx.getText());
    }

    @Then("Click the FTX US card")
    public void click_the_FTX_US_card() {
        dashboardPage.ftxUsCard.click();
        Assert.assertEquals("Connect FTX US",dashboardPage.connectFtxUs.getText());
    }

    @Then("Click the Binance card")
    public void click_the_Binance_card() {
        dashboardPage.rightArrowButton.click();
        dashboardPage.binanceCard.click();
        Assert.assertEquals("Connect Binance",dashboardPage.connectBinance.getText());
    }

    @Then("Click the Bybit card")
    public void click_the_Bybit_card() {
        dashboardPage.rightArrowButton.click();
        dashboardPage.bybitCard.click();
        Assert.assertEquals("Connect Bybit",dashboardPage.connectBybit.getText());
    }

    @Then("Click the KuCoin card")
    public void click_the_KuCoin_card() {
        dashboardPage.rightArrowButton.click();
        dashboardPage.kuCoinCard.click();
        Assert.assertEquals("Connect KuCoin",dashboardPage.connectKuCoin.getText());
    }
}
