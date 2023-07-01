package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Test1 {
    AndroidDriver driver;
    Actions action;
    // AndroidTouchAction touchAction;

    @BeforeTest
    public void setUp() throws MalformedURLException {

        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android").
                setAutomationName("UiAutomator2").
                setDeviceName("4DSWVK4LCQORAI8H")
                .setAppPackage("com.noon.buyerapp").
                setAppActivity("com.noon.buyerapp.MainActivity");
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

//    @Test
//    public void goToHomePageBeforeSingIn() throws InterruptedException {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
//        By egyptButton = By.xpath("(//*[@text='Egypt'])");
//        driver.findElement(egyptButton).click();
//        // Thread.sleep(3000);
//        WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
//        wait.until(ExpectedConditions.visibilityOf(permission));
//        permission.click();
//        //Thread.sleep(5000);
//        By confirmLocation = By.xpath("(//android.widget.TextView[@text='CONFIRM LOCATION'])");
//        WebElement confirm = driver.findElement(confirmLocation);
//        wait.until(ExpectedConditions.visibilityOf(confirm));
//        confirm.click();
//
//    }
    @Test
    public void goToHomePageBeforeSingUp() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        By egyptButton = By.xpath("(//*[@text='Egypt'])");
        driver.findElement(egyptButton).click();
        // Thread.sleep(3000);
        WebElement permission = driver.findElement(By.id("com.android.permissioncontroller:id/permission_allow_foreground_only_button"));
        wait.until(ExpectedConditions.visibilityOf(permission));
        permission.click();
        //Thread.sleep(5000);
        By confirmLocation = By.xpath("(//android.widget.TextView[@text='CONFIRM LOCATION'])");
        WebElement confirm = driver.findElement(confirmLocation);
        wait.until(ExpectedConditions.visibilityOf(confirm));
        confirm.click();

        //my accout
         driver.findElement(By.xpath("(//android.widget.TextView[@text='My Account'])")).click();
         //sign in
        driver.findElement(By.xpath("//android.widget.TextView[@text='Sign In']")).click();
        //


        //you can change follwing point based on your link location
        WebElement element= driver.findElement(By.xpath("//android.widget.TextView[@text='Don’t have an account? Sign Up']"));
        Point point = element.getLocation();
        int x = (int) (point.x +10);
        int y = point.y + element.getSize().getHeight() - 1;
        System.out.println(x+" "+y);
        Actions actions=new Actions(driver);
        actions.moveToElement(element,x,y).click().build().perform();


    }

    //    @Test
//    public void clickOnButton() {
////        driver.findElement(By.id("pad_btn_d_a")).click();
////        driver.findElement(By.id("pad_img_d_d")).click();
////        driver.findElement(By.id("pad_btn_d_c")).click();
////        driver.findElement(By.id("pad_img_e_d")).click();
////        Assert.assertEquals(driver.findElement(By.id("lay_normal_body_val")).getText(),"4");
//
//    }


    public void scrollDown() {

    }

//    @Test
//    public void scrollDownTest() {
//
//        // WebElement skipSignInButton=driver.findElement(By.id("skip_sign_in_button"));
//        //action
//        // driver.executeScript(,);
//    }

//    @AfterTest
//    public void tearDown(){
//        if (null!=driver)
//        {
//            driver.quit();
//        }
//    }
}
