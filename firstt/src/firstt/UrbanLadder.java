package firstt;

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

public class UrbanLadder {
	WebDriver driver;

	@BeforeMethod

	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		driver.get("https://www.urbanladder.com/");
		Thread.sleep(100);
	}

	@AfterMethod
	public void closeBrowser()
	{
		driver.close();
	}
	@Test

	public void urbanLadder() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(500);
		Actions a = new Actions(driver) ;
		// to get the menus

		List<WebElement> xp = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/child::ul/child::li/child::span[@class ='topnav_itemname']"));
		int count = xp.size();
		System.out.println("Total no. of menus : "+count);
		for(int i =0; i<count;i++)
		{

			String menu = xp.get(i).getText();
			System.out.println("Main menu : "+menu);
			Thread.sleep(100);

			a.moveToElement(xp.get(i)).perform();

			List<WebElement> smenu = driver.findElements(By.xpath("//div[@id ='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+menu+"')]/following-sibling::div/descendant::div[@class='taxontype']")); 
			int scount = smenu.size();
			System.out.println("Submenus for "+xp.get(i).getText()+" are : ");


			for(int j =0;j<scount;j++)
			{
				Thread.sleep(500);
				String text = smenu.get(j).getText();
				System.out.println("Submenu - "+text);

			List<WebElement> list = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')and contains(.,'"+menu+"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+text+"']/parent::div/following-sibling::ul/descendant::a"));
				int lcount = list.size();
				
				System.out.println("Options  for submenu " +text+ " are : ");

				for(int k =0; k<lcount;k++)
				{
					Thread.sleep(500);
					String text1 = list.get(k).getText();
					System.out.println("      "+text1);
				} 

			}


			/*	for(int i =0; i<count;i++)
		{
			a.moveToElement(xp.get(i)).perform();

			List<WebElement> sxp = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::li[@class ='sublist_item']/child::div[@class='taxontype']/child::a[@class='inverted']"));
			int scount = sxp.size(); //42
			System.out.println("Submenus for "+xp.get(i).getText()+" are : ");
			for(int j =0; j<scount;j++)
			{
				Thread.sleep(500);
				String menu1 =sxp.get(j).getText();
				if(!menu1.isEmpty())
				{

				System.out.println("        "+menu1);

				}

			}

			}*/


		}
	}
}


