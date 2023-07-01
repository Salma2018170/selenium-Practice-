package screens;

import basics_funcations.ScreenBase;
import io.appium.java_client.MultiTouchAction;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignInScreen extends ScreenBase {
    //Element
    private final By emailField = By.xpath("//android.widget.EditText[@resource-id='email']");
    //Element Path
    private final By passwordField = By.xpath("//android.widget.EditText[@resource-id='password']");
    private final By loginButton = By.xpath("//android.widget.TextView[@text='Sign In']");
    private final By statusAlertEmail = By.xpath("//android.widget.TextView[@index='1']");
    private final By signUp = By.xpath("//android.widget.TextView[@text='Don’t have an account? Sign Up']");
    AndroidDriver driver;
    Actions actions;

    //  private final By statusAlertPassword = By.xpath("//android.widget.TextView[@text='Invalid password']");


    public SignInScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void setEmail(String email) {
        WebElement emailElement = driver.findElement(emailField);
        clear(emailElement);
        sendKey(emailElement, email);
    }

    public void setPassword(String password) {
        WebElement passwordElement = driver.findElement(passwordField);
        clear(passwordElement);
        sendKey(passwordElement, password);
    }

    public void clickSigInButton() {
        driver.findElement(loginButton).click();
    }

//    public SignUpScreen clickSignUpButton() {
//        WebElement element = driver.findElement(signUp);
//        Point point = element.getLocation();
//
////you can change follwing point based on your link location
//        int x = point.x +1;
//        int y = point.y + element.getSize().getHeight() - 1;
//
//     //   new .tap(x, y).perform();
//       // actions=new Actions(driver)
//
////        WebElement SignUpButton = driver.findElement(signUp);
////        click(SignUpButton);
//     return new SignUpScreen(driver);
//    }

    public String checkMessage() {

        return driver.findElement(statusAlertEmail).getText();

        //System.out.println(statusText);
    }
}
