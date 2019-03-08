package march6;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladd {
	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void SetXlData(String value, int i)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./data/urbanladder.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet shee = wb.getSheet("Menu");
			shee.createRow(0).createCell(0).setCellValue("Actual Value");
			shee.createRow(0).createCell(1).setCellValue("Excepted value");
			shee.createRow(i).createCell(0).setCellValue(value);
			FileOutputStream fos = new FileOutputStream("./data/urbanladder.xlsx");
			wb.write(fos);
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}

	}
	
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		
		
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[@class='topnav_itemname']"));
		int count = names.size();
		System.out.println("Main menu: "+count);
		System.out.println( );
		int x = 1;
		for(int i=0; i<count; i++)
		{
			Thread.sleep(500);
			String text = names.get(i).getText();
			System.out.println("Main menu: "+text);	
			SetXlData(text, x++);
			
			Actions act = new Actions(driver);
			act.moveToElement(names.get(i)).perform();
			List<WebElement> boldmenu = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+ text +"')]/following-sibling::div/descendant::div[@class='taxontype']"));
			int count1 = boldmenu.size();
			for(int j=0; j<count1; j++)
			{
				Thread.sleep(500);
				String text1 = boldmenu.get(j).getText();
				System.out.println("Bold menu: "+text1);
				SetXlData(text1, x++);
				
				Thread.sleep(500);
				List<WebElement> subName = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+ text +"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+text1+"']/parent::div/following-sibling::ul/descendant::a"));
				int count2 = subName.size();
				for(int k=0; k<count2; k++)
				{
					Thread.sleep(500);
					String text2 = subName.get(k).getText();
					SetXlData(text2, x++);
				
					System.out.println("Submenu : "+text2);
				}
			}
		}
		
		driver.close();
	}

}
