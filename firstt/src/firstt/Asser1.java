//package firstt;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Asser1 {
//	@Test
//	public void asser() {
//		String eTitle="aliabhatt.fb.com";
//		String aTitle="aliabhatt.fb.com";
//		
//		Assert.assertEquals(aTitle, eTitle);//true
//		System.out.println("aTitle is matching with eTitle");
//	}
//
//}



// package firstt;
//
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class Asser1 {
//	@Test
//	public void asser() {
//		String eTitle="aliabhatt.fb.com";
//		String aTitle="aliabhatt.fb.co";
//		
//		Assert.assertEquals(aTitle, eTitle);//false
//		System.out.println("aTitle is not matching with eTitle");
//	}
//
//}


package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Asser1 {
	@Test
	public void asser() {
		String eTitle="true";
		String aTitle="false";
		
		Assert.assertEquals(aTitle, eTitle);//false
		System.out.println("aTitle is not matching with eTitle");
	}

}