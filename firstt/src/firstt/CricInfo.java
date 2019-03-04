package firstt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CricInfo {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.espncricinfo.com/");
		Thread.sleep(3000);
		WebElement scorecard = driver.findElement(By.xpath("(//span[contains(text(),'Result')])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(scorecard).perform();
		driver.findElement(By.xpath("(//a[contains(text(),'Scorecard')])[1]")).click();
		driver.findElement(By.className("cscore_score "));
}
}