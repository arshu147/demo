package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoA extends TestNGAnnotations {
	
	@Test
	public void A() {
		Reporter.log("DemoA A()",true);
	}	
}
