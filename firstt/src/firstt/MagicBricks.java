package firstt;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MagicBricks {
	@Test
	public void searchHome() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver(); 
	 /* System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe" );
	 WebDriver driver = new FirefoxDriver();*/
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	driver.get("https://www.magicbricks.com/");
	Thread.sleep(1000);
	driver.findElement(By.xpath("//input[@placeholder='Enter Location, Project or Landmark']")).sendKeys("South bangalore");
	Thread.sleep(500);
	driver.findElement(By.id("buy_propertyType")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@title='Flat']")).click();
	Thread.sleep(500);
	driver.findElement(By.xpath("//input[@title='2 BHK']")).click();
	driver.findElement(By.id("buy_budget_lbl")).click();
	Thread.sleep(500);
	driver.findElement(By.id("rangeMinLinkbudgetBuyinput")).sendKeys("50 Lac");
	Thread.sleep(500);
	driver.findElement(By.id("rangeMaxLinkbudgetBuyinput")).sendKeys("70 Lac");
	driver.findElement(By.id("btnPropertySearch")).click();
	Thread.sleep(500);
	List<WebElement> allproperties = driver.findElements(By.xpath("//span[@class='m-srp-card__title__bhk']"));
	
	int count = allproperties.size();
	System.out.println("no. of properties = "+count);
	
	//to print all the properties in new projects
	
	driver.findElement(By.id("projectTab")).click();
	
	Robot r = new Robot();
	for(int i=0 ; i<10; i++)
	{
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(500);
	}
	
	List<WebElement> new_pro = driver.findElements(By.xpath("//strong"));
	
	int pcount= new_pro.size();
	System.out.println("New projects = "+pcount);
	
	
	driver.close();
	
	
}
	
}
