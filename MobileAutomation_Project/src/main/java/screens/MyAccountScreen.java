package screens;

import basics_funcations.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountScreen extends ScreenBase {
    AndroidDriver driver;
    //element path
    By logIn= By.xpath("//android.widget.TextView[@text='Sign In']");
    By signUp= By.xpath("//android.widget.TextView[@text='Sign Up']");
    public MyAccountScreen(AndroidDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public SignInScreen clickLoginButton(){
        WebElement logInButton=driver.findElement(logIn);
        click(logInButton);
        return new SignInScreen(driver);
    }
    public SignUpScreen clickSignUpButton(){
        WebElement SignUpButton=driver.findElement(signUp);
        click(SignUpButton);
        return new SignUpScreen(driver);
    }
}
