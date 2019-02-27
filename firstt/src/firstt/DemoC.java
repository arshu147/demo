package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test(priority=1,invocationCount=2)
	public void B() {
		Reporter.log("DemoB B()",true);
	}
	@Test
	public void C() {
		Reporter.log("DemoB C()",true);
		Assert.fail();
	}
	
	@Test(dependsOnMethods="C")
	public void D() {
		Reporter.log("DemoB D()",true);
	}


}
