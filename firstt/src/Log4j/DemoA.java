package Log4j;


import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class DemoA {
	@Test
	public void run() {
		Logger log=Logger.getLogger("DemoA");
		log.info("running log4j");
		log.error("some error msg");
		log.warn("warnning");
		log.debug("debug");
		
	}

}
