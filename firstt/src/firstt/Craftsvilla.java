package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Craftsvilla {
static
{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.craftsvilla.com/");
	Thread.sleep(1000);
    WebElement search = driver.findElement(By.id("searchval"));
    search.sendKeys("sarees");
    driver.findElement(By.xpath("//button[@class='btn btn-default search-button']")).click();
    Thread.sleep(1000);
	List<WebElement> options = driver.findElements(By.xpath("//a[@class='product-name']"));
	List<WebElement> price = driver.findElements(By.className("product-offer-price"));
	int size = options.size();
	System.out.println("number of choices: "+size);
	Thread.sleep(3000);
	for (WebElement element : options) {
		System.out.println(element.getText());
	}
	Thread.sleep(3000);
	
	for (WebElement priceelement : price) {
		System.out.println(priceelement.getText());
	}
	Thread.sleep(2000);
	driver.close();
}

}