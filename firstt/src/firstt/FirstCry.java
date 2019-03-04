package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstCry {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("(//div[@onclick='closelogin();'])[3]")).click();
		List<WebElement> categories = driver.findElements(By.xpath("//div[@class='menu-container media-pros']//ul//li"));
		List<WebElement> babyClothes = driver.findElements(By.xpath("//div[@class='option-container submenu1-1']//ul"));
		List<WebElement> kidsClothes = driver.findElements(By.xpath("//div[@class='option-container submenu1-2']//ul"));
		
		for(int i=0;i<categories.size();i++)
		{
			Thread.sleep(1000);
			act.moveToElement(categories.get(i)).perform();
			System.out.println("Category: "+categories.get(i).getText());
			for(int j=0;j<babyClothes.size();j++)
			{
				Thread.sleep(1000);
				System.out.println("Bold categories: "+babyClothes.get(j).getText());
			}
			System.out.println("*********");
			for(int k=0;k<kidsClothes.size();k++)
			{
				Thread.sleep(1000);
				System.out.println("Bold Categories: "+kidsClothes.get(k).getText());
			}
			
		}
		driver.close();
	}
}
