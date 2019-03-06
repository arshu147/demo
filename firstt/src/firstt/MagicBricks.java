package scenarios1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagicBricks {

	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magicbricks.com/property-for-sale-rent-area-South-in-Bangalore/commercial-real-estate-area-South-in-Bangalore");
		Thread.sleep(500);
		
	//**************************** Property Selection ***********************************
		
		WebElement property = driver.findElement(By.xpath("//div[@id='buy_propertyType']"));
		
		property.click();
		
		Thread.sleep(500);

		WebElement checkBox = driver.findElement(By.xpath("//span[@id='propType_buy_span_10011']"));
		checkBox.click();
		
		Thread.sleep(500);

 //******************************* Budget Selection ****************************************
		
		driver.findElement(By.id("buy_budget_lbl")).click();
		
		WebElement minamount=driver.findElement(By.id("rangeMinLinkbudgetBuyinput"));
		
		minamount.sendKeys("50Lac");
		
				
		WebElement maxamount=driver.findElement(By.id("rangeMaxLinkbudgetBuyinput"));
		maxamount.sendKeys("70Lac");
		
// ******************************** Click Search Button *******************************************
		
		driver.findElement(By.id("btnPropertySearch")).click();
		
		 List<WebElement> linklist = driver.findElements(By.tagName("a"));
	        
	        System.out.println(linklist.size());
	        
	        for(int i=0; i<linklist.size();i++)
	        {
	        	String linkText = linklist.get(i).getText();
	        	
	        	System.out.println(linkText);
	        }
	        
	        
			}

			
	}

