package PageFactory;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriverWait wait;
    WebDriver driver;
    String bwrowserType = System.getProperty("browserType");

    public BasePage(){
        if (bwrowserType == null){
            bwrowserType = "Chrome";
        }
        this.driver = WebDriverFactory.createWebDriver(bwrowserType);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }

    public void quit(){
        WebDriverFactory.shutDown();
    }
}
