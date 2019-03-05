package firstt;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Failtest
{

	@Test
	public void run()
	{
		Reporter.log("hiii", true);
		Assert.fail();
	}
}
