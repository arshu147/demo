package Assignments;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelGeneric 
{
	public static void getExcel(String studenetName, String subject) throws Exception
	{
		String path = "./data/sun.xlsx";
		FileInputStream fis = new FileInputStream(path);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet2");
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
//		getExcel("Mohan", "English");
//		getExcel("Swathi", "Maths");
//		getExcel("Raghu", "Social");
		
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = s1.next();
		System.out.println("Enter Subject");
		String subject = s1.next();
		
		getExcel(name, subject);
		
		
		
	}

}
