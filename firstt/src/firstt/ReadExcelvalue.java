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
	  Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	  Sheet sheet = wb.getSheet("Sheet1");
	  Row row = sheet.getRow(0);
	  int column =-1;
	  int Rowval=-1;
	  int RowCOunt = sheet.getLastRowNum();
	  int ColumnCount = row.getLastCellNum();
	 
	  for(int i =0;i<ColumnCount;i++)
	  {
	   if (row.getCell(i).getStringCellValue().equalsIgnoreCase(columnName))
	   {
		   column = i;  break;
	   }
	  }
	 
	  for(int i =0;i<=RowCOunt;i++)
	  {
		  Row row1 = sheet.getRow(i);
		  if (row1.getCell(0).getStringCellValue().equalsIgnoreCase(RowName))
		  {
			  Rowval = i; break;
		  }
	  }
	
	  
	readExcel(path,Rowval,column);
	   
	}
	  
	public static void readExcel(String path,int rowno,int cellno) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Workbook wb = WorkbookFactory.create(new FileInputStream(path));
	    String s = wb.getSheet("Sheet1").getRow(rowno).getCell(cellno).toString();
		System.out.println(s);
		
	}

}
