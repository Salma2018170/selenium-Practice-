package dropdowmpage;

import basics.Try;
import org.testng.annotations.Test;
import pages.DropDownPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropdownTest extends Try {
    @Test
    public void dropdownGetElements(){
        var dropDownPage = homePage.dropDownForm();

        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        var selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(), 1, "Incorrect number of selections");
        assertTrue(selectedOptions.contains(option), "Option not selected");
    }
}
