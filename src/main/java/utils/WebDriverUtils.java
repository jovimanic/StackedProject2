package utils;

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

    public static WebDriver driver;

    public static void openBrowserAndLaunchApplication(){
        ConfigReader.readProperties(CONFIGURATION_FILEPATH);
        switch(ConfigReader.getPropertyValue("browser")){
            case "chrome":
            WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default: throw new RuntimeException("Invalid browser name");
        }
        driver.manage().window().maximize();
        driver.get(ConfigReader.getPropertyValue("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void closeBrowser(){
        driver.quit();
    }

    public static void explicitWait(int timeInSeconds){
        WebDriverWait w = new WebDriverWait(driver, timeInSeconds);
    }

    public static void waitForVisibility(WebElement element){
        WebDriverWait w = new WebDriverWait(driver, WAIT_FOR_VISIBILITY);
        w.until(ExpectedConditions.visibilityOf(element));
    }


}



