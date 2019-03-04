package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class AllLinks {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		//WebDriverWait wait=new WebDriverWait(driver, 30);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://in.bookmyshow.com/");
		List<WebElement> allImg = driver.findElements(By.xpath("//img"));
		List<WebElement> allLinks= driver.findElements(By.xpath("//a"));
		List<WebElement> allButtons = driver.findElements(By.xpath("//button"));
		List<WebElement> allRadioButtons = driver.findElements(By.xpath("*//input[@type='radio']"));
		List<WebElement> txtBoxes = driver.findElements(By.xpath("*//input[@type='text' or @type='password']"));
		System.out.println("Total number of images: "+allImg.size());
		System.out.println("Total number of links: "+allLinks.size());
		System.out.println("Total number of buttons: "+allButtons.size());
		System.out.println("Total number of radio buttons: "+allRadioButtons.size());
		System.out.println("Total number of textboxes: "+txtBoxes.size());
 driver.close();
}
}
