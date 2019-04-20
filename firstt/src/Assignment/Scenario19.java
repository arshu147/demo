package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario19 {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Bangalore");
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Mumbai");
		driver.findElement(By.id("BE_flight_origin_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("25/03/2019")).click();
		driver.findElement(By.id("BE_flight_arrival_date")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("15/04/2019")).click();
		driver.findElement(By.id("BE_flight_paxInfoBox")).click();
		String adultPlusButton = "//span[@id='adultPax']/parent::span/following-sibling::div[@class='dd ddcommon borderRadius ddSpinnerMain']/descendant::span[@class='ddSpinnerPlus']";
		for (int i = 0; i < 2; i++) {
			driver.findElement(By.xpath(adultPlusButton)).click();
			Thread.sleep(1000);
		}
		
	}
}
