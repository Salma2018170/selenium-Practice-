package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitAndClose {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/");

        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        String title= driver.getTitle();
        System.out.println("Title is :"+ title);
        driver.close();//close current window
        driver.quit(); //close all windows and tabs
    }
}
