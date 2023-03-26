package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    WebDriver driver;
    private By searchButton=By.xpath("//*[@name='q']");
    private By homeLink=By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3");
    public GooglePage(WebDriver driver){
        this.driver=driver;
    }
    public void search(String text){
        WebElement search=driver.findElement(searchButton);
        search.sendKeys(text, Keys.ENTER);
    }
    public HomePage goTOSpecificPage(){
       driver.findElement(homeLink).click();
       return new HomePage(driver);
    }
}
