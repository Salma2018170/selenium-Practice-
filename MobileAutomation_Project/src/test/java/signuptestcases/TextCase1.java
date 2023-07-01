package signuptestcases;

import basics.Base;
import org.json.simple.parser.ParseException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import screens.SignUpScreen;
import utils.JsonReader;

import java.io.IOException;

public class TextCase1 extends Base {
    protected SignUpScreen signUpScreen;
    @DataProvider(name = "signup data")
    public Object[][] passData() throws IOException, ParseException {
        return JsonReader.getJSONSignUpData(System.getProperty("user.dir") + "/data/SignUpData.json", "customers", 4);
    }

    // protected HomeScreen homeScreen;
    //  protected MyAccountScreen myAccountScreen;
    //  protected SignInScreen signInScreen;


    @Test
    public void testSignUp(){
        signUpScreen.setFirstName("firstname");
        signUpScreen.setLastName("lastname");
        signUpScreen.setEmail("firstname@gmail.com");
        signUpScreen.setPassword("password123@salm352");
        signUpScreen.clickSigUpButton();
//        if(){
//
//        }
    }
}
