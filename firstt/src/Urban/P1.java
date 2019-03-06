package Urban;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class P1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		ChromeOptions PopupHandle = new ChromeOptions();
		PopupHandle.addArguments("--disable-notifications");
		//get the url
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		//get the AllMainMenulist//xpath for mainMenu
		List<WebElement> AllMainMenulistt = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']"));
		////get the AllSubMenulist//xpath for submenu
		List<WebElement> AllSubMenulist = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
		//int Count =//AllMainMenulist.size();
		int Count = AllMainMenulistt.size();
		System.out.println(Count);
		//.............print the Headertext............
		for(int i=0;i<Count;i++)
		{
			String MainmenuText = AllMainMenulistt.get(i).getText();						
			System.out.println(MainmenuText);
			Thread.sleep(1000);
		}
	 
	 		System.out.println("Now printing of sub-menu");
	 
	 		for(int i=0;i<Count;i++)
		{
			
	 		WebElement List1 = AllMainMenulistt.get(i);
			Actions action=new Actions(driver);
			action.moveToElement(List1).perform();
			for(int j=0;j<AllSubMenulist.size();j++)
			{
				String Text2 = AllSubMenulist.get(j).getText();
				if(!Text2.isEmpty())
				{
					System.out.println(Text2);
				}
			}
		}
		
		
		
		
	}

}

