package scenarios1;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSessestion {
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{

//********************* Open the Browser *********************************************
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//******************** Enter URL *****************************************************
		
		driver.get("https://www.google.com");
		
//******************** Type Selenium in Search box *************************************
		
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("Selenium");
		
//******************** Find all auto suggestion Elements**********************************
		
		String xp = "//span[text()='selenium']";
		List<WebElement> allase = driver.findElements(By.xpath(xp));
		
//********************* Count them ase-auto suggestion element ****************************
		
		int count=allase.size();
		
		System.out.println(count);
		
//********************* Print all auto -suggestion elements *********************************	
		
		for(int i=0; i<count;i++)
		{
			WebElement ase = allase.get(i);
			String text = ase.getText();
			System.out.println(text);
		}
		
	
		driver.close();
	}

}
