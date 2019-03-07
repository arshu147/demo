package reportextent;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class demo
{
	public static void main(String[] args) 
	{
		ExtentReports extent = new ExtentReports();
		ExtentHtmlReporter rep = new ExtentHtmlReporter("./extentreport/rep1.html");
		extent.attachReporter(rep);
		
		ExtentTest test = extent.createTest("tc01");
		
		test.log(Status.INFO, "Extent report is working fine");
		
		test.log(Status.PASS, "tc01 is passed");
		
		extent.flush();
		
	}

}