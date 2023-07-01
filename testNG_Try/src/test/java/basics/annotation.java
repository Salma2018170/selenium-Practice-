package basics;

import org.testng.annotations.*;

public class annotation {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("open URL");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("welcome to website");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Sign up");
    }
    @BeforeMethod
    public void beforeMethode() {
        System.out.println("search.........");
    }
    @Test
    public void searchProduct() {
        System.out.println("Search for product1");
    }

    @Test
    public void searchCustomer() {
        System.out.println("Search for customer");
    }

    @Test
    public void searchSalma() {
        System.out.println("Search for salma");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("LOg out");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Close URL");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("sad for leaving our website");

    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("search <<<>>>");
    }

    }
