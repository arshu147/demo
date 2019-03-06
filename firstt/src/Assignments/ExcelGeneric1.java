package Assignments;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGeneric1 
{
	public static void getExcel(int rowNum, String subject) throws Exception
	{
		String path = "./data/sun.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
		Row firstRow = sheet.getRow(0);
		int cellCount = firstRow.getLastCellNum();
		
		for(int j=0; j<cellCount; j++)
			{
			 if(subject.equals(sheet.getRow(0).getCell(j).toString()))
				{
				 	System.out.println(sheet.getRow(rowNum).getCell(j).toString());
				 }
			 else
			 {
				 System.out.println(subject+" is not Present in the Excel"); 
			 }
		 }
     }
	
	public static void main(String[] args) throws Exception 
	{
		getExcel(1, "English");
		getExcel(2, "Maths");
		getExcel(3, "Social");
		
//		Scanner s1 = new Scanner(System.in);
//		System.out.println("Enter rownum");
//		int name = s1.nextInt();
//		System.out.println("Enter Subject");
//		String subject = s1.next();
//		
//		getExcel(name, subject);	
		
	}

}
