package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		WebElement e = driver.switchTo().activeElement();
		e.sendKeys("Selenium");
		String xp = "//span[text()='selenium']";
		List<WebElement> allASE = driver.findElements(By.xpath(xp));
		//count auto suggetion
		int count = allASE.size();
		System.out.println(count);
		//print autoSuggestion
		for(int i=0;i<count;i++)
		{
			WebElement ase = allASE.get(i);
			String text = ase.getText();
			System.out.println(text);
		}
		
		driver.close();
		
	}

}
