package steps;

import cucumber.api.java.en.Given;
import org.junit.Assert;
import utils.ConfigReader;
import utils.WebDriverUtils;

import static steps.PageInitializer.loginPage;

public class LoginSteps {

    @Given("Valid user is logged in")
    public void valid_user_is_logged_in() throws InterruptedException {
        loginPage.emailAddressBox.sendKeys(ConfigReader.getPropertyValue("username"));
        loginPage.passwordBox.sendKeys(ConfigReader.getPropertyValue("password"));
        loginPage.captchaBox.sendKeys("");
        Thread.sleep(12000);
        loginPage.continueButton.click();
        Thread.sleep(2000);
        Assert.assertEquals("Dashboard | Stacked", WebDriverUtils.driver.getTitle());
    }
}
