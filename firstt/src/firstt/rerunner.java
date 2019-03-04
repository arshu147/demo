package firstt;

import java.util.List;
import java.util.ArrayList;

import org.testng.ITestResult;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

  public class rerunner {
	@Test
	public void runn() {
		
		TestNG test=new TestNG();
		
		List<String> ls=new ArrayList<>();
//		ls.add("C:\\Users\\Dell\\git\\demo2\\firstt\\test-output\\testng-failed.xml";)//path of testng-failed.xml
		test.setTestSuites(ls);
		test.run();
				
	}

	  
	  
//	  @Test
//	  public void run2() {
//		  System.out.println();
//		  
//	  }
//	  
//	  @AfterMethod
//	  public void after(ITestResult r) {
//		  
		  
//		  if(r.getStatus()==ITestResult.SUCCESS) {
//			  
//			  System.out.println("test passed");
//		  }
//		  r.getInstance().getClass();
//		  System.out.println();
		  
	  }
	  

