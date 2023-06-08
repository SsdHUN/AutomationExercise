import PageFactory.BasePage;
import PageFactory.HomePage;
import PageFactory.LoginPage;

import PageFactory.RegisterPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Util.Util.*;

public class Register{

    static LoginPage loginPage;
    static RegisterPage registerPage;

    @BeforeEach
    public void init() {
        loginPage = new LoginPage();
        registerPage = new RegisterPage();
        loginPage.navigateToHomePage();
    }

    @Test
    public void Register() {
        loginPage.clickLoginRegisterBtn();
        loginPage.fillSingupForm();
        registerPage.fillRegisterForm();
        registerPage.hideElements();
        registerPage.waitToPresentCreateAccount();
        registerPage.clickContinueBtn();
        Assertions.assertTrue(registerPage.checkLoggedUserName(REGISTER_NAME));
        registerPage.clickDeleteAccount();
        registerPage.hideElements();
        registerPage.waitToPresentDeleteAccount();
        registerPage.clickContinueBtn();
    }

    @AfterEach
    public void shutdown(){
        loginPage.quit();
    }
}


