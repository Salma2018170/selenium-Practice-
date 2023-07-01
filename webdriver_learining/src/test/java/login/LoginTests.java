package login;

import basics.Try;
import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.LoginPage;
import pages.SecurePageArea;

import static org.testng.Assert.*;

public class LoginTests extends Try {
    @Test
    public void testSuccessfulLogin(){
       LoginPage loginPage= homePage.clickFormAuthentication();
       loginPage.setUserName("tomsmith");
       loginPage.setPassword("SuperSecretPassword!");
       SecurePageArea securePageArea=loginPage.clickLoginButton();
       //securePageArea.check();
       assertTrue( securePageArea.check().contains("You logged into a secure area!"),"Alert text is incorrect");

    }
    @Test
    public void dropDown(){
        DropDownPage dropDownPage = homePage.dropDownForm();

        //securePageArea.check();
        assertTrue( securePageArea.check().contains("You logged into a secure area!"),"Alert text is incorrect");

    }

}
