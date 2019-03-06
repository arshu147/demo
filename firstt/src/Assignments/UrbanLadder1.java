package Assignments;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class UrbanLadder1

{
	WebDriver driver;
	
	public static void writeExcel(String value, int i)
	{
		try 
		{
			FileInputStream fis = new FileInputStream("./data/urbanladder.xlsx");
			Workbook wb = WorkbookFactory.create(fis);
			Sheet shee = wb.getSheet("Sheet1");
			shee.createRow(0).createCell(0).setCellValue("Expected Value");
			shee.createRow(i).createCell(0).setCellValue(value);
			FileOutputStream fos = new FileOutputStream("./data/urbanladder.xlsx");
			wb.write(fos);
		} 
		catch (Exception e)
		{
		}
		
	}

	@BeforeMethod
	public void openApp()
	{
		System.setProperty("webdriver.chrome.driver", "./softwares/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.urbanladder.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}

	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

	@Test
	public void action() throws Exception
	{
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		List<WebElement> names = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/ul/li/span[@class='topnav_itemname']"));
		int count = names.size();
		System.out.println("Categories count is = "+count);
		System.out.println( );
		int a = 1;
		for(int i=0; i<count; i++)
		{
			String text = names.get(i).getText();
			System.out.println("Category Name = "+text);	
			writeExcel(text, a);
			a++;
			Actions act = new Actions(driver);
			act.moveToElement(names.get(i)).perform();
			List<WebElement> boldNames = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+ text +"')]/following-sibling::div/descendant::div[@class='taxontype']"));
			int count1 = boldNames.size();
			for(int j=0; j<count1; j++)
			{
				Thread.sleep(500);
				String text1 = boldNames.get(j).getText();
				System.out.println("Bold Name = "+text1);
				writeExcel(text1, a);
				a++;
				Thread.sleep(500);
				List<WebElement> subName = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+ text +"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+text1+"']/parent::div/following-sibling::ul/descendant::a"));
				int count2 = subName.size();
					for(int k=0; k<count2; k++)
					{
						Thread.sleep(500);
						String text2 = subName.get(k).getText();
						writeExcel(text2, a);
						a++;
						System.out.println("Submenu Name  = "+text2);
					}
			}
		}
	}
}

