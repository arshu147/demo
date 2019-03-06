package scenarios1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BookMyShow {
   static  int count;


	static
	{
		System.setProperty("webdriver.chrome.driver","./Driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException 
	{

//********************* Open the Browser *********************************************
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//******************** Enter URL *****************************************************
		
		driver.get("https://www.bookmyshow.com");

//******************* Total No. Of links *********************************************	
		
        List<WebElement> links = driver.findElements(By.xpath("//a"));    //Identify the number of Link on webpage and assign into Webelement List 
        
        int linkCount = links.size();     // Count the total Link list on Web Page
        
        System.out.println("Total Number of link count on webpage = "  + linkCount);    //Print the total count of links on webpage

//******************* Total No. of images *********************************************
        
        List<WebElement> listImages=driver.findElements(By.tagName("img"));
        
        System.out.println("Total No. of Images: "+listImages.size());
        
//****************** Total No. of RadioButtons ****************************************************  
        
        List<WebElement> RadioNamelist = driver.findElements(By.xpath("//label[contains(@class,'z-radio-content')]"));

       System.out.println("Total count of RadioButtons on BookMyshow is : "+RadioNamelist.size());

        		 
//******************* Total No. TextBoxes ******************************************************
	
	List<WebElement> textboxes = driver.findElements(By.xpath("//input[@id='inp_RegionSearch_top']"));

	System.out.println("Total no. of Textboes on Bookmyshow page : "+textboxes.size());
	
	driver.close();

	
	   }
	}

