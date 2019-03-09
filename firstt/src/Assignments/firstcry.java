package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstcry
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.firstcry.com");
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
		List<WebElement> allCategories = driver.findElements(By.xpath("//div[@class='menu-container media-pros']/descendant::a"));
		int count = allCategories.size();
		for(int i=0; i<count; i++)
		{
			String text = allCategories.get(i).getText();
			System.out.println(text);
			Actions act = new Actions(driver);
			act.moveToElement(allCategories.get(i)).perform();
			driver.findElements(By.xpath(""));
		}
			
//		List<WebElement> mainMenu = driver.findElements(By.xpath("//a[@class='bold spacedown']"));
//		int count = allCategories.size();
//		System.out.println(count);
//		for(WebElement category:allCategories)
//		{
//			String text = category.getText();
//			Reporter.log(text,true);
//		}
//		int count1 = mainMenu.size();
//		System.out.println(count1);
//		for(WebElement menu:mainMenu)
//		{
//			String text = menu.getText();
//			Reporter.log(text,true);
//		}
	}

}
