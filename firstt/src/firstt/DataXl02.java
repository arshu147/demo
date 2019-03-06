package firstt;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataXl02 {

	@DataProvider
	public void readData(String s3) throws Exception
	{
		int col=0;
		String var="";
		FileInputStream s1=new FileInputStream("D:\\xlfile\\data05march.xlsx");
		Workbook wb=WorkbookFactory.create(s1);
		Sheet sheet = wb.getSheet("Sheet1");
		
		int rowcount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowcount);
		int colnum=sheet.getRow(0).getLastCellNum();
		System.out.println(colnum);
		
		  for(int j=0;j<colnum;j++)
			{
				String s4= sheet.getRow(0).getCell(j).getStringCellValue();
				boolean a =s4.equals(s3);
				if(a==true)
				{
				  col=j;
				break;
				}
				
            }
		  for(int i=0;i<rowcount;i++)
		  {

			  var = sheet.getRow(i).getCell(col).toString();
			
			  System.out.println("The marks of student  "+var);
			
		  }
		  
		 }
	
	
@Test(priority=1)
public void passData() throws Exception
{
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the subject name");
	String subname=s.next();
	System.out.println("Enter the Student name ");
	String stusent=s.next();
	readData(subname);

}
}
