package testng1;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.apache.poi.ss.formula.CollaboratingWorkbooksEnvironment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion1 {
	@Test
	public void asser()
	{
		boolean expected=true;
		boolean actual=false;
		
		Set<String> s=new HashSet<>();
		Collections.addAll(s, "abc","xyz","abc","def");
		
		Set<String> s1=new HashSet<>();
		Collections.addAll(s1, "abc","xyz","abc","def");
		
//		Assert.assertNotEqualsDeep(s, s1," matching");
		
		
		
	}

}
