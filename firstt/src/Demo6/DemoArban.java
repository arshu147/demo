package Demo6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoArban 
{
static
{
System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

}
public static void main(String[] args) throws Exception
{
	//open the browser
	WebDriver driver=new ChromeDriver();
	//maximized the window
	driver.manage().window().maximize();
	//set implicitwait
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	//enter the URL
	driver.get("https://www.urbanladder.com");
	driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
	List<WebElement> alllist = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']"));
	List<WebElement> allsublist = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
	int count = alllist.size();
	System.out.println("=============================================================================================");
	System.out.println("Print all the menu");
	for (int i = 0; i <count; i++) 
	{
		String text = alllist.get(i).getText();
		System.out.println("Print menu"+i+1+" :"+text);
	}
	System.err.println("");
	System.out.println("End of menu");
	System.out.println("==================================================================================================");
		//Thread.sleep(1000);
	System.out.println("==================================================================================================");
	System.out.println(" Start Printing the submenus");	
	System.out.println("");
	for (int i = 0; i <count; i++) 
	{
		WebElement list1 = alllist.get(i);
		Actions action =new Actions(driver);
		action.moveToElement(list1).perform();
		
		for (int j = 0; j <allsublist.size(); j++)
		{
			Thread.sleep(1000);
			String text1 = allsublist.get(j).getText();
			if (!text1.isEmpty())
			{
           System.out.println("print Submenus"+j+1+":"+text1);	
			}			
			
		}
		
		
	}
	System.out.println("==================================================================================================");

	
}
}
