package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.StackedAutomatedTestBotPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

import static steps.PageInitializer.*;

public class SubscribeToNewBotSteps {

    StackedAutomatedTestBotPage stackedAutomatedTestBotPage = new StackedAutomatedTestBotPage();
    @Given("User is logged in")
    public void user_is_logged_in() throws InterruptedException {
        WebDriverUtils.driver.get(ConfigReader.getPropertyValue("url"));
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(20000);
        loginPage.continueButton.click();
        Assert.assertEquals("Dashboard | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click on the robot head icon from left navigation panel")
    public void click_on_the_robot_head_icon_from_left_navigation_panel() {
        WebDriverWait wait = new WebDriverWait(WebDriverUtils.driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(dashboardPage.botIcon));
        dashboardPage.botIcon.click();
        Assert.assertEquals("Bots | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click on the Bots tab")
    public void click_on_the_Bots_tab() {
        botsPage.botsTab.click();
        Assert.assertEquals("Bots | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click on any Bot")
    public void click_on_any_Bot() {
        botsPage.stackedAutomatedTestBot.click();
        Assert.assertEquals("Stacked Automated Test Bot | Stacked", WebDriverUtils.driver.getTitle());
    }

    @Then("Click the purchase button")
    public void click_the_purchase_button() {
        stackedAutomatedTestBotPage.purchaseButton.click();

    }

    @Then("Fill all required fields")
    public void fill_all_required_fields() {

    }

    @Then("Click the subscribe button")
    public void click_the_subscribe_button() {

    }

    @Then("Return To the Stacked site")
    public void return_To_the_Stacked_site() {

    }

}
