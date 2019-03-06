package march6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanlad {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}


	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
driver.get("https://www.urbanladder.com/");
driver.findElement(By.xpath("//a[contains(@class,'close-reveal-modal ')]")).click();
  
   List<WebElement> allList= driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']"));
   List<WebElement> allsub = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));


int count = allList.size();
System.out.println("number of Main menu:"+count);
System.out.println("MAIN MENU");
for(int i=0;i<count;i++)
{
	String tex = allList.get(i).getText();
	System.out.println(tex);
}
System.out.println("LIST OF MENU");

for(int i=0;i<count;i++)
{
	String text = allList.get(i).getText();
	
	System.out.println(text);

	Thread.sleep(1000);
	Actions act=new Actions(driver);
	act.moveToElement(allList.get(i)).perform();
	
	for(int j=0;j<allsub.size();j++)
	{
		
		String text1 = allsub.get(j).getText();
		
		//WebElement s = allsub.get(j);
		if(!text1.isEmpty())
		{

			System.out.println(text1);
		}
	}

}
driver.close();






	}

}
