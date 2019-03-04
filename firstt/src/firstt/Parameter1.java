package firstt;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameter1 {
	@Parameters("city")
	@Test
	public void run(@Optional("chenai") String s)
	{
		System.out.println(s);
	}

}
