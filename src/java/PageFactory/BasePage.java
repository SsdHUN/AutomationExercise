package PageFactory;


import org.apache.commons.lang3.StringEscapeUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static Util.Util.TEST_JS_CODE;

public class BasePage {
    WebDriverWait wait;
    WebDriver driver;
    String browserType = System.getProperty("browserType");

    public BasePage(){
        if (browserType == null){
            browserType = "Chrome";
        }
        this.driver = WebDriverFactory.createWebDriver(browserType);
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.manage().window().maximize();
        PageFactory.initElements(driver, this);
    }
    public void hideElements() {
        String jsCode1 = "document.querySelectorAll('[id^=aswift]').forEach(iframe => iframe.remove());";  //better name
        String jsCode2 = "document.querySelectorAll('[class^=adsbygoogle]').forEach(iframe => iframe.remove());";
        ((JavascriptExecutor) driver).executeScript(jsCode1);
        ((JavascriptExecutor) driver).executeScript(jsCode2);
    }
    public void quit(){
        //WebDriverFactory.shutDown();
    }
}
