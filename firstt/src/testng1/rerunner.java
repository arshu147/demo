package testng1;

import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class rerunner {
	@Test
	public void runn()// to run automatically the failed test class
	// to execute the failed xml files
	{
		TestNG test=new TestNG();
		List<String> ls=new ArrayList<>();
		ls.add("C:\\Users\\Dell\\git\\demo1\\firstt\\test-output\\testng-failed.xml");
		test.setTestSuites(ls);
		test.run();
		
	}

}
