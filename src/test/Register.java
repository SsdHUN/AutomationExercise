import PageFactory.BasePage;
import PageFactory.HomePage;
import PageFactory.LoginPage;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Register{

    static LoginPage loginPage;

    @BeforeEach
    public void init() {
        loginPage = new LoginPage();
        loginPage.navigateToHomePage();
    }

    @Test
    public void Register(){
        loginPage.clickLoginRegisterBtn();
    }

    @AfterEach
    public void shutdown(){
        loginPage.quit();
    }
}


