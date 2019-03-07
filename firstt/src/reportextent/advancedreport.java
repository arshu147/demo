package reportextent;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class advancedreport
{
	public static void main(String[] args) throws Exception 
	{
		ExtentReports extent = new ExtentReports();
		ExtentHtmlReporter rep = new ExtentHtmlReporter("./extentreport/rep3.html");
		rep.config().setReportName("Smoke Tests Report");
		rep.config().setDocumentTitle("Project1");
		rep.config().setTheme(Theme.DARK);
		
		extent.attachReporter(rep);
		
		extent.setSystemInfo("env", "dev");
		extent.setSystemInfo("ProjectName", "project1");
		extent.setSystemInfo("Tester Name", "Swa");
		extent.setSystemInfo("OS", "Window");
		
		ExtentTest test = extent.createTest("tc01");
		
		test.log(Status.INFO, "Extent report is working fine");
		test.addScreenCaptureFromPath("C:\\Users\\Admin\\Downloads\\hd.jpg");
		
		test.log(Status.PASS, "tc01 is passed");
		
		extent.flush();
		System.out.println("report made");
		
	}
}