package PageFactory;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static Util.Util.*;

public class RegisterPage extends BasePage {

    public RegisterPage(){
        super();
    }
    @FindBy(xpath = "//b[contains(text(),'Enter Account Information')]")
    WebElement enterAccountText;
    @FindBy(xpath = "//label[@for='id_gender1']")
    WebElement titleMr;
    @FindBy(xpath = "//label[@for='id_gender2']")
    WebElement titleMrs;
    @FindBy(xpath = "//input[@data-qa='password']")
    WebElement password;
    @FindBy(xpath = "//select[@data-qa='days']")
    WebElement birthDay;
    @FindBy(xpath = "//select[@data-qa='months']")
    WebElement birthMonth;
    @FindBy(xpath = "//select[@data-qa='years']")
    WebElement birthYear;
    @FindBy(xpath = "//input[@id='newsletter']")
    WebElement newsletterChackbox;
    @FindBy(xpath = "//input[@id='optin']")
    WebElement Receivechackbox;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@data-qa='address']")
    WebElement address;
    @FindBy(xpath = "//select[@data-qa='country']")
    WebElement country;
    @FindBy(xpath = "//input[@data-qa='state']")
    WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccountBtn;
    @FindBy(xpath = "//b[contains(text(),'Account Created!')]")
    WebElement accuntCreated;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueBtn;
    @FindBy(xpath = "//a[@href='/delete_account']")
    WebElement deleteAccount;
    @FindBy(xpath = "//b[contains(text(),'Account Deleted!')]")
    WebElement accountDelete;


    public void clickTitle(String title){
        if (title == "Mr"){
            titleMr.click();
        } else {
            titleMrs.click();
        }
    }
    public void fillPassword(String userPassword){
        password.sendKeys(userPassword);
    }
    public void fillBirthDate(String day, String month, String year) {
        birthDay.sendKeys(day);
        birthMonth.sendKeys(month);
        birthYear.sendKeys(year);
    }
    public  void clickNewsletterChackbox(){
        wait.until(ExpectedConditions.elementToBeClickable(newsletterChackbox));
        newsletterChackbox.click();
    }
    public void clickReceivechackbox(){

        wait.until(ExpectedConditions.elementToBeClickable(Receivechackbox));
        Receivechackbox.click();
    }
    public void fillFirstAndLastName(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }
    public void fillAddres(String Address){
        address.sendKeys(Address);
    }
    public void selectCountry(String County){
        country.sendKeys(County);
    }
    public  void fillState(String State){
        state.sendKeys(State);
    }
    public  void fillCity(String City){
        city.sendKeys(City);
    }
    public  void fillZipcode(String Zipcode){
        zipcode.sendKeys(Zipcode);
    }
    public  void fillMobileNumber(String MobileNumber){
        mobileNumber.sendKeys(MobileNumber);
    }
    public void clickCreateAccuntBtn() {
        createAccountBtn.click();
    }
    public void clickDeleteAccount(){
        wait.until(ExpectedConditions.elementToBeClickable(deleteAccount));
        deleteAccount.click();
    }
    public void clickContinueBtn(){
        wait.until(ExpectedConditions.elementToBeClickable(continueBtn));
        continueBtn.click();
    }
    public void waitToPresentCreateAccount(){
        wait.until(ExpectedConditions.visibilityOf(accuntCreated));
    }
    public void waitToPresentDeleteAccount(){
        wait.until(ExpectedConditions.visibilityOf(accountDelete));
    }

    public void fillRegisterForm(){
        hideElements();
        clickTitle(TITLE);
        fillPassword(PASSWORD);
        fillBirthDate(BIRTH_DAY,BIRTH_MONTH,BIRTH_YEAR);
        clickNewsletterChackbox();
        clickReceivechackbox();
        fillFirstAndLastName(FIRST_NAME,LAST_NAME);
        fillAddres(ADDRESS);
        selectCountry(COUNTRY);
        fillState(STATE);
        fillCity(CITY);
        fillZipcode(ZIPCODE);
        fillMobileNumber(MOBILE_NUMBER);
        clickCreateAccuntBtn();
    }
    public void verifyCreateAccount(){ //better name
        hideElements();
        waitToPresentCreateAccount();
        clickContinueBtn();
    }
    public void verifyDeleteAccount(){ //better name
        hideElements();
        waitToPresentDeleteAccount();
        clickContinueBtn();
    }

}
