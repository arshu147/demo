package march3rd;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.description.modifier.SynchronizationState;

public class UrbanLadder {
	
	static {
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver.exe");
}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[contains(@class,'close-reveal-modal ')]")).click();
//		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[contains(@class,'topnav_itemname')]"));
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[@class='topnav_itemname']")); 
		List<WebElement> allsubList = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
		
		int count=allList.size();
		// commite msg
		for(int i=0;i<count;i++) {
			String text = allList.get(i).getText();
			System.out.println(text);
			
			Thread.sleep(1000);
			Actions action=new Actions(driver);
			action.moveToElement(allList.get(i)).perform();
		
        for (int j = 0; j < allsubList.size(); j++) {
        	String text1 = allsubList.get(j).getText();
        	
        	if(!text1.isEmpty()) {
        		System.out.println(text1);
        	}
         }		
	  }
		
		driver.close();
   }
}


