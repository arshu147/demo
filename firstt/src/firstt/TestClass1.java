package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass1 extends TestClass {
	
	@Test
	public void Test2()
	{
		Reporter.log("Test2",true);
	}
	
	@Test(dependsOnMethods="Test2")
	public void Test2a()
	{
		Reporter.log("Test2a",true);
	}
	
	@Test(invocationCount = 2,priority = 1)
	public void Test2b()
	{
		Reporter.log("Test2b",true);
	}
	
	@Test
	public void Test2c()
	{
		Reporter.log("Test2c",true);
	}
	
	@Test
	public void Test2d()
	{
		Reporter.log("Test2d",true);
	}
	

	@Test
	public void Test2e()
	{
		Reporter.log("Test2e",true);
	}
	

}
