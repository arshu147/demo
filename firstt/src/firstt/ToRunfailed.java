package firstt;



import java.util.ArrayList;
import java.util.List;

import org.testng.TestNG;
import org.testng.annotations.Test;

public class ToRunfailed 
{
	@Test
	public void run1()
	{
		
	
	TestNG test=new TestNG();
	List<String> ls1=new ArrayList <>();
	
	ls1.add("C:\\Users\\CPSCUST\\Desktop\\wsG\\demo1\\firstt\\test-output\\FailSuite\\testng-failed.xml");
	test.setTestSuites(ls1);
	test.run();
	}

	
}
