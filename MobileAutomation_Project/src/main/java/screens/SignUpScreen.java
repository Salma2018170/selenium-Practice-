package screens;

import basics_funcations.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SignUpScreen extends ScreenBase {
    //Element for Sign up
    private final By firstName = By.xpath("//android.view.ViewGroup[@index='4']");
    private final By lastName = By.xpath("//android.view.ViewGroup[@index='6']");
    private final By email = By.xpath("//android.view.ViewGroup[@index='8']");
    private final By password = By.xpath("//android.view.ViewGroup[@index='10']");
    private final By signUpButton = By.xpath("//android.widget.TextView[@text='Sign Up']");
    AndroidDriver driver;

    public SignUpScreen(AndroidDriver driver) {
        super(driver);
        this.driver = driver;
    }

    public void setFirstName(String firstNameStr) {
        Actions actions = new Actions(driver);
        WebElement firstNameField = driver.findElement(firstName);
        firstNameField.click();
        firstNameField.clear();
        actions.sendKeys(firstNameStr).build().perform();
        //
        // firstNameField.sendKeys(firstNameStr);

    }

    public void setLastName(String lastnameStr) {
        Actions actions = new Actions(driver);
        WebElement lastNameField = driver.findElement(lastName);
        lastNameField.click();
        lastNameField.clear();
        actions.sendKeys(lastnameStr).build().perform();
        //  actions.sendKeys(lastnameStr).build().perform();
    }

    public void setEmail(String emailStr) {
        Actions actions = new Actions(driver);
        WebElement emailField = driver.findElement(email);
        emailField.click();
        emailField.clear();
        actions.sendKeys(emailStr).build().perform();
    }

    public void setPassword(String passwordStr) {
        Actions actions = new Actions(driver);
        WebElement passwordField = driver.findElement(password);
        passwordField.click();
        passwordField.clear();
        actions.sendKeys(passwordStr).build().perform();
        if (driver.isKeyboardShown()) {
            driver.hideKeyboard();
        }

    }

    public MyAccountScreen clickSigUpButton() {
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(signUpButton);
        waitForElement(element);
        actions.click(element).perform();
        //actions.click(element).build().perform();
        return new MyAccountScreen(driver);
    }

}
