package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstCry {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com");
		driver.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']")).click();
		List<WebElement> categoriesHead = driver.findElements(By.xpath("//div[@class='menu-container media-pros']//ul//li"));
		List<WebElement> count = driver.findElements(By.xpath("(//div[@class='options']//ul[contains(@class,'col-')]//a[contains(@class,'bold spacedown')])"));
//		List<WebElement> babyClothes = driver.findElements(By.xpath("//div[@class='option-container submenu1-1']//ul"));
//		List<WebElement> kidsClothes = driver.findElements(By.xpath("//div[@class='option-container submenu1-2']//ul"));
		for (int i = 0; i < categoriesHead.size(); i++) {
			Thread.sleep(1000);
			act.moveToElement(categoriesHead.get(i)).perform();
			System.out.println("Category : "+categoriesHead.get(i).getText());
			System.out.println("**********");
			
			for (int j = 0; j < count.size(); j++) {
			}
			
			
			
			
			
			
//			for (int j = 0; j < babyClothes.size(); j++) {
//				Thread.sleep(500);
//				System.out.println("Bold categories : "+babyClothes.get(j).getText());
//			}
//			System.out.println("---------------------------------------------");
//			for (int k = 0; k < kidsClothes.size(); k++) {
//				Thread.sleep(500);
//				System.out.println("Bold categories : "+kidsClothes.get(k).getText());
//			}
//			System.out.println("---------------------------------------------");
			
		}
	}
}
