package scenarios1;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YatraFlightbook
{
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		Thread.sleep(500);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Bangalore[BLR]");
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city\']")).sendKeys("Singapore[SIN]");
		WebElement selectDate = driver.findElement(By.id("BE_flight_origin_date"));
		selectDate.click();
		Thread.sleep(500);
		
		driver.findElement(By.id("17/03/2019")).click();
		Thread.sleep(500);

		WebElement searchboutton = driver.findElement(By.xpath("//input[@id='BE_flight_flsearch_btn']"));
		Thread.sleep(500);

		searchboutton.click();
		Thread.sleep(500);
		driver.findElement(By.xpath("//div[text()='Cheapest']")).click();
		
	}
}
