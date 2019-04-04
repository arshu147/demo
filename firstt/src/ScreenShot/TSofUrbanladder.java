package ScreenShot;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

import net.bytebuddy.description.modifier.SynchronizationState;

public class TSofUrbanladder {
		
	static {
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver.exe");
}
	
	 static WebDriver driver=new ChromeDriver();

	public static void takeScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);//take screenshot and store in temporary memory ram
		File destfile = new File("./photo/urban.png");//for storing in folder 
		Files.copy(srcfile, destfile);
	}
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[contains(@class,'close-reveal-modal ')]")).click();
		
		List<WebElement> allList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')]")); 
		
		
			int count=allList.size();
//			System.out.println(count);
		
			for(int i=0;i<count;i++) {
				
			Thread.sleep(1000);	
			String text1 = allList.get(i).getText();
			System.out.println(text1);
			
			Actions action=new Actions(driver);
			action.moveToElement(allList.get(i)).perform();		
			Thread.sleep(1000);
			takeScreenshot();
			
			
			List<WebElement> allSub = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a"));
			 
			int count2 = allSub.size();
//			System.out.println(count2);
			
			for (int j = 0; j < count2; j++)
			{
			Thread.sleep(500);	
        	String text2 = allSub.get(j).getText();
        	System.out.println(text2);
        	
        	List<WebElement> allSub2 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+text2+"']/parent::div/following-sibling::ul/descendant::a"));
        	      int count3 = allSub2.size();
        	      System.out.println(count3);
        	    for(int k=0;k<count3;k++)    {
        	    Thread.sleep(500);	
        		String text3 = allSub2.get(k).getText();
//            	System.out.println(text3);
        		
        	}
         }		
	  }
		
   }
	
	
}


