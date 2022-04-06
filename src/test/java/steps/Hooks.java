package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.WebDriverUtils;

public class Hooks extends WebDriverUtils {

    @Before
    public void start(){
        openBrowserAndLaunchApplication();
    }
    @After
    public void end(){
        closeBrowser();
    }
}
