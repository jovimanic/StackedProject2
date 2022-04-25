package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Driver;

import static steps.PageInitializer.dashboardPage;
import static steps.PageInitializer.loginPage;

public class LoginSteps extends CommonMethods {

    /**
     * This class LoginSteps class is for storing our login method
     * so we can easily access this method in order to change the login configurations as needed
     * on a test case by test case basis
     */

    @Given("Valid user is logged in")
    public void valid_user_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username2"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password2"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(12000);
        loginPage.continueButton.click();
        waitForVisibility(dashboardPage.dashboardTextButton);
        Assert.assertEquals(DASHBOARD_HEADER, Driver.getDriver().getTitle());
    }
    @Given("a user with no Stacks is logged in")
    public void a_user_with_no_Stacks_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        waitForVisibility(dashboardPage.dashboardTextButton);
        Assert.assertEquals(DASHBOARD_HEADER, Driver.getDriver().getTitle());
    }

    @Given("a user with no Staking is logged in")
    public void a_user_with_no_Staking_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        waitForVisibility(dashboardPage.dashboardTextButton);
        Assert.assertEquals(DASHBOARD_HEADER, Driver.getDriver().getTitle());
    }
    @Given("a user with no Lending is logged in")
    public void a_user_with_no_Lending_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        waitForVisibility(dashboardPage.dashboardTextButton);
        Assert.assertEquals(DASHBOARD_HEADER, Driver.getDriver().getTitle());
    }
    @Given("A user with bots subscribed, but not configured is logged in")
    public void A_user_with_bots_subscribed_but_not_configured_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username2"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password2"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        waitForVisibility(dashboardPage.dashboardTextButton);
        Assert.assertEquals(DASHBOARD_HEADER, Driver.getDriver().getTitle());
    }
    @Given("Exchange Connected User is logged in")
    public void Exchange_Connected_User_is_logged_in() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("Dashboard | Stacked", Driver.getDriver().getTitle());
    }

    @Given("New User is logged in")
    public void newUserIsLoggedIn() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username2"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password2"));
        Thread.sleep(12000);
        loginPage.continueButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("Dashboard | Stacked", Driver.getDriver().getTitle());
    }

    @Then("New User logs out")
    public void newUserLogsOut() throws InterruptedException {
        dashboardPage.profile.click();
        dashboardPage.logoutBtn.click();
        Assert.assertEquals("Stacked", Driver.getDriver().getTitle());
    }

    @Then("Exchange Connected User logs out")
    public void exchangeConnectedUserLogsOut() {
        dashboardPage.profile.click();
        dashboardPage.logoutBtn.click();
        Assert.assertEquals("Stacked", Driver.getDriver().getTitle());
    }
}
