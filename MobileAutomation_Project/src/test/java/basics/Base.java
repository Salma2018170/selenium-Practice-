package basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.junit.Before;
import org.testng.annotations.*;
import screens.HomeScreen;
import screens.LocationsScreen;
import screens.MyAccountScreen;
import screens.SignInScreen;

import java.io.File;
import java.io.FileInputStream;

import java.io.IOException;

import java.net.URL;
import java.time.Duration;
import java.util.Properties;

public class Base {
    protected LocationsScreen locationsScreen;
    AndroidDriver driver;
    protected HomeScreen homeScreen;
    protected MyAccountScreen myAccountScreen;
    protected SignInScreen signInScreen;
  Properties properties=new Properties();


    @BeforeTest
    public void setUp() throws IOException {
        File file=new File("src/main/java/properties/config.properties");
        FileInputStream stream=new FileInputStream(file);
        properties.load(stream);
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName(properties.getProperty("platformName"))
                .setAutomationName("UiAutomator2")
                .setDeviceName(properties.getProperty("deviceName"))
                .setAppPackage(properties.getProperty("appPackage"))
                .setAppActivity(properties.getProperty("appActivity"))
                .setNoReset(true);
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        locationsScreen = new LocationsScreen(driver);
    }


//    @AfterClass
//    public void tearDown() {
//        if (null != driver) {
//            driver.quit();
//        }
//    }
}
