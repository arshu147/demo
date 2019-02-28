package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testnggroups {
	
	@Test(groups="smoke")
	public void b1() {
		Reporter.log("b1()",true);
	}

	@Test(groups="regration")
	public void b2() {
		Reporter.log("b2()",true);
	}
	
	@Test(groups="regration")
	public void b3() {
		Reporter.log("b3()",true);
	}
	
	
}
