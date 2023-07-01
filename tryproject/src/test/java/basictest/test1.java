package basictest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.MobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.AndroidDescriptor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.print.DocFlavor;
import java.net.MalformedURLException;
import java.net.URL;

public class test1 {
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
//        DesiredCapabilities capabilities=new DesiredCapabilities();
//        capabilities.setCapability("platformName","Android");
//        capabilities.setCapability("appium:automationName", "UiAutomator2");
//        capabilities.setCapability("appium:deviceName", "4DSWVK4LCQORAI8H");
//        capabilities.setCapability("browserName", "Chrome");
//        capabilities.setCapability("appium:noReset",true);
//        WebDriverManager.chromedriver().setup();
//        capabilities.setCapability("chromedriverExecutable",WebDriverManager.chromedriver().getBrowserPath());
//        driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
//        driver.get("www.google.com");
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android")
                .setAutomationName("UiAutomator2")
                .setDeviceName("4DSWVK4LCQORAI8H")
                .setAppPackage("com.coloros.alarmclock")
                .setNoReset(true)
                .setAppActivity("com.coloros.alarmclock.AlarmClock");
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
    }

    @Test
    public void tryTest() {
      //try clear()
      //try getattribute()
    }

}
