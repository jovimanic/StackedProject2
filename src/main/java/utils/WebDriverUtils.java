package utils;

import cucumber.api.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils extends Constants{

    /**
     * This class is our Web Driver Utilities class, where we store
     * methods to open and close our browser, as well as additional useful web driver methods
     */
    public static void openBrowserAndLaunchApplication(){
        Driver.getDriver();
        Driver.getDriver().manage().window().maximize();
        Driver.getDriver().get(ConfigReader.getPropertyValue("url"));
        Driver.getDriver().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    public static void closeBrowser(Scenario scenario){

        Driver.getDriver().close();

        if(scenario.isFailed()){
            Driver.getDriver().quit();
        }

    }

    public static void closeBrowser(){

        Driver.getDriver().close();

    }

    public static void explicitWait(int timeInSeconds){
        WebDriverWait w = new WebDriverWait(Driver.getDriver(), timeInSeconds);
    }

    public static void waitForVisibility(WebElement element){
        WebDriverWait w = new WebDriverWait(Driver.getDriver(), WAIT_FOR_VISIBILITY);
        w.until(ExpectedConditions.visibilityOf(element));
    }


}



