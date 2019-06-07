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
	public void beforetest() 
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.urbanladder.com/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			
			////ul/li/span[@class='topnav_itemname']
		
	}
	@Test
	public void test() throws InterruptedException
	{driver.findElement(By.linkText("Close")).click();
	String MainMenu = "//ul/following::span[@class='topnav_itemname']";
	List<WebElement> MainList = driver.findElements(By.xpath(MainMenu));
	int lCount = MainList.size();
	
	String SubMainMenu = "/ancestor::ul/descendant::div/a[@class='inverted']";
	String Merge = MainMenu+SubMainMenu;
	//System.out.println(Merge);
	for(int i =0;i<lCount;i++)
	{
		WebElement Menu = MainList.get(i);
		System.out.println("**************");
		System.out.println("   MainMenu  ");
		System.out.println("**************");
		System.out.println(MainList.get(i).getText());
		String text = MainList.get(i).getText();
		Actions action = new Actions(driver);
		action.moveToElement(Menu).click().perform();
		Thread.sleep(1000);
		
		//List<WebElement> sMenu = driver.findElements(By.xpath("//ul/following::span[@class='topnav_itemname']/following-sibling::div/descendant::div/a[@class='inverted']"));
		//List<WebElement> sMenu = driver.findElements(By.xpath("//ul/following::span[@class='topnav_itemname']/ancestor::ul/descendant::div/a[@class='inverted']"));
		List<WebElement> sMenu = driver.findElements(By.xpath(Merge));
		
		int sCount = sMenu.size();
		//System.out.println(sCount);
		System.out.println("------------------");
		System.out.println("     SubMenu      ");
		System.out.println("------------------");
		for(int j =0;j<sCount;j++)
		{   
			WebElement sItem = sMenu.get(j);
			
			if(!sItem.getText().isEmpty())
			{
			System.out.println(sItem.getText());
			}
		}
	}
	}
	@AfterMethod
	public void aftertest()
	{
		driver.close();
	}
}
