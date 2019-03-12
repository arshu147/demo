package firstt;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailedtestCasesdemo implements IRetryAnalyzer {
	private int count = 0;
	private int maxCount = 40;
	@Override
	public boolean retry(ITestResult result) {
		if(result.getStatus() == 2 && count<maxCount)
		try{
			count++;
			return true;
		}catch (Exception e) {
		}
		return false;
	}

}
