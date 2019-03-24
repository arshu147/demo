package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario7 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@title='Click for More Filters']")).click();
		Thread.sleep(1000);
		WebElement count = driver.findElement(By.xpath("//form[@id='delivery time']/descendant::span[@class='items-count']"));
		System.out.println("Count of next day delivery are : "+count.getText().replaceAll("[^0-9]", ""));
		Thread.sleep(3000);
		driver.close();
	}
}
