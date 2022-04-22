package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.CommonMethods;

/**
 * This class is a Hooks class which will run blocks of code before and after
 * our scenarios from our feature files. We use the @Before annotation to run our
 * opening methods and our @After annotation to run our closing methods
 */


public class Hooks extends CommonMethods {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void end(){
        closeBrowser();
    }
}
