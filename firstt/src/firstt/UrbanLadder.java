package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class UrbanLadder {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	@Test
	public void testUrbanLadder() throws Exception
	{
		// Open The Browser
		WebDriver driver=new ChromeDriver();
		//Maximize The Browser
	   driver.manage().window().maximize();
		// Set Implicit Wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Enter the URL
		driver.get("https://www.urbanladder.com/");
		//Handle The pop-up
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//For the categories
		System.out.println("Printing all the categories");
		List<WebElement> categorylist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[@class='topnav_itemname']"));
		for(int i=0;i<categorylist.size();i++)
		{
			String cat=categorylist.get(i).getText();
			System.out.println(cat);
			
		}
		// To get The subcategories
		System.out.println("Printing sub Menu");
		
		for(int i=0;i<categorylist.size();i++)
		{
			WebElement cat = categorylist.get(i);
					
			Actions act=new Actions(driver);
			act.moveToElement(cat).perform();
			// Subcategory list
			List<WebElement> Subcat = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::li[@class='sublist_item']/div[@class='taxontype']/a[contains(@class,'inverted')]"));
			for(int j=0;j<Subcat.size();j++)
			{
				Thread.sleep(1000);
				String subcatText = Subcat.get(j).getText();
			//	Thread.sleep(1000);
				if (!subcatText.isEmpty()) 
				{
					System.out.println(subcatText);	
				}
				
			}
			}

}
}
