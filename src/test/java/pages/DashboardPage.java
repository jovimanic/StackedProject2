package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.WebDriverUtils;


public class DashboardPage extends WebDriverUtils {

@FindBy(xpath = "//body/div[@id='app']/div/div/main[@data-booted='true']/div/div/div/div/div[@layout='LayoutDefault']/div/div/div/button[@role='button']/span[1]")
public WebElement allTimeDropDown;

    public DashboardPage() {
        PageFactory.initElements(driver,this);}
}


