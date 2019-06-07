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

public class Amazon {
	
	WebDriver driver;
	@BeforeMethod
	public void beforetest()
	{
		
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@Test
	public void test()
	{
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("laptops");
		driver.findElement(By.xpath("//input[@type='submit' and @value='Go'] ")).click();
		List<WebElement> plist = driver.findElements(By.xpath("//h2"));
		int productCount = plist.size();
		System.out.println("Product Count"+productCount);
		List<WebElement> pricelist = driver.findElements(By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']"));
		for(int i =0;i<productCount;i++)
		{
		    WebElement l = plist.get(i);
		    System.out.println(l.getText());
		    ////span[@class='a-size-base a-color-price s-price a-text-bold']
		    
		   WebElement p =pricelist.get(i);
		   System.out.println(p.getText());
		   
		    
			
		}
		
	}
	@AfterMethod
	public void aftertest()
	{
		
	}


}
