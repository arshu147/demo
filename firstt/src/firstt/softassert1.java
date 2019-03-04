package firstt;


import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softassert1 {
	
			@Test
			public void asser() {
				
				boolean eTitle=true;
				boolean aTitle=false;
				
				SoftAssert sa=new SoftAssert();
				sa.assertEquals(aTitle, eTitle);
				System.out.println("working");
				sa.assertAll();
				
			}
			
}
