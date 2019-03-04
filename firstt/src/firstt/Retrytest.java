package firstt;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Retrytest {
	
	@Test(retryAnalyzer=firstt.retry.class)
	public void run() {
		Assert.assertTrue(false);
		System.out.println("method");
	}
	
	@Test
	public void run2() {
		System.out.println("method 2");
	}
	

}
