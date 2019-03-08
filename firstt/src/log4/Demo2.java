package log4;



import org.apache.log4j.Logger;
import org.testng.annotations.Test;

public class Demo2 {

	@Test
	public void run()
	{
		Logger log = Logger.getLogger("Demo2");
		log.info("running log4j");
		log.error("error message");
		log.warn("may get some problem");
		log.debug("debuging process");
		log.fatal("fatal process");
		System.out.println("running log4j");
		
	}

}
