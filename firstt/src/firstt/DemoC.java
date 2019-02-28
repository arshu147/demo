package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoC {
	@Test(priority=2)
	public void A() {
		Reporter.log("test A()",true);
	}
	
	@Test(priority=1)
	public void B() {
		Reporter.log("test B()",true);
	}
	
	@Test(priority=-1)
	public void C() {
		Reporter.log("test C()",true);
	}
	
	@Test(priority=2)
	public void D() {
		Reporter.log("test D()",true);
	}
	
	@Test()
	public void E() {
		Reporter.log("test E()",true);
	}
}
