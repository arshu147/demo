package firstt;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(firstt.Listners1.class)
public class DemoLisner {
		
	@BeforeSuite
	public void suite1() {
		
	}
	
	@AfterSuite
	public void suite2() {
		
	}
	
	@Test
	public void run1()
	{
		Assert.fail();
	}
	
	@Test
	public void run2()
	{
		
	}
	

}
