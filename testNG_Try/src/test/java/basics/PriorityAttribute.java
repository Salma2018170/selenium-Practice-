package basics;

import org.testng.TestRunner;
import org.testng.annotations.Test;

@Test
public class PriorityAttribute {
    //without priority will execute depend on order "A to Z"
    @Test(priority = 0)
    public void signIn()
    {
        System.out.println("Sign IN");
    }
    @Test (priority = 1)
    public void search(){
        System.out.println("search for product");
    }
    @Test (priority = 2)
    public void signOUt(){
        System.out.println("Sign out");
    }
}
