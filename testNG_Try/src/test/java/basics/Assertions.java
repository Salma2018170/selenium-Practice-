package basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
@Test
public class Assertions {

    @Test(groups = {"groupA"})
    public void method_1(){
        System.out.println("Inside method_1()");
    }

    @Test(groups = {"groupA"})
    public void method_2(){
        System.out.println("Inside method_2()");
    }

    @Test(dependsOnGroups = "groupA")
    public void methodB(){
        System.out.println("methodB invoked.");
    }
//    //WebDriver driver = new ChromeDriver();
//    SoftAssert softAssert=new SoftAssert();
//    @Test(priority = 2)
//    public void search1() {
//
//       // Assert.assertTrue(false, "right<<<>>>");
////        System.out.println("1");1
//        //softAssert.assertFalse(false, "not right ");
//       // System.out.println("2");
//        //softAssert.assertTrue(true, "not true");
//        System.out.println("search 1");
//        //softAssert.assertAll();
//    }


//    @Test (priority = 0)
//    public void CloseBrowser() {
//        driver.close();
//        Reporter.log("Driver Closed After Testing");
//    }
//
//    @Test (priority = -1)
//    public void OpenBrowser() {
//        Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
//        Reporter.log("Launching Google Chrome Driver version 81 for this test");
//
//        driver.get("https://www.demoqa.com");
//        SoftAssert softassert = new SoftAssert();
//        Reporter.log("The website used was DemoQA for this test", true);
//        String expectedTitle = "Free QA Automation Tools For Everyone";
//        String originalTitle = driver.getTitle();
//        softassert.assertEquals(originalTitle, expectedTitle);
//        System.out.println("*** Checking For The Second Title ***");
//// Checking title for ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation
//        softassert.assertEquals(originalTitle, "ToolsQA – Demo Website to Practice Automation – Demo Website to Practice Automation" );
//        softassert.assertAll();
//
//    }
}
