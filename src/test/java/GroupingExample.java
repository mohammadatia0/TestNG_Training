import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupingExample {

    /*
    if we wnat to run each group in separate way
    you need to run it using XML file
    to create XML file you need to right click on this file called "GroupingExample"
    and then  create XML file
    and then:
                <suite name="All Test Suite">
                    <test name="Grouping">

                        <groups>
                            <run>
                                <include name="regression"></include>
                                <include name="Sanity"></include>
                                <exclude ...
                            </run>
                        </groups>

                        <classes>

                            <class name="GroupingExample">

                            </class>

                        </classes>
                    </test>
                </suite>

  you should use <groups> and <run> to specify the group name

     */

    @Test(groups = {"Sanity"})
    void test1()
    {
        System.out.println("This is test 1 ...");
    }
    @Test(groups = {"Sanity"})
    void test2()
    {
        System.out.println("This is test 2 ...");
    }
    @Test(groups = {"regression"})
    void test3()
    {
        System.out.println("This is test 3 ...");
    }
    @Test(groups = {"regression"})
    void test4()
    {
        System.out.println("This is test 4 ...");
    }
    @Test(groups = {"Sanity","regression"})
    void test5()
    {
        System.out.println("This is test 5 ...");
    }

}
