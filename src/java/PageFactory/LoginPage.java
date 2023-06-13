package PageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
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
    @FindBy(xpath = "//input[@data-qa='login-email']")
    WebElement loginEmailAddress;
    @FindBy(xpath = "//input[@data-qa='login-password']")
    WebElement loginPassword;
    @FindBy(xpath = "//button[@data-qa='login-button']")
    WebElement loginBtn;
    @FindBy(xpath ="//h2[contains(text(),'Login to your account')]" )
    WebElement loginText;
    @FindBy(xpath = "//a[@href='/logout']")
    WebElement logoutBtn;
    @FindBy(xpath = "//p[contains(text(),'Your email or password is incorrect!')]")
    WebElement incorrectUserErrorMsg;


    public void clickLogoutBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(logoutBtn));
        logoutBtn.click();
    }
    public void clickLoginRegisterBtn(){
        wait.until(ExpectedConditions.visibilityOf(loginRegisterButten));
        loginRegisterButten.click();
    }
    public void waitToPresentSingupText(){
        wait.until(ExpectedConditions.visibilityOf(singupText));
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
    public void fillLoginEmailAddress(String email){
        loginEmailAddress.sendKeys(email);
    }
    public void fillLoginPassword(String password){
        loginPassword.sendKeys(password);
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
    public void waitToPrestLoginText(){
        wait.until(ExpectedConditions.visibilityOf(loginText));
    }
    public String PresentErrorMsg(){
        wait.until(ExpectedConditions.elementToBeClickable(incorrectUserErrorMsg));
        return incorrectUserErrorMsg.getText();
    }
    public void navigateToHomePage(){
        driver.get(BASE_URL);
    }
    public void navigateToLoginPage(){
        driver.get(BASE_URL+"/login");
    }

    public void fillLoginForm(String email, String password){
        waitToPrestLoginText();
        fillLoginEmailAddress(email);
        fillLoginPassword(password);
        clickLoginBtn();
    }
    public void fillSingupForm(){
        fillSingUpName(REGISTER_NAME);
        fillSingUpEmail(REGISTER_EMAIL);
        clickSingUpBtn();

    }
}
