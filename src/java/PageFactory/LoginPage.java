package PageFactory;


import Util.Util;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Util.Util.*;

public class LoginPage extends BasePage {
    public LoginPage(){
        super();
    }

    @FindBy(xpath = "//a[contains(text(), 'Login')]")
    WebElement loginRegisterButten;
    @FindBy(xpath = "//h2[contains(text(), 'New User Signup!')]")
    WebElement singupText;
    @FindBy(xpath = "//input[@data-qa='signup-name']")
    WebElement singUoName;
    @FindBy(xpath = "//input[@data-qa='signup-email']")
    WebElement singUpEmail;
    @FindBy(xpath = "//button[@data-qa='signup-button']")
    WebElement singUpBtn;


    public void clickLoginRegisterBtn(){
        wait.until(ExpectedConditions.visibilityOf(loginRegisterButten));
        loginRegisterButten.click();
    }
    public void waitToPresentSingupText(){
        wait.until(ExpectedConditions.visibilityOf(singupText));
    }
    public void navigateToHomePage(){

        driver.get(BASE_URL);
    }
    public void fillSingUpName(String name){
        singUoName.sendKeys(name);
    }
    public void fillSingUpEmail(String email){
        singUpEmail.sendKeys(email);
    }
    public void clickSingUpBtn(){
        singUpBtn.click();
    }

    public void navigateToLoginPage(){
        driver.get(BASE_URL+"/login");
    }
    public void urlprint(){
        System.out.println(Util.BASE_URL);
    }
}
