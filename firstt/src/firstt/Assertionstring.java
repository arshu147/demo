package firstt;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertionstring
{
	@Test
	public void b1()
	{
		String aTitle = "Bangalore";
		String eTitle = "bangalore";
		
		Assert.assertEquals(aTitle, eTitle);
		System.out.println("both titles are matching");
	}

}
