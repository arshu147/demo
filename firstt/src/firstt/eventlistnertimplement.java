package firstt;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class eventlistnertimplement
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		EventFiringWebDriver edriver = new EventFiringWebDriver(driver);
		
		eventlistner e1 = new eventlistner();
		
		edriver.register(e1);
		
		edriver.get("https://www.google.com");
		
		Thread.sleep(3000);
		
		edriver.close();
	}

}
