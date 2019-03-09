package Assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class bookmyshow 
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://in.bookmyshow.com/bengaluru");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}
	
	@Test
	public void action() throws Exception
	{
		List<WebElement> images = driver.findElements(By.xpath("//img"));
		System.out.println("Total Images count = "+images.size());
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total Links count = "+links.size());
		List<WebElement> buttons = driver.findElements(By.xpath("//button"));
		System.out.println("Total Buttons count = "+buttons.size());
		List<WebElement> radioButton = driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("Total RedioButtons count = "+radioButton.size());
		List<WebElement> textBox = driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println("Total TextBox count = "+textBox.size());
	}

}
