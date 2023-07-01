import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class JustTry {
    @BeforeClass
    public void before() {
        System.out.println("hello1");
    }

    @Test
    public void searchProduct() {
        System.out.println("Search for product1");
    }

    @Test
    public void searchProduct2() {
        System.out.println("Search for product2");
    }

    @Test
    public void searchProduct3() {
        System.out.println("Search for product3");
    }

    @AfterSuite
    public void after() {
        System.out.println("close1");
    }


}
