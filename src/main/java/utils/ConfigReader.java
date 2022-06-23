package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
   private String propertyFilePath = "src/test/resources/testData/config.properties";
   private Properties properties;

    public ConfigReader() {
        try {

            properties = new Properties();
            properties.load(new FileInputStream(propertyFilePath));

        }
        catch (IOException ie) {
        }
    }


    public String applicationURL(){

       return properties.getProperty("appURL");
    }

    public String browserTye(){

        return properties.getProperty("browser");
    }
}