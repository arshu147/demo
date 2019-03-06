package AssignMarch6th;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
//************************** To handle the Notification *****************************************
		
		ChromeOptions PopupHandle = new ChromeOptions();
		PopupHandle.addArguments("--disable-notifications");

//******************** To Open Browser ***********************************************************		
		
		driver.get("https://www.urbanladder.com/");
		
		Thread.sleep(1000);
		
//********************* To close the popup window *************************************************
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
//********************** To print main menu and under that sub menu ************************************
		
		List<WebElement> alllList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']"));
		
		List<WebElement> allSublist = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
		
		int Count = alllList.size();
		
		System.out.println("To count mainmenus header text" +Count);
		
		System.out.println("************************* Printing the Main Menu Text ************************************");		
	
		for(int i=0;i<Count;i++)
		{
			String Text1 = alllList.get(i).getText();
			System.out.println(Text1);
			Thread.sleep(1000);
		}
		System.out.println("************** Now print all the menu *********************");
		
		for(int i=0;i<Count;i++)
		{
			WebElement List1 = alllList.get(i);
			
			Actions action=new Actions(driver);
			
			action.moveToElement(List1).perform();
			
			for(int j=0;j<allSublist.size();j++)
			{
				String Text2 = allSublist.get(j).getText();
				
				if(!Text2.isEmpty())
				{
					System.out.println(Text2);
				}
			}
		}
		
		driver.close();
		
	}
	
}


