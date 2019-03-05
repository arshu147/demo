package Demo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ReadDataXL 
{
 static
 {
	 System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
 }
 FileInputStream fis;
 int rowcount;
	 @DataProvider
		public  void test2(String s3) throws Exception
		{
		 
		 int col=0;
	 fis=new FileInputStream("./data/input.xlsx");
	 Workbook wbf = WorkbookFactory.create(fis);
	 Sheet sheet = wbf.getSheet("Sheet2");
	 int rowcount = sheet.getPhysicalNumberOfRows();
	//int rowcount2 = sheet.getLastRowNum();
	System.out.println(rowcount);
	 short columcount = sheet.getRow(0).getLastCellNum();
	 System.out.println(columcount);
	 String arr[][]=new String[rowcount-1][columcount];
	 
	
	 
	 
	 
		 for (int j = 0; j <columcount; j++) 
		 {
			 String s4 = sheet.getRow(0).getCell(j).getStringCellValue();
			 boolean a = s4.equals(s3);
					if (a==true)
					{
					col=j;
					break;
					}
				
				
		}
		 String var=sheet.getRow(1).getCell(col).toString();
		 String var2=sheet.getRow(2).getCell(col).toString();
		 
	}
	 

@Test(priority=1)
public void run() throws Exception
{
String s1="Maths";
test2(s1);
}
}
