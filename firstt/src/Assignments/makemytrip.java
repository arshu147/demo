package Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class makemytrip 
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.gecko.driver", "./softwares/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.makemytrip.com");
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
		driver.findElement(By.xpath("//span[contains(.,'Homestays')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Munnar, Kerala, India");
		driver.findElement(By.xpath("//label[.='CHECK-IN']")).click();
		driver.findElement(By.xpath("(//div[.='13'])[1]")).click();
		driver.findElement(By.xpath("(//div[.='20'])[1]")).click();
		driver.findElement(By.xpath("//label[contains(.,'ROOMS')]")).click();
		driver.findElement(By.xpath("(//li[.='1'])[1]")).click();
		driver.findElement(By.xpath("//button[.='APPLY']")).click();
		Thread.sleep(5000);
	}

}
