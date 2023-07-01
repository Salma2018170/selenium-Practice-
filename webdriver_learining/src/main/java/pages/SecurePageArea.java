package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SecurePageArea {
    private By statusAlert=By.id("flash");
    private WebDriver driver;
    public SecurePageArea(WebDriver driver){
        this.driver=driver;
    }
    public String check(){
       return driver.findElement(statusAlert).getText();
        //System.out.println(statusText);
    }
}
