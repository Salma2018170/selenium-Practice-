package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    WebDriver driver;
    //Element
    By iconLogin=By.xpath("//*[@id=\"loginIcon\"]");
    By loginButton=By.id("InnerloginBtn");

       public HomePage(WebDriver driver){
        this.driver=driver;
    }
    public LoginPage goToLogIn(){
           driver.findElement(iconLogin).click();
           driver.findElement(loginButton).click();
           return new LoginPage(driver);
    }
}
