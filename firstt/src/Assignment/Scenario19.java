package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario19 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		WebElement fromObj = driver.findElement(By.xpath("//div[@class='oneway-roundtrip CitySwap']/descendant::input[@id='BE_flight_origin_city']"));
		Thread.sleep(2000);
		fromObj.click();
	}
}
