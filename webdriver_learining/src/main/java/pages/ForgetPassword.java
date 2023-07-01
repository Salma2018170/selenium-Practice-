package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.security.PublicKey;

public class ForgetPassword {
   private WebDriver driver;
    ForgetPassword(WebDriver driver){
        this.driver=driver;
    }
    public void setEmail(String email){
         driver.findElement(By.id("email")).sendKeys(email);    }
    public EmailForPasswordSend clickButoon(){
        driver.findElement(By.id("form_submit")).click();
        return new EmailForPasswordSend (driver);
    }
}

