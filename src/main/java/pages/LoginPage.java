package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    WebDriver driver;
    //element
    final private By usernameField= By.id("username");
    final private By passwordField= By.id("password");
    final private By loginButton= By.id("submitBtn");
    public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void SetUserName(String userName){
        WebElement element=driver.findElement(usernameField);
        element.clear();
        element.sendKeys(userName);
    }
    public void SetPassword(String password){
        WebElement element=driver.findElement(passwordField);
        element.clear();
        element.sendKeys(password);
    }
    public void submit(){
        driver.findElement(loginButton).click();
    }
}
