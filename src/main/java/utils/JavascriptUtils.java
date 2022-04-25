package utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavascriptUtils {

    /**
     * This class is our Javascript Utilities class, where we store
     * methods to execute javascript commands
     */

   public static JavascriptExecutor executor = (JavascriptExecutor)Driver.getDriver();

    public static void jsClick(WebElement elementToBeClicked){
        executor.executeScript("arguments[0].click();", elementToBeClicked);
    }

    public static void jsScrollIntoView(WebElement elementScrolledIntoView){
        executor.executeScript("arguments[0].scrollIntoView(true);", elementScrolledIntoView);

    }
    public static void jsScrollUp(int scrollUp){
        executor.executeScript("window.scrollBy(0,-"+scrollUp+")");

    }

    public static void jsScrollDown(int scrollDown){
        executor.executeScript("window.scrollBy(0,"+scrollDown+")");

    }

    public static void jsScroll(int scroll){
        executor.executeScript("window.scrollBy(0,"+scroll+")");

    }

}
