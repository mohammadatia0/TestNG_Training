import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTests {
    /*
    Dependency here: we cannot drive the car before start the car
    so drivecar depend on startcar
    also stopcar depend on drivecar
    also parkcar depend on drivecar & stopcar
    to do that we use @Test(dependsOnMethods = {"startcar"})
     */
    @Test
    void startcar()
    {
        System.out.println("Start Car");
        Assert.fail();
    }
    @Test(dependsOnMethods = {"startcar"})
    void drivecar()
    {
        System.out.println("Drive Car");
    }
    @Test(dependsOnMethods = {"drivecar"})
    void stopcar()
    {
        System.out.println("Stop Car");
    }
    @Test(dependsOnMethods = {"drivecar","stopcar"})
    void parkcar()
    {
        System.out.println("Park Car");
    }

    //this method depend on startcar and drivecar, but also it is OK if i run the radio when car not started,
    // but it is better to start radio when car started
    @Test(dependsOnMethods = {"startcar","drivecar"},alwaysRun = true)
    void startradio(){
        System.out.println("radio started");
    }
}
