package Util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Util {
    public static final String CONFIG_PATH = "src/resources/init.properties";

    public static Properties readConfig(){
        try{
            Properties properties = new Properties();
            properties.load(new FileInputStream(CONFIG_PATH));
            return properties;
        } catch (IOException e){
            System.out.println("Can't read config file");
        }
        return null;
    }
    public static String readProperty(String value){
        Properties properties = readConfig();
        if (properties != null){
            return properties.getProperty(value);
        }else{
            System.out.println("This property do not exist");
            return null;
        }
    }
    public static String BASE_URL = readProperty("baseUrl");



}
