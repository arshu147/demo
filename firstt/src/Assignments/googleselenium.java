package Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class googleselenium 
{
	WebDriver driver;
	
	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
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
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(6000);
		List<WebElement> allSuggestion = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		int count = allSuggestion.size();
		System.out.println(count);
		for(WebElement suggestion:allSuggestion)
		{
			String text = suggestion.getText();
			Reporter.log(text,true);
		}
		allSuggestion.get(2).click();
		driver.navigate().back();
		Reporter.log("---------------------------------",true);
		System.out.println();
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("selenium");
		Thread.sleep(6000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//span[contains(.,'selenium')]"));
		Thread.sleep(5000);
		for(int i=suggestions.size()-1; i>=0; i--)
		{
			System.out.println(suggestions.get(i).getText());
		}
	}
}
