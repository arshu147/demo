package firstt;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
public class ExtendRep {
	public static void main(String[] args) throws Exception {
		
		ExtentReports ex = new ExtentReports();
		ExtentHtmlReporter rep = new ExtentHtmlReporter("./reports/extentreport.html");
		rep.config().setReportName("smoke test reports");
		rep.config().setDocumentTitle("Project1");
		rep.config().setTheme(Theme.DARK);
		ex.attachReporter(rep);
		ex.setSystemInfo("Environment", "Dev");
		ex.setSystemInfo("Project Name", "First");
		ex.setSystemInfo("Tester", "Ranjith");
		ExtentTest test = ex.createTest("TC01");
		test.addScreenCaptureFromPath("F:\\RANJU\\New folder\\101890.jpg");
		test.log(Status.INFO, "extent rep for TC01 is working fine");
		test.log(Status.PASS, "tc01 passed");
		ExtentTest test2 = ex.createTest("TC02");
		test2.log(Status.INFO, "extent rep for TC02 is working fine");
		test2.log(Status.FAIL, "tc02 failed");
		ex.flush();
		System.out.println("Extend report saved");
		boolean b = Boolean.parseBoolean("true");
	}
}
