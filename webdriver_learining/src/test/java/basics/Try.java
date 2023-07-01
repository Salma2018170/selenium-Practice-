package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.HomePage;

import java.util.List;

public class Try {
    protected HomePage homePage;
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();//check version of chrome set envirmoent varabile
        driver = new ChromeDriver();
        //  Dimension dimension=new Dimension(234,432);
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);

        String url = driver.getCurrentUrl();
        System.out.println(driver.getTitle());
        System.out.println("Url link is: " + url);
        //driver.quit();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
//    public static void main(String[] args) {
//        Try aTry=new Try();
//        aTry.setUp();
//        System.out.println("finshed");
//    }

}
