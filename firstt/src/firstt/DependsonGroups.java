package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependsonGroups {
	
	@Test(dependsOnGroups="smoke")
	public void run() {
		System.out.println("running");
	}	

//	@Test(groups="name",dep)
	public void run2() {
		System.out.println("running2");
	}	

	
}
