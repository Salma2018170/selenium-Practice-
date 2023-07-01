package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private By userNameField=By.id("username");
    private By passwordField=By.id("password");
    private By loginButton=By.cssSelector("#login button");
    private WebDriver driver;
   public LoginPage(WebDriver driver){
        this.driver=driver;
    }
    public void setUserName(String userName){
    driver.findElement(userNameField).sendKeys(userName);
    }
    public void setPassword(String password){
        driver.findElement(passwordField).sendKeys(password);
    }
    public SecurePageArea clickLoginButton(){
        driver.findElement(loginButton).click();
        return new SecurePageArea(driver);
    }
}
