import org.testng.annotations.*;
/*

@BeforeSuite @AfterSuite will execute before&after suite that written in.
    so if you write (@BeforeSuite @AfterSuite) in any class under the same (suite_Tag <suite>) will use them as Before & After suite.

@BeforeTest @AfterTest
    so if you write (@BeforeTest @AfterTest) in any class under the same (test_Tag <test>) will use them as Before & After test.

For each class (TC) you should add (@BeforeClass @BeforeMethod @AfterClass @AfterMethod)

 */
public class Annotations_TC1 {
    /*
    this will run before each tag:
    <suite name=""></suite>
     */
    @BeforeSuite
    void BeforeSuite()
    {
        System.out.println("This is Before suite >>>");
    }


    /*
    This will execute before the Tests
    if you run multiple classes in the XML file (TC1 & TC2) this method will run before all classes just one time
    This will run before each this tag:
    <test name="">...</test>

     */
    @BeforeTest
    void BeforeTest(){
        System.out.println("This is Before Tests ***");

    }


    /*
        This method will execute before this class start
        * this will run before execute this tag:
        <class name="">...</class>
        for the same class itself
        So here this will execute just for this class name and will not be executed for another class
        so for each class you must specify this annotation
    */
    @BeforeClass
    void BeforeClass()//called testcase step or testcase method
    {
        System.out.println("This is Before Class ###");
    }


    /*
        This method will execute multiple times in this TC
        will execute before each Test method
        this will run before execute this tag for the same class itself:
        <include> ... </include>

        So this method will not be executed for the methods in another classes
    */
    @BeforeMethod
    void BeforeMethod()//called testcase step or testcase method
    {
        System.out.println("This is Before Method");
    }

    @Test
    void step1()//called test step or testcase method
    {
        System.out.println("This is step1");
    }

    @Test
    void step2() {
        System.out.println("This is step2");
    }

    /*
        This method will execute multiple times in this TC
        will execute after each Test method
    */
    @AfterMethod
    void AfterMethod()//called testcase step or testcase method
    {
        System.out.println("This is After Method");
    }


    /*
    This method will execute before this class start
    */
    @AfterClass
    void AfterClass()//called testcase step or testcase method
    {
        System.out.println("This is After Class ###");
    }

    /*
    This will execute after the Tests
    if you run multiple classes in the XML file (TC1 & TC2) this method will run after all classes just one time
    * this will run after this tag <test name=""></test>
     */
    @AfterTest
    void AfterTest(){
        System.out.println("This is After Tests***");

    }


    /*
       This will be run one time after all tests runs  (whatever in the same class or in different classes
     */
    @AfterSuite
    void AfterSuit()
    {
        System.out.println("This is After Suit >>>");
    }
}
