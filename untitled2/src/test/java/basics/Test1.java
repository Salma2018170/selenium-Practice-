package basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Test1 {
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("platformName", "Android");
//        capabilities.setCapability("appium:automationName", "UiAutomator2");
//        capabilities.setCapability("appium:deviceName", "4DSWVK4LCQORAI8H");
//       capabilities.setCapability("appium:app", "/data/app/com.dencreak.dlcalculat");
//       driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("4DSWVK4LCQORAI8H")
                .setAppPackage("com.dencreak.dlcalculator")
                .setAppActivity("com.dencreak.dlcalculator.DLCalculatorActivity")

                ;
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options
        );

    }

    @Test
    public void clickOnButton() {
        driver.findElement(By.id("pad_btn_d_a")).click();
        driver.findElement(By.id("pad_img_d_d")).click();
        driver.findElement(By.id("pad_btn_d_c")).click();
        driver.findElement(By.id("pad_img_e_d")).click();
        Assert.assertEquals(driver.findElement(By.id("lay_normal_body_val")).getText(),"4");
    }

    @AfterTest
    public void tearDown(){
        if (null!=driver)
        {
            driver.quit();
        }
    }
}
