package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario14 {
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
		String email = driver.findElement(By.id("email")).getAttribute("value");
		String amount = driver.findElement(By.xpath("//div[@class='input-wrapper']/span[@class='subscription-amount subscribed-amount']")).getText();
		Assert.assertEquals(email, "ranjithrnair1992@gmail.com");
		System.out.println("The email is displayed in the email text box");
		Assert.assertEquals(amount, "Rs 15,000");
		System.out.println("The amount is displayed in the amount field");
		Thread.sleep(3000);
		driver.close();
	}
}
