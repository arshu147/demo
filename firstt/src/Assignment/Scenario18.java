package Assignment;
import java.util.concurrent.TimeUnit;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario18 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		driver.findElement(By.xpath("//div[@id='grid-view-result']/ul[@id='product_list_ui']/li[@data-position='8'][@data-pid=\"7582\"]")).click();
		WebElement originalPrice = driver.findElement(By.xpath("//div[@class='price-block']/descendant::span[@id='our_price_display']"));
		int orgPrice = Integer.parseInt(originalPrice.getText().replace(",", ""));
		System.out.println("original "+orgPrice);
		int discPrice = Integer.parseInt(driver.findElement(By.xpath("//div[@class='price-block']/descendant::span[@id='discountedPriceSpan']")).getText().replace(",", ""));
		int expDiscPrice = (int) (orgPrice-(orgPrice*0.1));
		System.out.println(expDiscPrice);
		Assert.assertEquals(22392, orgPrice);
		System.out.println("Original Price Verified");
		Assert.assertEquals(expDiscPrice, discPrice);
		System.out.println("Discount Price Verified");	
		Thread.sleep(2000);
		driver.close();
	}
}
