package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UrbanLadder
{
	WebDriver driver;

	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
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
		List<WebElement> names = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[@class='topnav_itemname']"));
		int count = names.size();
		System.out.println("Categories count is = "+count);
		for(int i=0; i<count; i++)
		{
			String text = names.get(i).getText();
			System.out.println("Categorie Name = "+text);	
		}
		
		for(int i=0; i<count; i++)
		{
			Actions act = new Actions(driver);
			act.moveToElement(names.get(i)).perform();
			List<WebElement> boldNames = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
			int count1 = boldNames.size();
			for(int j=0; j<count1; j++)
			{
				Thread.sleep(500);
				String text1 = boldNames.get(j).getText();
				if(!text1.isEmpty())
				{
					System.out.println("Bold Name = "+text1);
				}
			}
		}
	}
}
