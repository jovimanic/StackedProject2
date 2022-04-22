package utils;

public class Constants {

    /**
     * This class is to store final/constant variables to be accessed easily throughout the project
     */

    //String for file path of configuration properties file
    public static final String CONFIGURATION_FILEPATH = System.getProperty("user.dir")+"/src/main/resources/config/config.properties";

    //String for file path of screenshot storage location 
    public static final String SCREENSHOT_FILEPATH = System.getProperty("user.dir")+"/screenshots/";

    //integers for wait times in seconds
    public static final int IMPLICIT_WAIT = 60;
    public static final int EXPLICIT_WAIT = 30;
    public static final int WAIT_FOR_VISIBILITY = 30;
    
    //Strings for storing page titles/page headers to assert against driver.getTitle()
    public static final String DASHBOARD_HEADER = "\"Dashboard | Stacked\"";




}
