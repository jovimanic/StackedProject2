package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;
import utils.Driver;


public class LoginPage extends CommonMethods {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
    /**__________ Common login page elements __________*/
    @FindBy(id = "username")
    public WebElement emailAddressBox;

    @FindBy(id = "password")
    public WebElement passwordBox;

    @FindBy(id = "captcha")
    public WebElement captchaBox;

    @FindBy(xpath = "//button[.='Continue']")
    public WebElement continueButton;

    @FindBy(xpath = "//a[.='Forgot password?']")
    public WebElement forgotPassword;
}
