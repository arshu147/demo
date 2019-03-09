package Assignments;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class magicbricks 
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.magicbricks.com");
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
		driver.findElement(By.xpath("//input[@class='cityLocProjectField']")).sendKeys("Bangalore South");
		driver.findElement(By.xpath("//span[@id='buy_proertyTypeDefault']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@name='bar_propertyType_new_buy'])[1]")).click();
		driver.findElement(By.xpath("(//input[@title='2 BHK'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@value='Budget'])[1]")).click();
		driver.findElement(By.xpath("//input[@id='rangeMinLinkbudgetBuyinput']")).click();
		driver.findElement(By.xpath("//li[@actualval='5000000']")).click();
		driver.findElement(By.xpath("//input[@id='rangeMaxLinkbudgetBuyinput']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//li[@value='7000000'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='btnPropertySearch']")).submit();
		Thread.sleep(10000);
		WebElement flates = driver.findElement(By.xpath("//h1[contains(.,'2 BHK Residential Properties')]"));
		String text = flates.getText();
		Reporter.log(text, true);
//		List<WebElement> status = driver.findElements(By.xpath("//div[.='status']"));
//		int count = status.size();
//		System.out.println(count);
		
		driver.findElement(By.xpath("//a[@id='projectTab']")).click();
		Thread.sleep(2000);
		Robot r1 = new Robot();
		for(int i=0; i<=10;i++)
		{
			r1.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(5000);
		}
		List<WebElement> allProjects = driver.findElements(By.xpath("//strong"));
		int count1 = allProjects.size();
		System.out.println(count1);
		for(WebElement project:allProjects)
		{
			String text1 = project.getText();
			Reporter.log(text1,true);
		}
	}

}
