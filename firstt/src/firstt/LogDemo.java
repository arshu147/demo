package firstt;


import org.apache.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogDemo {
	@Test
	public void logjDemo() {
		Logger log = Logger.getLogger("LogDemo");
		log.info("log info");
		System.out.println("Logging.............");
		log.error("Error");
		Assert.fail();
		log.warn("this is warning ");
	}
}
