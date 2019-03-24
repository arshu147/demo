package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario5 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("goldCoins"))).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-10gms,m']")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.getTitle(),"10 gram 24 KT Lakshmi Gold Coin | BlueStone.com");
		Thread.sleep(2000);
		driver.close();
	}
}
