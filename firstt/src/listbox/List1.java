package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class List1 {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement list = driver.findElement(By.id("month"));
		Select sele=new Select(list);
		  List<WebElement> v = sele.getOptions();
		  System.out.println(v.size());
		 int count = v.size();
		 v.isEmpty();
		 v.clear();
		 v.iterator();
//		 System.out.println();
		 for(int i=0;i<count;i++)
		 {
			String st = v.get(i).getText();
			System.out.println(st);
		 }
		 
		 
		
		
		
		

		
		

	}

}
