package firstt;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MagickBricksDemo {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magicbricks.com");
		driver.findElement(By.id("keyword")).sendKeys("Bangalore south");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.id("buy_proertyTypeDefault"))).click().build().perform();
		driver.findElement(By.id("propType_buy_chk_10002_10003_10021_10022")).click();
		driver.findElement(By.id("propType_buy_chk_10001_10017")).click();
		driver.findElement(By.id("bhk_11701")).click();
		Thread.sleep(2000);
		act.moveToElement(driver.findElement(By.id("buy_budget_lbl"))).click().build().perform();
		driver.findElement(By.xpath("//div[@class='range rangeMin']//li[@value='5000000']")).click();
		driver.findElement(By.xpath("//div[@class='range rangeMax']//li[@value='7000000']")).click();
		driver.findElement(By.id("btnPropertySearch")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("projectTab")).click();
		Robot robot = new Robot();
		//scroll pages
		for (int i = 0; i <10; i++) {
			robot.keyPress(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(500);
		}
		Thread.sleep(3000);
		//to print new project
		List<WebElement> newProjects = driver.findElements(By.xpath("//strong"));
		System.out.println("The New Projects are : ");
		System.out.println("------------------------");
		for (WebElement single : newProjects) {
			Thread.sleep(500);
			System.out.println(single.getText());
		}
		Thread.sleep(2000);
		driver.close();
	}
}
