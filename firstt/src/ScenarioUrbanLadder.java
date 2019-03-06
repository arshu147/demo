import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScenarioUrbanLadder {
	    static{

		   System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
         }

public static void main(String[] args)  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com");
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		
		List<WebElement> li = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li"));
	    List<WebElement> submenu = driver.findElements(By.xpath("//div[@class='subnavlist_wrapper clearfix']/descendant::div[@class='taxontype']/a"));
		int count = li.size();
		System.out.println(count);
		for(int i=0;i<count;i++){
			String mainmenu = li.get(i).getText();
			System.out.println(mainmenu);
		//Thread.sleep(1000);  
        Actions action=new Actions(driver);
       
	    action.moveToElement((li.get(i))).perform();
	    for(int j=0;j<submenu.size();j++){
	    	String text1 = submenu.get(j).getText();
	    	if(!text1.isEmpty()){
	    		System.out.println( text1);
	    	}
	      }
		}
		//driver.close();
		
	}

}




