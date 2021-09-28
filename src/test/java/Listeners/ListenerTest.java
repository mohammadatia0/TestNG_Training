package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


/*
We add this tag becouse there is no XML file to run this class
but if we need to run this class by using XML this line no need
@Listeners(CustomListeners.class)

but on the XML we will add <Listener> tag to use the class
go to Listeners.xml for more info
 */
public class ListenerTest {
    //here will create 3 methods (fail,pass,skip) status
    //to do action for each one
    @Test
    public void Test1()
    {
        System.out.println("This is Test 1");
        Assert.assertEquals(1,1);
    }
    @Test
    public void Test2()
    {
        System.out.println("This is Test 2");
        Assert.assertEquals(1,2);
    }
    @Test
    public void Test3()
    {
        System.out.println("This is Test 3");
        throw new SkipException("This will make this tests skip status");
    }
}
