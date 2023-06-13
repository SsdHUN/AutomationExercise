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

    public static String REGISTER_NAME = readProperty("registerName");
    public static String REGISTER_EMAIL = readProperty("registerEmail");

    public static String REAL_USER = readProperty("realUser");
    public static String REAL_EMAIL = readProperty("realEmali");

    public static String PASSWORD = readProperty("password");

    public static String WRONG_EMAIL = readProperty("wrongEmail");
    public static String WRONG_PASSWORD = readProperty("drowssap");

    public static String TITLE = readProperty("title");
    public static String BIRTH_DAY = readProperty("birthDay");
    public static String BIRTH_MONTH = readProperty("birthMonth");
    public static String BIRTH_YEAR = readProperty("birthYear");
    public static String FIRST_NAME = readProperty("firstName");
    public static String LAST_NAME = readProperty("lastName");
    public static String ADDRESS = readProperty("address");
    public static String STATE = readProperty("state");
    public static String COUNTRY = readProperty("country");
    public static String CITY = readProperty("city");
    public static String ZIPCODE = readProperty("zipcode");
    public static String MOBILE_NUMBER = readProperty("mobileNumber");

}
