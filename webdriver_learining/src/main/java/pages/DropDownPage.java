package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;
import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver  driver;
    private By dropdown=By.id("dropdown");
    public DropDownPage (WebDriver driver){
        this.driver=driver;
    }
//    public void checkList(String option){
//
//        selectDropdownElement().deselectByVisibleText(option);
//    }
//    public List<String> getSelectedOptions(){
//        List<WebElement> selectedElements = selectDropdownElement().getAllSelectedOptions();
//        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
//    }
//    private Select selectDropdownElement(){
//         // Select dropdownSelect=new Select(driver.findElement(dropdown));
//          return new Select(driver.findElement(dropdown));
//    }
    public void selectFromDropDown(String option){
        findDropDownElement().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDownElement().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropdown));
    }
}
