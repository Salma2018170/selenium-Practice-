package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLAndTitle {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.selenium.dev/");

        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        String title= driver.getTitle();
        System.out.println("Title is :"+ title);

        //Page source :html & css
        String pageSource= driver.getPageSource();
        System.out.println("Page Source:"+ pageSource);
driver.quit();
    }
}
