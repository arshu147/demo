package Assignment;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario10 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("search_query_top_elastic_search")).sendKeys("Rings");
		driver.findElement(By.name("submit_search")).click();
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		Thread.sleep(3000);
		String gender = "//div[@class='top-filter-blocks']/descendant::section[@id='Gender-form']";
		act.moveToElement(driver.findElement(By.xpath(gender))).build().perform();
		String women = "//div[@class='top-filter-blocks']/descendant::section[@id='Gender-form']/descendant::span[@data-displayname='women']";
		driver.findElement(By.xpath(women)).click();
		Thread.sleep(2000);
		WebElement count = driver.findElement(By.xpath("//div[@class='browse-title col-xs-12 ']/span"));
		System.out.println("The number of results for women are : "+Integer.parseInt(count.getText().replaceAll("[^0-9]", "")));
		Thread.sleep(3000);
		driver.close();
	}
}
