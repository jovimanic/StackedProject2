package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;

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
        Assert.assertEquals(DASHBOARD_HEADER, driver.getTitle());
    }
}
