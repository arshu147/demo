package march6;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class craft {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.craftsvilla.com/");
		List<WebElement> list = driver.findElements(By.xpath("//nav[@id='mega-menu']/descendant::span[@class='first_arrow icon']/parent::a"));
		int count = list.size();
		System.out.println("Main menu: "+count);
		System.out.println( );
	
		for(int i=0; i<count; i++)
		{
			Thread.sleep(500);
			String text = list.get(i).getText();
			System.out.println("Main menu: "+text);	
		}
		
		driver.close();
	}

}
