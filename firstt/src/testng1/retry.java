package testng1;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class retry implements IRetryAnalyzer {
	int count=0;
	int max_count=5;
	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		
		if(count<max_count)
		{
			count++;
			return true;
		}
		return false;
	};

}
