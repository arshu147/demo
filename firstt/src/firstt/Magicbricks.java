package firstt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Magicbricks {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.magicbricks.com/");
		driver.findElement(By.id("keyword")).sendKeys("Bangalore-South");
		driver.findElement(By.id("buy_propertyType")).click();
		driver.findElement(By.xpath("//input[@title='House/Villa']")).click();
		driver.findElement(By.xpath("(//input[@value='11701'])[1]")).click();
		driver.findElement(By.id("buy_budget_lbl")).click();
		driver.findElement(By.id("rangeMinLinkbudgetBuyinput")).click();
		driver.findElement(By.xpath("//li[@value='5000000']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("rangeMaxLinkbudgetBuyinput")).click();
		driver.findElement(By.xpath("(//li[@value='7000000'])[2]")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("btnPropertySearch")).click();
		WebElement properties = driver.findElement(By.xpath("//span[contains(text(),'(47)')]"));
		System.out.println("Total number of properties: "+properties.getText());
		driver.close();
		

}
}