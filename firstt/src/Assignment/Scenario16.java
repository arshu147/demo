package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario16 {
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
		driver.findElement(By.id("fullname")).sendKeys("Ranjith R");
		driver.findElement(By.id("contactNumber")).sendKeys("9895310032");
		driver.findElement(By.id("address")).sendKeys("#39,Sreerama Nilaya,Jambu Savari Dinne,J P Nagar 8th Phase");
		driver.findElement(By.id("postcode_delivery")).sendKeys("560078");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.id("nomineeName")).sendKeys("Geetha P");
		Select relation = new Select(driver.findElement(By.id("nomineeRelationship")));
		relation.selectByValue("Mother");
		Select nationality = new Select(driver.findElement(By.id("nomineeNationality")));
		nationality.selectByValue("Indian");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		Assert.assertEquals(driver.getTitle(), "Gold Mine Payment Option | BlueStone.com");
		Thread.sleep(3000);
		driver.close();
	}
}
