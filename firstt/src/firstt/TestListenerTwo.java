package firstt;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestListenerTwo {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver eFDriver = new EventFiringWebDriver(driver);
		TestListenerOne el = new TestListenerOne();
		eFDriver.register(el);
		eFDriver.get("http://google.com");
		eFDriver.switchTo().activeElement().sendKeys("Selenium");
		Thread.sleep(2000);
		TakesScreenshot ts = (TakesScreenshot) eFDriver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./testdata/ranju.png");
		Files.copy(srcFile, destFile);
		Thread.sleep(2000);
		eFDriver.close();

	}
	
}
