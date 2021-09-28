package Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomListeners implements ITestListener {
    /*
    Invoked each time before a test will be invoked. The ITestResult is only partially filled with the references to class, method, start millis and status.
Parameters:
result - the partially filled ITestResult
     */
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("Test start execution (onTestStart)..."+result.getName());
    }
/*
Invoked each time a test succeeds.
Parameters:
result - ITestResult containing information about the run test
 */
    @Override
    public void onTestSuccess(ITestResult result) {
        System.out.println("Test pass (onTestSuccess)..."+result.getName());
    }
/*
Invoked each time a test fails.
Parameters:
result - ITestResult containing information about the run test
 */
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("Test fail (onTestFailure)..."+result.getName());
    }
/*
Invoked each time a test is skipped.
Parameters:
result - ITestResult containing information about the run test
 */
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("Test skip (onTestSkipped)..."+result.getName());
    }
/*
Invoked each time a method fails but has been annotated with successPercentage and this failure still keeps it within the success percentage requested.
Parameters:
result - ITestResult containing information about the run test
 */
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ///***///
    }
    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ///**///
    }
/*
Invoked after the test class is instantiated and before any configuration method is called.
before class level
 */
    @Override
    public void onStart(ITestContext context) {
        System.out.println("Test will Start to execute (onStart)..."+context.getName());
    }
/*
Invoked after all the tests have run and all their Configuration methods have been called.
after class level
 */
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("Test Finish (onFinish)..."+context.getName());
    }
}
