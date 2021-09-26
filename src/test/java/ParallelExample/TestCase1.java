package ParallelExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {

    /*
    In normal way this will execute LogoTest() and then pagetitle()
    But what if i need to run both tests in the same time in parallel ?
    XML called Parallel.xml, and then we will create at suit level parameter called parallel = "methods", thread-count = "2 or 3 or ..."
    this mean run methods as parallel in number of threads 
     */

    WebDriver driver;
    @BeforeClass
    void setup()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com");
    }

    @Test(priority = 1)
    void LogoTest() throws InterruptedException {
        WebElement logo = driver.findElement(By.id("divLogo"));
        Assert.assertTrue(logo.isDisplayed(),"Error: Logo not display");//This return true if the method return true and print error if not display or if isDisplay method return false
        /*
        Assert.assertTrue(in);
        // This return True if the output of "in" is true
        Assert.assertFalse(in);
        // This return True if the output of "in" is false
        */
        Thread.sleep(5000);
    }

    @Test(priority = 2)
    void pagetitle() throws InterruptedException {
        String actualtitle = driver.getTitle();
        Assert.assertEquals(actualtitle,"OrangeHRM","title not mached: actuial"+actualtitle+" while it should be: OrangeHRM");
        Thread.sleep(5000);
    }
    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
