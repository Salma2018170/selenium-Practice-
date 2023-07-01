package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Try {
    WebDriver webDriver;

    @Test
    public void kholoudTry() {
        ChromeOptions co = new ChromeOptions();
        co.addArguments("--remote-allow-origins=*");
        webDriver = new ChromeDriver(co);
        webDriver.manage().window().maximize();
        webDriver.get("https://www.google.com/?hl=ar");
        WebElement element = webDriver.findElement(By.xpath("//input[@name=\"q\"]"));
        element.sendKeys("Amazon.com", Keys.RETURN);
        // webDriver.navigate().to("https://www.amazon.com/");
    }
}
