package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scenario20 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://jqueryui.com/slider/");
		driver.switchTo().frame(0);
		WebElement sliderObj = driver.findElement(By.xpath("//div[@id='slider']/span"));
		Actions act = new Actions(driver);
		for (int i = 0; i < sliderObj.getSize().getWidth(); i++) {			
			act.dragAndDropBy(sliderObj, 20, 0).build().perform();
		}
		Thread.sleep(2000);
		for (int i = sliderObj.getSize().getWidth(); i>=0 ; i--) {			
			act.dragAndDropBy(sliderObj, -20, 0).build().perform();
		}
		Thread.sleep(1000);
		driver.close();
	}
}
