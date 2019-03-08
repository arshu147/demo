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

public class LitsenersDemo implements ITestListener, ISuiteListener, IClassListener, IInvokedMethodListener {
	//before starting each test methods
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test method started--Litsener");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test passed--Litsener");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test failed--Litsener");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test skipped--Litsener");
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}

	//before all the test methods
	@Override
	public void onStart(ITestContext context) {
		System.out.println("All Test Methods Starting--Litsener");
	}

	//after  finishing execution of all  test methods
	@Override
	public void onFinish(ITestContext context) {
		System.out.println("All Test Methods Finished--Litsener");
	}


	//litsen to your suite
	@Override
	public void onStart(ISuite suite) {
		System.out.println("suite started--Litsener");
	}

	@Override
	public void onFinish(ISuite suite) {
		System.out.println("suite finished--Litsener");
	}


	//litsen to the class
	@Override
	public void onBeforeClass(ITestClass testClass) {
		System.out.println("onBeforeClass--Litsener");
	}

	@Override
	public void onAfterClass(ITestClass testClass) {
		System.out.println("onAfterClass--Litsener");
	}

	@Override
	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("    before invocation--Litsener");
	}

	@Override
	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		System.out.println("    after invocation--Litsener");		
	}

}
