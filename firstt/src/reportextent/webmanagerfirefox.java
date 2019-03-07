package reportextent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class webmanagerfirefox
{
	public static void main(String[] args) throws Exception 
	{
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver d = new FirefoxDriver();
		Thread.sleep(5000);
		d.close();
	}


}
