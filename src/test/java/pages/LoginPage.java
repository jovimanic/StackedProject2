package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static utils.WebDriverUtils.driver;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(driver,this);}


    @FindBy (id = "username")
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
