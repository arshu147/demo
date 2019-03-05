package firstt;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CraftsVilla {

	@Test
	public void openBrowser() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 
	driver.get("https://www.craftsvilla.com/");
	Thread.sleep(1000);
 driver.findElement(By.name("q")).sendKeys("kurtis");
driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();	
	List<WebElement> pname = driver.findElements(By.xpath("//a[@class ='product-name']"));
	int produt_size = pname.size();
	System.out.println("Product count - "+produt_size);
	
	Thread.sleep(500);
	List<WebElement> products = driver.findElements(By.xpath("//span[@class='product-offer-price']"));
    int price_products = products.size();
    System.out.println("Price of products : "+price_products);
	
	for(int i = 0; i<=produt_size;i++)
	{
	
					System.out.println("name of product - "+pname.get(i).getText()+"price of product - "+products.get(i).getText());
					
				      
			
	}
	
	/* for(WebElement proname : pname)
    {
  	   String name = proname.getText();
  	   System.out.println(name);
  	   
    } */
    

      
      
      Thread.sleep(500);
      driver.close();
	}

}
