package firstt;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng1 {
	
	
	
	@BeforeSuite
	public void Beforesuite(){
		Reporter.log("Beforesuite",true);
	}
	@BeforeTest
	public void beforetest(){
		Reporter.log("Beforetest",true);
	
	}
	@BeforeClass
	public void beforeclass(){
		Reporter.log("Beforeclass",true);
	}
	@BeforeMethod
	public void beforemethod(){
		Reporter.log("Beforemethod",true);
	}
	@Test
	public void test(){
		Reporter.log("Test",true);
	}
	@AfterMethod
	public void aftermethod(){
		Reporter.log("Aftermethod",true);
	}
	@AfterClass
	public void afterclass(){
		Reporter.log("Afterclass",true);
		
	}
	@AfterTest
	public void aftertest(){
		Reporter.log("Aftertest",true);
	}
	@AfterSuite
	public void aftersuite(){
		Reporter.log("Aftersuite",true);
	}
}


