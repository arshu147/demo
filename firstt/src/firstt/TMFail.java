package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TMFail {
	
	@Test(priority=3,invocationCount=2)
	public void A() {
		Reporter.log("A()",true);
		
	}
	
	@Test(dependsOnMethods="C",priority=1)
	public void B() {
		Reporter.log("B()",true);
	}
	
	@Test(priority=2)
	public void C() {
		Reporter.log("C()",true);
		Assert.fail();
	}
	
	@Test
	public void D() {
		Reporter.log("D()",true);
	}

}
