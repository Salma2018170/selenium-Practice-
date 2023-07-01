package screens;

import basics_funcations.ScreenBase;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HomeScreen extends ScreenBase {
    AndroidDriver driver;
    //Element Path
    By myAccountLogo= By.xpath("(//android.widget.TextView[@text='My Account'])");
    public HomeScreen(AndroidDriver driver) {
        super(driver);
        this.driver=driver;
    }
    public MyAccountScreen openMyAccount(){
       WebElement myAccount= driver.findElement(myAccountLogo);
       click(myAccount);
       return new MyAccountScreen(driver);
    }
}
