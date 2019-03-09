package LOG4J;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo2log
{
	@Test
	public void run()
	{
		System.out.println("Hi");
		Logger log = Logger.getLogger("demo");
		log.info("Some Information");
		Assert.fail();
		log.error("Some Error occurred");
		System.out.println("Bye");
	}
}
