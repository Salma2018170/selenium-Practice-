package basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenTesting {

//    @Test (dataProvider = "logInData")
//    public void logIn (String email, String password, boolean success)
//    {
//        System.out.println("Log In Credentials: " + "\n" +
//                "  Email = " + email + "\n" +
//                "  Password = " + password + "\n" +
//                "  Successful Log In = " + success + "\n" );
//    }
//
//    @DataProvider(name = "logInData")
//    public Object [] [] logInData ()
//    {
//        Object [][] data = new Object [3][3];
//
//        data [0][0] = "TestNG@Framework.com";		data [0][1] = "TestNG1234";		data [0][2] = true;
//        data [1][0] = "Joe@Doe.com";			data [1][1] = "DoeDoe34";		data [1][2] = false;
//        data [2][0] = "Test@AutomationU.com";		data [2][1] = "TAU1234";		data [2][2] = true;
//
//        return data;
//    }

@DataProvider (name = "signin-provider")
public  Object [] [] signInData ()
{
    Object [] [] data = new Object [4] [3];

    data [0] [0] = "Invalid";		data [0] [1] = "Invalid123";		data [0] [2] = false;
    data [1] [0] = "Admin";			data [1] [1] = "admin123";		data [1] [2] = true;
    data [2] [0] = "admin";			data [2] [1] = "admin123";		data [2] [2] = true;
    data [3] [0] = "NotValid";		data [3] [1] = "NotValid34";		data [3] [2] = false;

    return data;
}
    WebDriver driver;

    @Test (dataProvider = "signin-provider")
    public void signIn (String username, String password, boolean success)
    {
       // System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rex Allen Jones II\\Downloads\\Drivers\\chromedriver.exe");

        WebDriverManager.chromedriver().setup();
       // driver.manage().window().maximize();
        driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com");

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        System.out.println("Sign In Credentials: " + "\n" +
                "  Username = " + username + "\n" +
                "  Password = " + password + "\n" +
                "  Successful Sign In = " + success + "\n" );

        String actualResult = driver.getCurrentUrl();
                String expectedResult = "https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
        Assert.assertEquals(actualResult, expectedResult, "The Actual & Expected Results Do Not Match");

        driver.quit();
    }
}
