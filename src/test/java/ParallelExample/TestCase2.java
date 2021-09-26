package ParallelExample;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase2 {

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
    void LoginBtnTest() throws InterruptedException {
        WebElement btn = driver.findElement(By.id("btnLogin"));
        WebElement username = driver.findElement(By.id("txtUsername"));
        WebElement password = driver.findElement(By.id("txtPassword"));
        username.sendKeys("admin");
        password.sendKeys("admin123");
        btn.click();
    }

    @Test(priority = 2, dependsOnMethods = {"LoginBtnTest"})
    void Checklogedin()
    {
            WebElement menu = driver.findElement(By.id("mainMenu"));
            Assert.assertTrue(menu.isDisplayed(),"Login failed...");
    }

    @AfterClass
    void tearDown()
    {
        driver.quit();
    }
}
