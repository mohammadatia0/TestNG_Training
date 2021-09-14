import org.testng.Assert;
import org.testng.annotations.*;

public class FirstTest {
    /*
Note:
1-
Test arch
each Test suites ---> contains # of Test cases ---> each TC contains # of Test steps

but in TestNG
Test suites is (Packages) ---> Test cases are (classes) ---> Test steps are (methods)

in TestNG there is no main method, just we use @Test annotation for each method

TestNG run all methods in alphabetical way so to run the tests as you want you need to prioritize tests
@Test(priority=1) number is 1,2,3,4,5,...

2-
Now after we create FirstTest class and steps included, we want to create SecondTest with its steps,
To run both classes we need to create XML file called "testing.xml"
steps to create this file:
* sitting -> plugin -> install "create testng xml"
* right click on project name and create testng xml, this will create new file called testing.xml - you need to reload project  to see the file
after this added inside XML:
Also from XML you can select the method ot methods that you want to run
        <classes>
            <class name="Annotations_TC1">
                <methods>
                    <include name="step1"/>
                    <include name="step2"/>
                </methods>
            </class>
        </classes>
and then run XML file...

To generate the report for last run:
*run -> edit configurations -> listeners -> add(emailing report & failreport eamiling)
after run XML file new report will create under test-output you can open it using chrome

To test fail test just add this line inside any steps from any class and then check report
                            actual     expected
        Assert.assertEquals(1       ,  2);
        after this line step will fail
If the steps is fail TestNG will create another report contains just failed steps, so if you fix the failed steps
you can re-run new testing-failed.xml file to check your fix
And then you can run all tests to get new report without any errors.

3-
TestNG annotations:
control sequence & priority of the methods(steps for each test)
main important annotations in TestNG:
@BeforeSuite
    @BeforeTest
        @BeforeClass
            @BeforeMethod
    -->          @Test
            @AfterMethod
        @AfterClass
    @AfterTest
@AfterSuite


Descriptions for each annotation:
See Annotations classes   <---

 */


    @Test(priority = 1)
    void setup(){
        System.out.println("Opening the browser");
    }
    @Test(priority = 2)
    void Login(){
        System.out.println("This is login test");
        Assert.assertEquals(1,2);
    }
    @Test(priority = 3)
    void teardown(){
        System.out.println("Closing the browser");
    }
}
