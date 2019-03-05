package firstt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadExcelvalue {
	
	public static void main(String[] args) throws EncryptedDocumentException, FileNotFoundException, IOException
	{String path = "./Input/input.xlsx";
	 
	  String columnName = "Hindi";
	  String RowName = "Student2";
	  FileInputStream fis = new FileInputStream(path);
	 /* XSSFWorkbook wb = new XSSFWorkbook(fis);
	  XSSFSheet sheet = wb.getSheet("Sheet1");
	  XSSFRow row = sheet.getRow(0);*/
	  Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	  Sheet sheet = wb.getSheet("Sheet1");
	  Row row = sheet.getRow(0);
	  int column =0;
	  int RowCOunt = sheet.getLastRowNum();
	  Workbook wb1 = WorkbookFactory.create(new FileInputStream(path));
	   Row r = wb1.getSheet("Sheet1").getRow(0);
	   
	  int ColumnCount = row.getLastCellNum();
	 
	  for(int i =0;i<ColumnCount;i++)
	  {
	  boolean flag = row.getCell(i).getStringCellValue().equalsIgnoreCase(columnName);
	  
	  if(flag)
	  {
		  column = i;
		  break;
	  }
	  
	  }  
	  
	 // System.out.println("COlumn"+column);
	 
	  int Rowval=0;
	  for(int i =0;i<=RowCOunt;i++)
	  {
		 // XSSFRow row1 = sheet.getRow(i);
		  Row row1 = sheet.getRow(i);
		  boolean flag1 = row1.getCell(0).getStringCellValue().equalsIgnoreCase(RowName);
		  if(flag1)
		  {
			  Rowval = i;
		  }
	  }
	
	  
	readExcel(path,Rowval,column);
	   
	}
	public static void readExcel(String path,int rowno,int cellno) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		//String path = "./Input/input.xls";
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	    String s = wb.getSheet("Sheet1").getRow(rowno).getCell(cellno).toString();
		System.out.println(s);
		
	}

}
