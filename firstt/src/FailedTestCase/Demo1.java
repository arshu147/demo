package FailedTestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Demo1 {
	@Test(retryAnalyzer=FailedTestCase.Retry.class)
	public void run(){
		Assert.assertTrue(false);
		System.out.println("run");
	}
	@Test
	public void run1(){
		System.out.println("run1");
	}

}
