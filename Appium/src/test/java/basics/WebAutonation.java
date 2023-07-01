package basics;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class WebAutonation {
    AndroidDriver driver;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        //

//
        UiAutomator2Options options = new UiAutomator2Options()
                .setPlatformName("Android").
                setAutomationName("UiAutomator2").
                setDeviceName("4DSWVK4LCQORAI8H")
                .withBrowserName("Chrome")
                .setNoReset(true);
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
        // driver.manage().
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void testWeb() {

    }
}
