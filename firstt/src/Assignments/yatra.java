package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class yatra
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.yatra.com/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	@Test
	public void action() throws Exception
	{
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_city']")).sendKeys("Bangalore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BE_flight_arrival_city']")).sendKeys("Singapore");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='BE_flight_origin_date']")).click();
		driver.findElement(By.xpath("//td[@id='18/03/2019']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
		Thread.sleep(9000);
		driver.findElement(By.xpath("(//span[contains(.,'Book Now')])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Swathi");
		driver.findElement(By.xpath("//input[@placeholder='DD/MM/YYYY']")).click();
		
//		WebElement month = driver.findElement(By.xpath("//select[@class='months ng-pristine ng-valid ng-touched']"));
					
	}

}
