package firstt;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon
{
	WebDriver driver;
@BeforeMethod
public void open()
 {
	System.setProperty("webdriver.chrome.driver", "./jars/chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 }
@Test
public void test()
{
	WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	searchBox.sendKeys("Mi RedmiNote4 mobile");
	WebElement searchIcon = driver.findElement(By.xpath("//input[@type='submit' and @value='Go']"));
	searchIcon.click();
	List<WebElement> allLinks = driver.findElements(By.xpath("//h2"));
	System.out.println(allLinks.size());
	//List<WebElement> costofLink = driver.findElements(By.xpath("//div[@class='a-column a-span7']/descendant::div[@class='a-row a-spacing-none']/a/descendant::span[@class='currencyINR']"));
	List<WebElement> costofLink = driver.findElements(By.xpath("//span[@class='a-size-base a-color-price s-price a-text-bold']"));
	System.out.println(costofLink.size());
	for(int i=0;i<allLinks.size();i++)
{
        String linkText = allLinks.get(i).getText();
		System.out.println(linkText+" ");
	for(int j=i;j<costofLink.size();j++)
		{
			String costofLinkText = costofLink.get(j).getText();
			System.out.print(costofLinkText+" ");
			break;
		}
	}
}
@AfterMethod
public void close()
{
	driver.close();
}
}
