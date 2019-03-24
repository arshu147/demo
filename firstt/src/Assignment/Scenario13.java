package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario13 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//div[@class='gms-banner-inner']")).click();
		driver.findElement(By.id("amount")).sendKeys("15000");
		driver.findElement(By.id("Email")).sendKeys("ranjithrnair1992@gmail.com");
		driver.findElement(By.id("tahLpSubmit")).click();
		Thread.sleep(2000);
		driver.navigate().back();
		String amount = driver.findElement(By.id("amount")).getText();
		String email = driver.findElement(By.id("Email")).getText();
		Assert.assertEquals(email, "ranjithrnair1992@gmail.com");
		System.out.println("Email is displayed");
		Assert.assertEquals(amount, "15000");
		System.out.println("The amount is displayed");
		driver.close();
	}
}
