package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FirstCry {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
		driver.findElement(By.xpath("//div[@class='_pop_close _pop_reg_bg']")).click();
		List<WebElement> allmenu = driver.findElements(By.xpath("//div[@class='menu-container media-pros']//li"));
		int count = allmenu.size();
		System.out.println(count);
		for(int i=0;i<count;i++)
		{
			String menu = allmenu.get(i).getText();
			System.out.println(menu);
		}
		List<WebElement> allcat = driver.findElements(By.xpath("//li[@class='double']//a[contains(text(),'        Baby ')]"));
		Actions action=new Actions(driver);
		//action.moveToElement(allcat)
		
		//action.moveToElement(allcat).perform();
		
		List<WebElement> mainitem = driver.findElements(By.xpath("//div[@class='option-container submenu1-1']//ul"));
		int count1 = mainitem.size();
		for(int i=0;i<count;i++)
		{
			String text1 = mainitem.get(i).getText();
			System.out.println(text1);
		}
List<WebElement> allsub = driver.findElements(By.xpath("//div[@class='option-container submenu1-1']//ul[@class='col-one']//"));
int count3 = allsub.size();
for(int i=0;i<count3;i++)
{
	String test3 = allsub.get(i).getText();
	System.out.println(test3);
}
	}

}
