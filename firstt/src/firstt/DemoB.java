package firstt;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoB extends TestNGAnnotations {
	@Test
	public void B() {
		Reporter.log("DemoB B()",true);
		
	}
}
