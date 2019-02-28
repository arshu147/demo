package firstt;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DemoD {
	
	@Test(invocationCount=2)
	public void test1() {
		Reporter.log("test1()",true);
	}

	@Test(invocationCount=0)
	public void test2() {
		Reporter.log("test2()",true);
	}
	
	@Test(invocationCount=-1)
	public void test3() {
		Reporter.log("test3()",true);
	}
	
	@Test()
	public void test4() {
		Reporter.log("test4()",true);
	}
	
}

/*
 	O/P
 	test1()
 	test1()
 	test4()
 
*/