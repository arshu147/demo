package firstt;

import org.testng.Reporter;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class SkipTM {
	
	@Test
	public void A() {
		Reporter.log("A()",true);
	}
	
	@Test(enabled=false)
	public void B() {
		Reporter.log("B()",true);
	}

	@Test(invocationCount=0)
	public void C() {
		Reporter.log("C()",true);
	}

	
	@Ignore
	public void D() {
		Reporter.log("D()",true);
	}

	@Test(groups="smoke")
	public void E() {
		Reporter.log("E()",true);
	}


}
