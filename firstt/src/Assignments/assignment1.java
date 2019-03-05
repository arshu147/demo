package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class assignment1
{
	
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.craftsvilla.com/");
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
		driver.findElement(By.xpath("//input[@id='searchval']")).sendKeys("gowns");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Thread.sleep(3000);
		List<WebElement> images = driver.findElements(By.xpath("//a[@class='product-name']"));
		Class className = images.getClass();
		System.out.println(className);
		String cls = images.getClass().getName();
		System.out.println(cls);
		int count = images.size();
		System.out.println(count);
		Thread.sleep(2000);
		List<WebElement> allCosts = driver.findElements(By.xpath("//span[@class='product-offer-price']"));
		int count1 = allCosts.size();
		System.out.println(count1);
//		
//		for(WebElement image:images)
//		{
//			String text = image.getText();
//			Reporter.log(text,true);
//		}
//		
//		for(WebElement cost:allCosts)
//		{
//			String eachRate = cost.getText();
//			Reporter.log(eachRate,true);
//		}
		
		for(int i=0; i<count; i++)
		{
			System.out.println("Name of the Product = "+images.get(i).getText()+"Price of the Product = "+allCosts.get(i).getText());
		}
	}
}
