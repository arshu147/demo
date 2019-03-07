package firstt;

import org.apache.log4j.Logger;
import org.testng.annotations.Test;


public class Log4jDemo {
	@Test
	public void run()
	{
		System.out.println("Log4J is running");
       Logger log = Logger.getLogger("Log4JDemo");
 
       log.info("running");
       log.error("error");
       log.warn("warning");
	}

}
