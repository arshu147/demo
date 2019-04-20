package Assignment;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IrctcFlight {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.air.irctc.co.in");
		Robot r = new Robot();
		((JavascriptExecutor)driver).executeScript("document.getElementById('tripTyper').click()");
		WebElement from = driver.findElement(By.id("from"));
		from.sendKeys("Bengaluru");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		WebElement to = driver.findElement(By.id("to"));
		to.sendKeys("Mumbai");
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_DOWN);
		WebElement depDate = driver.findElement(By.id("departureDate"));
		depDate.click();
		String month = "//div[@class='datepicker datepicker-dropdown datepicker-left datepicker-bottom rdeparturedate']/descendant::div/table/tbody/descendant::td/span[@class='ML-Month']";
		WebElement monthObj = driver.findElement(By.xpath(month));
		Thread.sleep(2000);
		driver.close();
	}
}
