package testng1;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class RetryB {
	
	@Test
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
	
	@AfterMethod
	public void after(ITestResult r)
	{
		System.out.println(r.getName());
		boolean bool=r.isSuccess();
		System.out.println(bool);
		
		r.getInstance().getClass();
		System.out.println(r.getInstanceName());
		
//		if(r.getStatus()==ITestResult.SUCCESS)
//		{
//			System.out.println("test passed");
//		}
		System.out.println(r.getStatus());
	}
	


}
