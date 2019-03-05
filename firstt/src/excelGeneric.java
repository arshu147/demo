import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class excelGeneric {
	@Test
	
	

	public static void getExcel(String studenetName, String subject) throws Exception
	{
		String path = "E:\\Book1.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row firstRow = sheet.getRow(0);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int cellCount = firstRow.getLastCellNum();
		 for(int i=0; i<rowCount; i++)
		 {
			 if(studenetName.equals(sheet.getRow(i).getCell(0).toString()))
			 {				 
				 for(int j=0; j<cellCount; j++)
				 	{
						 if(subject.equals(sheet.getRow(0).getCell(j).toString()))
						 {
						 	System.out.println(sheet.getRow(i).getCell(j).toString());
						 }
				 }
			 }
		 }
     }
	
	public static void main(String[] args) throws Exception 
	{

		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = s1.next();
		System.out.println("Enter Subject");
		String subject = s1.next();
		
		getExcel(name, subject);
		
}}
