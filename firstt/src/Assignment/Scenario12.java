package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario12 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='gms-banner-inner']")).click();
		driver.findElement(By.id("tahLpSubmit")).click();
		WebElement amountErrMsg = driver.findElement(By.xpath("//ul[@id='amount_error']/li"));
		System.out.println("When no amount is given,The error message is : "+amountErrMsg.getText());
		WebElement emailErrMsg = driver.findElement(By.xpath("//ul[@id='Email_error']/li"));
		System.out.println("When no email is given,The error message is : "+emailErrMsg.getText());
		Thread.sleep(2000);
		driver.close();
	}
}
