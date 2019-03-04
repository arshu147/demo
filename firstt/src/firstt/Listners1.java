package firstt;

import org.testng.IClassListener;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ISuite;
import org.testng.ISuiteListener;
import org.testng.ITestClass;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners1 implements ITestListener,ISuiteListener,IClassListener,IInvokedMethodListener {

	@Override
	public void onTestStart(ITestResult result) {
	System.out.println("test started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
	System.out.println("test passed");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("skipped");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
	
	//before executing all the test methods only once it will execute
	@Override
	public void onStart(ITestContext context) {
	System.out.println("starting the test methods");
		
	}
	
	//after executing all the test methods only once it will execute
	@Override
	public void onFinish(ITestContext context) {
	System.out.println("finishing the test methods");
		
	}

	@Override
	public void onStart(ISuite suite) {
	System.out.println("suite starting");
		
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("suite executed");
		
	}

	@Override
	public void onBeforeClass(ITestClass testClass) {
		System.out.println("before class");
		
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
	System.out.println("after class");
		
	}
	
	//before starting each and every annotaion(method) it will execute
	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
	System.out.println("invoking method");
		
	}

	//after executing each and every annotaion(methods) it will execute
	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("after method invocation");
		
	}
	

}
