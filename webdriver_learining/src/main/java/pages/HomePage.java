package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }
    public void clickLink(String link)
    {
        driver.findElement(By.linkText(link)).click();
    }

    public LoginPage clickFormAuthentication() {
        clickLink("Form Authentication");
        System.out.println("Url next page"+driver.getCurrentUrl());
        return new LoginPage(driver);

    }
    public DropDownPage dropDownForm() {
        clickLink("Dropdown");
      //  System.out.println("Url next page "+driver.getCurrentUrl());
        return new DropDownPage(driver);

    }
    public ForgetPassword clickForgetPassword(){
        clickLink("Forgot Password");
        return  new ForgetPassword(driver);
    }
}
