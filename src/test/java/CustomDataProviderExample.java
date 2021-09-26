import org.testng.annotations.DataProvider;

public class CustomDataProviderExample {
    //DataProvider written like this

    @DataProvider(name = "LoginDataProvider")
    public Object[][] getData()
    {
        Object[][] data = {       {"qwe@gmail.com","qwe"} , {"asd@gmail.com","asd"} , {"zxc@gmail.com","zxc"}        };
        return data;
    }
}
