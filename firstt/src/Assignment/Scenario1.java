package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario1 {
	@Test
	public static void bluestone() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("goldCoins"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/span[@data-p='gold-coins-weight-20gms,m']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(), "20 gram 24 KT Gold Coin | BlueStone.com");
		System.out.println("20 gram gold coin is displayed");
		Thread.sleep(2000);
		driver.close();
	}
}
