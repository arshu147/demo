package firstt;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(firstt.LitsenersDemo.class)
public class LitsenerTestMethodClass {
	
	@BeforeSuite
	public void suiteBefore() {
		System.out.println("@Before  Suite");
	}
	
	@AfterSuite
	public void suiteAfter() {
		System.out.println("@After  Suite");
	}
	
	@BeforeClass
	public void classBefore() {
		System.out.println("@Before  Class");
	}
	
	@AfterClass
	public void classAfter() {
		System.out.println("@fter Class");
	}
	
	//test method 1
	@Test
	public void demo()
	{
		System.out.println("Running");
	}
	
	//test method 2
	@Test
	public void m2() {
		System.out.println("m2");
	}
}
