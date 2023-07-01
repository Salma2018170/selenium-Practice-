package Basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.netty.channel.AdaptiveRecvByteBufAllocator;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviaget {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://open.spotify.com/playlist/6kg132rLx4prLHTeFsoX6M");
        driver.navigate().to("https://www.selenium.dev/");
        // driver.navigate().back();
        // driver.navigate().refresh();
       // driver.navigate().forward();

        driver.quit();

    }
}
