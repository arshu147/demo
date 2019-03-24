package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario8 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		WebElement metalObj = driver.findElement(By.xpath("//section[@id='Metal-form']"));
		Actions act = new Actions(driver);
		act.moveToElement(metalObj).build().perform();
		Thread.sleep(1000);
		WebElement platinum = driver.findElement(By.xpath("//section[@id='Metal-form']/descendant::div[@class='form-item last']"));
		System.out.println("The number of platinum are : "+platinum.getText().replaceAll("[^0-9]", ""));
		Thread.sleep(3000);
		driver.close();
	}
}
