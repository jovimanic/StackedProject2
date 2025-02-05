package utils;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static utils.Constants.SCREENSHOT_FILEPATH;


public class CommonMethods extends WebDriverUtils{

    /**
     * This class is to store our commonly used methods/blocks of code that
     * will be used frequently throughout our project
     */

    public static String getTimeStamp(String pattern){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(date);
    }

    public static byte[] takeScreenshot(String fileName) throws IOException {
        TakesScreenshot ts =(TakesScreenshot)Driver.getDriver();
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        //Declare source file
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        //Declare file destination
        try {
            FileUtils.copyFile(sourceFile,new File(SCREENSHOT_FILEPATH + fileName + " " + getTimeStamp("MM-dd-yyyy-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }

    public static byte[] takeScreenshotOnFailure(String fileName) throws IOException {
        TakesScreenshot ts =(TakesScreenshot)Driver.getDriver();
        byte[] picBytes = ts.getScreenshotAs(OutputType.BYTES);
        //Declare source file
        File sourceFile = ts.getScreenshotAs(OutputType.FILE);
        //Declare file destination
        try {
            FileUtils.copyFile(sourceFile,new File(SCREENSHOT_FILEPATH + fileName + " " + getTimeStamp("MM-dd-yyyy-HH-mm-ss") + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return picBytes;
    }
}
