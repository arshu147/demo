package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoE {
	
	@Test(dependsOnMethods= {"B","C"})
	public void A() {
		Reporter.log("A()",true);
	}
	
	@Test
	public void B() {
		Reporter.log("B()",true);
	}
	
	@Test
	public void C() {
		Reporter.log("C()",true);
	}
	
	@Test(dependsOnMethods="A")
	public void D() {
		Reporter.log("D()",true);
	}
	
	@Test
	public void E() {
		Reporter.log("E()",true);
	}

}


