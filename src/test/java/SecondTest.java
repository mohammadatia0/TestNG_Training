import org.testng.annotations.Test;

public class SecondTest {
    @Test(priority = 1)
    void setup(){
        System.out.println("Opening the browser");
    }
    @Test(priority = 3)
    void SearchCustomer(){
        System.out.println("This is search customer test");
    }
    @Test(priority = 2)
    void AddCustomer(){
        System.out.println("This is add customer test");
    }
    @Test(priority = 4,enabled = false)//this step will not run
    void teardown(){
        System.out.println("Closing the browser");
    }
}
