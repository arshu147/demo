package FailedTestCase;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class Rerunner {
	@Test
	public void run(){
		TestNG test=new TestNG();
		List<String> lst=new ArrayList();
		lst.add("E:\\Users\\Megha Sinha\\git\\demo11\\firstt\\test-output\testng-failed.xml");
		test.setTestSuites(lst);
        test.run();
}
	
}
//to execute the failed xml file