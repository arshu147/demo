package testng1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RetryA {

	@Test(retryAnalyzer=testng1.retry.class)
	public void run()
	{
		Assert.assertTrue(false);
		System.out.println("method");
	}
	@Test
	public void run2()
	{
		System.out.println("method 2");
	}

	

}
