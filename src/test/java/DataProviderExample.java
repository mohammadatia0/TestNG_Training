import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

    //if we want to use DataProvider from another class
    // we should add another parameter >> dataProviderClass = CustomDataProviderExample.class
    //@Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProviderExample.class)
    // if DataProvider in the same class we don't need dataProviderClass = CustomDataProviderExample.class

    //Test will get data from which provider
    //This method will execute 3 times because DataProvider method have 3 inputs
    @Test(dataProvider = "LoginDataProvider",dataProviderClass = CustomDataProviderExample.class)
    public void LiginTest(String email,String pass)
    {
        System.out.println("email: "+email+" pass: "+pass);
    }


    //we can use this way or we can put DataProvider method in another class like CustomDataProvider class
    /*

    //DataProvider written like this
    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {       {"qwe@gmail.com","qwe"} , {"asd@gmail.com","asd"} , {"zxc@gmail.com","zxc"}        };
        return data;
    }



 */
}
