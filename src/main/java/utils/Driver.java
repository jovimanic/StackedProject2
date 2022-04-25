package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.SessionId;

import java.util.concurrent.TimeUnit;

public class Driver {
    /*
 Creating the private constructor so this class' object
 is not reachable from outside
  */

    private Driver(){
    }

    /*
    Making our 'driver' instance private so that it is not reachable from outside of the class.
    We make it static, because we want it to run before everything else, and also we will use it in a static method
     */
    private static final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    /*
    Creating re-usable utility method that will return same 'driver' instance everytime we call it.
     */
    public static WebDriver getDriver() {

        if (driverPool.get() == null) {

            synchronized (Driver.class) {
        /*
        We read our browser type from configuration.properties file using
        .getPropertyValue method we created in ConfigurationReader class.
         */
                ConfigReader.readProperties(Constants.CONFIGURATION_FILEPATH);
               final String browserType = ConfigReader.getPropertyValue("browser");

        /*
        Depending on the browser type our switch statement will determine
        to open specific type of browser/driver
         */
                switch (browserType) {
                    case "chrome":
                        WebDriverManager.chromedriver().setup();
                        driverPool.set(new ChromeDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
                        break;
                    case "firefox":
                        WebDriverManager.firefoxdriver().setup();
                        driverPool.set(new FirefoxDriver());
                        driverPool.get().manage().window().maximize();
                        driverPool.get().manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
                        break;
                    default: throw new RuntimeException("Invalid browser name");

                }
                SessionId s = ((RemoteWebDriver) Driver.getDriver()).getSessionId();
            }
        }

    /*
    Same driver instance will be returned every time we call Driver.getDriver(); method
     */
        return driverPool.get();


    }

    /*
    This method makes sure we have some form of driver session or driver id has either null or not null it must exist.
     */
    public static void closeDriver() {
        if (driverPool.get() != null) {
            driverPool.get().quit();
            driverPool.remove();
        }
    }


}
