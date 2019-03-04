package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleAutoSug {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> allSug = driver.findElements(By.xpath("*//div[@class='sbtc']"));
		
		System.out.println(allSug.size());
		for(int i=allSug.size()-1;i>=0;i--)
		{
			String s = allSug.get(i).getText();
			System.out.println(s);
		}
		
		for(WebElement selenium:allSug)
		{
			System.out.println(selenium.getText());
		}
		allSug.get(2).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		List<WebElement> allSugRev = driver.findElements(By.xpath("*//div[@class='sbtc']"));
		
		for(int i=allSug.size()-1;i>=0;i--)
		{
			String s = allSugRev.get(i).getText();
			System.out.println(s);
		}
       driver.close();
	}

}