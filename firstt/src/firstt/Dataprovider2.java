package firstt;

import org.testng.annotations.Test;

public class Dataprovider2 {
	@Test(dataProviderClass=firstt.Dataprovider1.class,dataProvider="normalTestCase")
	public void run(String s,String s2)
	{
	System.out.println(s);
	System.out.println(s2);
	}


}
