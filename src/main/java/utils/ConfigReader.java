package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    /**
     * This class is to read our config.properties file (date file)
     */


    static Properties prop;

    public static Properties readProperties(String filePath) {

        try {
            FileInputStream fis = new FileInputStream(filePath);
            prop = new Properties();
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return prop;
    }


    public static String getPropertyValue(String key){
        return prop.getProperty(key);
    }

}
