package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.CommonMethods;

import java.io.File;
import java.io.IOException;

/**
 * This class is a Hooks class which will run blocks of code before and after
 * our scenarios from our feature files. We use the @Before annotation to run our
 * opening methods and our @After annotation to run our closing methods
 */


public class Hooks extends CommonMethods {

    @Before
    public void start() {
        openBrowserAndLaunchApplication();
    }

    @After
    public void end(Scenario scenario) {

        //method to take screenshot on test failure
        if (scenario.isFailed()) {
            try {
                TakesScreenshot ts = (TakesScreenshot) driver;
                byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
                //Declare source file
                File sourceFile = ts.getScreenshotAs(OutputType.FILE);
                //Declare file destination
                try {
                    FileUtils.copyFile(sourceFile, new File(FAILED_SCENARIO_SCREENSHOT_FILEPATH + "Failed" + " " + getTimeStamp("MM-dd-yyyy-HH-mm-ss") + ".png"));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (Exception e){}
        }
        closeBrowser();
    }
}

