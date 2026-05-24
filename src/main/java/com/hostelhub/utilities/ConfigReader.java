package com.hostelhub.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    // Create Properties Reference
    static Properties prop;

    // Load config.properties File
    public static void loadProperties() {

        prop = new Properties();

        try {

            FileInputStream fis = new FileInputStream(
                    "src/test/resources/config.properties");

            prop.load(fis);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }

    // Get Property Value
    public static String getProperty(String key) {

        return prop.getProperty(key);
    }
}
