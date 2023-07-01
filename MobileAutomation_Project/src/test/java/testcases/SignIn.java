package testcases;

import basics.Base;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import screens.HomeScreen;
import screens.MyAccountScreen;
import screens.SignInScreen;
import utils.JsonReader;

import java.io.FileNotFoundException;
import java.io.IOException;

import static org.testng.Assert.assertTrue;

public class SignIn extends Base {
    //    @Test
//    public void singInWithInvalidAccount() {
//
//        homeScreen = locationsScreen.confirmYourLocation();
//        myAccountScreen = homeScreen.openMyAccount();
//        signInScreen = myAccountScreen.clickLoginButton();
//        signInScreen.setEmail("SalmaHamedAbd234q@gmail.com");
//        signInScreen.setPassword("1234salma");
//        signInScreen.clickSigInButton();
//        assertTrue( signInScreen.checkMessage("email").contains("Invalid email"),"Alert text is incorrect");
//      //  assertTrue(equals(signInScreen.checkMessage()),"Invalid email");
//    }
//    @DataProvider(name = "login data")
//    public Object[][] passData() throws IOException, ParseException {
//        return JsonReader.getJSONData(System.getProperty("user.dir") + "/data/LoginData.json", "Users", 2);
//    }


    @Test
    public void goToSignPage() {
        homeScreen = locationsScreen.confirmYourLocation();
        myAccountScreen = homeScreen.openMyAccount();
        signInScreen = myAccountScreen.clickLoginButton();
    }

    @Test(dependsOnMethods = "goToSignPage")
    public void singInWithDDT() {
        signInScreen.setEmail("salma@gmail.com");
        signInScreen.setPassword("123salmamohamed");
        signInScreen.clickSigInButton();

        //Stillllllllll asserations not work
       // System.out.println("see messages for test" + signInScreen.checkMessage());
        // assertTrue( signInScreen.checkMessage().contains("Invalid"),"Alert text is incorrect");
        //  assertTrue(equals(signInScreen.checkMessage()),"Invalid email");
    }

}
