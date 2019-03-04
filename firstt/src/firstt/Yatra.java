package firstt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Yatra {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		driver.findElement(By.id("BE_flight_origin_city")).sendKeys("Bengaluru");
		driver.findElement(By.id("BE_flight_arrival_city")).sendKeys("Singapore");
		driver.findElement(By.id("BE_flight_origin_date")).click();
		driver.findElement(By.xpath("(//td[contains(text(),'16')])[1]")).click();
	}
}
