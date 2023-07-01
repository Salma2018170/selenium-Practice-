package OpeningBrowzer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class openChromBowzer {

    public static void main(String[] args) {
        //using bonigarcia to open web browzer
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        //using get method to open any url
        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.quit();
    }
}
