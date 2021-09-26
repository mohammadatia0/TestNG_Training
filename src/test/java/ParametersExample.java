import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class ParametersExample {
    WebDriver driver;

    /*

    In this example we want to send URL & Driver value py using parameters in TestNG

     */

    @BeforeClass
    @Parameters({"browser","url"})
    //the value that sent from XML"browser"&"url" will be stored here (String browser,String url)
    //you can check ParameterExample XML for more info
    //parameter tag should be above test tag
    void setup(String browser,String url)
    {
        if(browser.equalsIgnoreCase("chrome"))
        {
            System.out.println("browser: "+browser);
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else
            if(browser.equalsIgnoreCase("firefox"))
            {
                System.out.println("browser: "+browser);
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
            }
        driver.get(url);

    }
    @Test(priority = 1)
    void LogoTest()
    {
        WebElement logo = driver.findElement(By.id("divLogo"));
        Assert.assertTrue(logo.isDisplayed(),"Error: Logo not display");//This return true if the method return true and print error if not display or if isDisplay method return false
        /*
        Assert.assertTrue(in);
        // This return True if the output of "in" is true
        Assert.assertFalse(in);
        // This return True if the output of "in" is false
        */
    }

    @Test(priority = 2)
    void pagetitle()
    {
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle,"OrangeHRM","title not mached: actuial"+actualtitle+" while it should be: OrangeHRM");
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
