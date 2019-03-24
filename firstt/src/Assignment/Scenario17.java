package Assignment;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario17 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//div[@class='top-middle-header']/descendant::li[@class='visit-our-stores']/a")).click();
		List<WebElement> stores = driver.findElements(By.xpath("//div[@class='store-city ']/descendant::div[@class='map-wrap']/descendant::div[@class='store-location']"));
		System.out.println("The No.Of Stores are : "+stores.size());
		System.out.println("The Stores are : ");
		for (WebElement storeSingle : stores) {
			System.out.println(storeSingle.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}
