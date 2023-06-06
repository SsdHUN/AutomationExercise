package PageFactory;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.lang.reflect.Array;
import java.util.ArrayList;

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
    @FindBy(xpath = "//input[id='newsletter']")
    WebElement newsletterChackbox;
    @FindBy(xpath = "//input[id='optin']")
    WebElement Receivechackbox;
    @FindBy(xpath = "//input[@data-qa='first_name']")
    WebElement firstName;
    @FindBy(xpath = "//input[@data-qa='last_name']")
    WebElement lastName;
    @FindBy(xpath = "//input[@data-qa='addres']")
    WebElement address;
    @FindBy(xpath = "//input[@data-qa='county']")
    WebElement county;
    @FindBy(xpath = "//input[@data-qa='state']")
    WebElement state;
    @FindBy(xpath = "//input[@data-qa='city']")
    WebElement city;
    @FindBy(xpath = "//input[@data-qa='zipcode']")
    WebElement zipcode;
    @FindBy(xpath = "//input[@data-qa='mobile_number']")
    WebElement mobileNumber;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    WebElement createAccuntBtn;


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
        newsletterChackbox.click();
    }
    public void clickReceivechackbox(){
        Receivechackbox.click();
    }
    public void fillFirstAndLastName(String fName, String lName){
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
    }
    public void fillAddres(String Address){
        address.sendKeys(Address);
    }
    public  void fillCounty(String County){
        county.sendKeys(County);
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
    public void clickCreateAccuntBtn(){
        createAccuntBtn.click();
    }

}
