package go.shubh.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class PropertyReader {

    private Properties properties;

    public PropertyReader(String filePath) {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream(filePath);
            properties.load(fis);
            fis.close();
        } catch (IOException e) {
            e. fillInStackTrace();
        }
    }
    public String getProperty(String key) {
        return properties.getProperty(key);
    }


}
