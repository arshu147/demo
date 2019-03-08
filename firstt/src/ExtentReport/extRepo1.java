package ExtentReport;

import org.testng.annotations.Test;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class extRepo1 {
	
	@Test
	public void test1()
	{
		ExtentReports extent=new ExtentReports();
		ExtentHtmlReporter rep=new ExtentHtmlReporter("C:\\Users\\Dell\\git\\demo1\\firstt\\report2\\1rep.html");
		
		rep.config().setReportName("smoke tests report");
		rep.config().setDocumentTitle("project1");
		rep.config().setTheme(Theme.DARK);
		extent.attachReporter(rep);
		extent.setSystemInfo("env", "dev");
		extent.setSystemInfo("projectName","project1");
		extent.setSystemInfo("tester name", "madhav");
		extent.setSystemInfo("os", "MAC");
		
		
		ExtentTest test = extent.createTest("tco1");
		
		test.log(Status.INFO, "extent report is working fine");
		test.log(Status.FAIL, "tco1 is failed");
		extent.flush();
	//}


//	@Test
//	public void test2()
//	{
//		ExtentReports extent=new ExtentReports();
//		ExtentHtmlReporter rep=new ExtentHtmlReporter("C:\\Users\\Dell\\git\\demo1\\firstt\\report2\\1rep1.html");
	
		rep.config().setReportName("smoke tests report");
		rep.config().setDocumentTitle("project1");
		rep.config().setTheme(Theme.DARK);
		extent.attachReporter(rep);
		extent.setSystemInfo("env", "dev");
		extent.setSystemInfo("projectName","project1");
		extent.setSystemInfo("tester name", "madhav");
		extent.setSystemInfo("os", "MAC");
		
		
	extent.createTest("tco2");
		
		test.log(Status.INFO, "extent report is working fine");
		test.log(Status.PASS, "tco1 is passed");
		extent.flush();
		}

}
