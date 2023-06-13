import PageFactory.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static Util.Util.*;

public class Login {

    static LoginPage loginPage;
    static String ERROR_MSG ="incorrect!";
    @BeforeEach
    public void init(){
        loginPage = new LoginPage();
        loginPage.navigateToHomePage();
        loginPage.clickLoginRegisterBtn();
    }


    @Test
    public void successLogin(){
        loginPage.fillLoginForm(REAL_EMAIL,PASSWORD);
        boolean username = loginPage.checkLoggedUserName(REAL_USER);
        loginPage.clickLogoutBtn();
        Assertions.assertTrue(username);
        loginPage.clickLogoutBtn();

    }
    @Test
    public void incorrectEmailAndPassword(){
        loginPage.fillLoginForm(WRONG_EMAIL,PASSWORD);
        loginPage.clickLogoutBtn();
        //String currentErrorMsg = loginPage.PresentErrorMsg();
        loginPage.PresentErrorMsg();
        //Assertions.assertEquals(ERROR_MSG,currentErrorMsg);
    }
    @AfterEach
    public void shutdown(){

    }

}
