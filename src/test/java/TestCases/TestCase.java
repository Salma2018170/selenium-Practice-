package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.GooglePage;
import pages.HomePage;
import pages.LoginPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestCase {
    WebDriver driver;
    GooglePage googlePage;
    HomePage homePage;
    LoginPage loginPage;
    @BeforeTest
    public void setup(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.navigate().to("https://www.google.com/");
        googlePage=new GooglePage(driver);
    }
    @Test
    public void Tc1_SearchFor(){
        googlePage.search("vodafone");
       homePage= googlePage.goTOSpecificPage();
    }
    @Test
    public void Tc2_goToLoginPage(){
       loginPage=homePage.goToLogIn();
    }
    @Test
    public void Tc3_login(){
        loginPage.SetUserName("01008844640");
        loginPage.SetPassword("11338899Sal#");
        loginPage.submit();
    }

    @AfterTest
    public void tearDown(){
//        driver.quit();
        System.out.println("ya rab el saber");
    }
}
