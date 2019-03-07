package LOG4J;

import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class demo1 
{
	@Test
	public void run()
	{
		Logger log = Logger.getLogger("demo");
		log.info("Some Information");
		System.out.println("Hi");
		log.error("Some Error occurred");
		System.out.println("Bye");
		Assert.fail();
		log.warn("Some Warning Message");
		System.out.println("Hello");
		log.debug("Debugging Some Message");
		System.out.println("Taata");
		log.fatal("Fatal Error");
		
	}
}
