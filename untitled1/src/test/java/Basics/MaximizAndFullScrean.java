package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximizAndFullScrean {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        //first visit website
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        //second max & fullscreen website
      //  driver.manage().window().maximize();
        driver.manage().window().fullscreen();


    }
}
