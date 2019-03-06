package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MagicBricks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.magicbricks.com/");
		driver.findElement(By.id("keyword")).sendKeys("Bangalore");
		WebElement property = driver.findElement(By.id("buy_proertyTypeDefault"));
		property.click();
		WebElement Warehouse = driver.findElement(By.id("10011"));
		Warehouse.click();
		WebElement Budget = driver.findElement(By.id("buy_budget_lbl"));
		Budget.click();
		WebElement MinBudget = driver.findElement(By.id("rangeMinLinkbudgetBuyinput"));
		MinBudget.sendKeys("50Lac");
		WebElement MaxBudget = driver.findElement(By.id("rangeMaxLinkbudgetBuyinput"));
		 MaxBudget.sendKeys("70Lac");
		 driver.findElement(By.id("btnPropertySearch")).click();
		 //..................................//
		 List<WebElement> linklist = driver.findElements(By.tagName("a"));
			System.out.println(linklist.size());
			//print all the choices
			for(int i=0;i<linklist.size();i++)
			{
				String linkText = linklist.get(i).getText();
				System.out.println(linkText);
			}
		

	}

}
