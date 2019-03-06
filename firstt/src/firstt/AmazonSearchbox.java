package scenarios1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSearchbox {
	
	
	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
			{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		
		WebElement serachbox = driver.findElement(By.id("twotabsearchtextbox"));
					
		serachbox.sendKeys("Books for kids");
		
		WebElement searchButton=driver.findElement(By.cssSelector((".nav-search-submit")));
        searchButton.click();
        
        WebElement listofchoice = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        
       String numberofchoices = listofchoice.getText();
        
        System.out.println("List of number of choices : - "+ numberofchoices);
        
      //  driver.findElement(By.xpath("//input[contains(@type,'submit')])[1]")).click();
        
       List<WebElement> linklist = driver.findElements(By.tagName("a"));
        
        System.out.println(linklist.size());
        
        for(int i=0; i<linklist.size();i++)
        {
        	String linkText = linklist.get(i).getText();
        	System.out.println(linkText);
        }
        
        
		}
			}	
