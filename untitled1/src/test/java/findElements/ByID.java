package findElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ByID {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hatem-hatamleh.github.io/Selenium-html/");
        //helpful if you have source of page

        String Id= driver.findElement(By.id("welcome")).getText();
        // driver.findElement(By.name("Discrupation")).getText();
       // //note
        // //we cannot use comp classname like "input web "
       // driver.findElement(By.className("input"));

        //using tag_name but don't use because very general like "h1"
       // driver.findElement(By.tagName("p"));
        // // find by link text nst8dm el text  nafsh
        //driver.findElement(By.linkText("Welcome to QAcart Website"));
        //msh lazym kol text
        //driver.findElement(By.partialLinkText("welcome to"));

     //     //*[@id="post-311263"]/div[1]/div[1]/h1    "Relative path"
     //    /html/body/div[4]/div[2]/div/div[2]/div/div/div[1]/article/div[1]/div[1]/h1   "absolute path"
        // * = tag name
        String xPath= driver.findElement(By.xpath("//*[@id=\"welcome\"]")).getText();
        System.out.println(xPath);
        //$x("//*[text()='Actions']") //to find element using text 
        //WebElement
        driver.quit();
    }
}
