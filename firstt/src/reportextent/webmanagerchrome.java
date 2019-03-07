package reportextent;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webmanagerchrome 
{
	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver d = new ChromeDriver();
		d.close();
	}

}
