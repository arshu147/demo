package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FirstCry {
	WebDriver driver;
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "./SeleniumServer/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.firstcry.com/");
	}
	@AfterMethod
	public void closeBrowser() {
		driver.close();
	}
	@Test
	public void firstCryMenus() {
		String mainMenuXp = "//div[@class='mam fc_transform']/descendant::div[@class='menu-container media-pros']/ul/descendant::li/span[contains(@id,'menu')]/parent::li/a";
		List<WebElement> mainMenu = driver.findElements(By.xpath(mainMenuXp));
		for (int i = 0; i < mainMenu.size(); i++) {
			
		}
	}

}
