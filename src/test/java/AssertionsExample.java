import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.ToStringPlugin;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AssertionsExample {
    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
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
