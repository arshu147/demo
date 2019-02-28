package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoF {
	
	@Test
	public void B() {
		Reporter.log("B()",true);
	}
	
	@Test
	public void A() {
		Reporter.log("A()",true);
	}

}
