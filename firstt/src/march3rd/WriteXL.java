package march3rd;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EmptyFileException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class WriteXL {
	static String path="./data/Write2.xlsx";
	static String Sheet="Sheet1";
	static int row=0;
	static int cell=0;
	
	static {
		System.setProperty("WebDriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		driver.findElement(By.xpath("//a[contains(@class,'close-reveal-modal ')]")).click();
		
		Actions action=new Actions(driver);
		Thread.sleep(500);
		
		List<WebElement> firstList = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')]")); 
		
		 for(int i=0;i<firstList.size();i++) {
			Thread.sleep(500);	
			String text1 = firstList.get(i).getText();
			
			if (text1.trim().length()!=0) {
				System.out.println(text1);
				setExcelData(path,Sheet,row++,cell,text1.trim());
				System.out.println("----------------------------");
			}
			
			Thread.sleep(500);
			action.moveToElement(firstList.get(i)).perform();		
				
			
			List<WebElement> allSub = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a"));
			 
					
			for (int j = 0; j < allSub.size(); j++)
			{
			Thread.sleep(500);	
        	String text2 = allSub.get(j).getText();
        	if (text2.trim().length()!=0) {
				setExcelData(path,Sheet,row++,cell,text2.trim());
				System.out.println(text2);
				System.out.println("----------------------------");
			}
        	
        	List<WebElement> allSub2 = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname') and contains(.,'"+text1+"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+text2+"']/parent::div/following-sibling::ul/descendant::a"));
        	    for(int k=0;k<allSub2.size();k++)    {
        	    Thread.sleep(500);	
        		String text3 = allSub2.get(k).getText();
        		if (text3.trim().length()!=0) {
        			setExcelData(path,Sheet,row++,cell,text2.trim());
    				System.out.println(text3);
    				System.out.println("----------------------------");
				}
          	}
         }		
	  }
	}
	
	public static void setExcelData(String path,String Sheet,int row,int cell,String value) throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException 
	{
		
	Workbook w;
	try {
		w=WorkbookFactory.create(new FileInputStream(path));
		w.getSheet(Sheet).createRow(row).createCell(cell).setCellValue("     ");
		w.write(new FileOutputStream(path));
	}
	catch(EmptyFileException e) {
		e.printStackTrace();
	}
	
	
	}
	
  }

	