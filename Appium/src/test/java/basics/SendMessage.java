package basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class SendMessage {
    AndroidDriver driver;
    @BeforeTest
    public void setUp() throws MalformedURLException {
//  DesiredCapabilities capabilities = new DesiredCapabilities();
//capabilities.setCapability("platformName", "Android");
// capabilities.setCapability("appium:automationName", "UiAutomator2");
// capabilities.setCapability("appium:deviceName", "4DSWVK4LCQORAI8H");
// capabilities.setCapability("appium:app", "/data/app/com.dencreak.dlcalculat");
//    driver = new AndroidDriver(new URL("http://localhost:4723"), capabilities);
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android").
                setAutomationName("UiAutomator2").
                setDeviceName("4DSWVK4LCQORAI8H")
                .setAppPackage("com.android.mms").
                setAppActivity("com.android.mms.ui.ConversationList")
                .setNoReset(true);
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }
    @Test
    public void send_SMS(){
        //for just emulators
      //driver.sendSMS("01159105985","hi i'm here");
    }
    @Test
    public void ClipBoard(){
        //for just emulators
        //driver.sendSMS("01159105985","hi i'm here");
        String text="hey ";
        driver.setClipboardText(text);
        driver.getClipboardText();

    }
}
