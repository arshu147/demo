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

public class TestClass {
	
	@Test
	public void test1()
	{
		Reporter.log("Test",true);
	}
	
	@BeforeTest
	public void befTest()
	{
		Reporter.log("Before Test",true);
	}
	@AfterTest
	public void AftTest()
	{
		Reporter.log("After Test",true);
	}
	
	@BeforeMethod
	public void befMethod()
	{
		Reporter.log("Before Method",true);
	}
	
	@AfterMethod
	public void AftMethod()
	{
		Reporter.log("After Method",true);
	}
	
	@BeforeClass
	public void befClass()
	{
		Reporter.log("Before Class",true);
	}
	
	@AfterClass
	public void AftClass()
	{
		Reporter.log("After Class",true);
	}
	
	@BeforeSuite
	public void befSuite()
	{
		Reporter.log("Before Suite",true);
	}
	
	@AfterSuite
	public void AftSuite()
	{
		Reporter.log("After Suite",true);
	}
	
	
}

