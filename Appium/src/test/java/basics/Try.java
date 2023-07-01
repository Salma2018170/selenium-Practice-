package basics;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Try {
    AndroidDriver driver;
    Actions action;
    // AndroidTouchAction touchAction;

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
                .setAppPackage("com.dencreak.dlcalculator").
                setAppActivity("com.dencreak.dlcalculator.DLCalculatorActivity");
        driver = new AndroidDriver(
                // The default URL in Appium 1 is http://127.0.0.1:4723/wd/hub
                new URL("http://localhost:4723"), options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test
    public void scrollDown() throws IOException {

        //Thread.sleep(500);
        WebElement settingList = driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"More options\"]"));
        settingList.click();
        // Thread.sleep(1000);
        WebElement setting = driver.findElement(By.xpath("//*[@text='Settings']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(setting));
        setting.click();
        //Thread.sleep(1000);
        // driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Cleveni Inc.\"));"));
        //scroll using UIAutomator
        WebElement element = driver.findElement(AppiumBy.androidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true))" +
                        ".scrollIntoView(new UiSelector().text(\"Cleveni Inc.\"))"));
        element.click();
        //Thread.sleep(500);
        screenShot("testcase2");
    }

    public void screenShot(String testCaseImage) throws IOException {
        File snapShot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File targetFile = new File("images/" + testCaseImage + ".jpg");
        FileUtils.copyFile(snapShot, targetFile);
    }

    public void trySomeThings() throws InterruptedException, IOException {
        action = new Actions(driver);
        //action.dragAndDrop("","");
        WebElement element = driver.findElement(By.xpath(""));

        //take snapshot
        Thread.sleep(500);
        //screenShot("testcase3");
        Wait wait = new FluentWait(driver).pollingEvery(Duration.ofSeconds(34));
        //scroll down different way
        //Drag and drop
        //first way
        action.clickAndHold().moveToElement(element).build().perform();
        //second way

        action.dragAndDrop(element, element).build().perform();

        ///Swipe
         // action.s

    }


//    @AfterTest
//    public void tearDown() {
//        if (null != driver) {
//            driver.quit();
//        }
//    }
}
