package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario6 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		WebElement priceObj = driver.findElement(By.xpath("//section[@id='Price-form']"));
		Actions act = new Actions(driver);
		act.moveToElement(priceObj).build().perform();
		Thread.sleep(1000);
		WebElement belowObj = driver.findElement(By.xpath("//section[@id='Price-form']/descendant::div[@class='form-item ']/span[@data-displayname='below rs 10000']/span[@class='items-count']"));
		System.out.println("count of below 10000 are : "+belowObj.getText().replaceAll("[^0-9]", ""));
		Thread.sleep(3000);
		driver.close();
	}
}
