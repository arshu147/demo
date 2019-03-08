package webdriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver d=new ChromeDriver();
		EventFiringWebDriver driver=new EventFiringWebDriver(d);
		DemoA d2=new DemoA();
		driver.register(d2);
		driver.get("https://jenkins.io/download/");
		//driver.findElement(By.xpath(""));
		//driver.findElements(By.xpath(""));
	}

}
