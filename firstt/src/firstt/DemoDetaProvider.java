package firstt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DemoDetaProvider {
	
	@DataProvider
	public  String [][] test1() throws Exception
	{
		FileInputStream fis=new FileInputStream("./data/input.xlsx");
		Workbook wbf = WorkbookFactory.create(fis);
		Sheet sheet = wbf.getSheet("Sheet2");
		Row row = sheet.getRow(0);
	//	System.out.println(row.getLastCellNum());
		int rowcount = sheet.getPhysicalNumberOfRows();
	//	System.out.println(rowcount);
		short colCount = row.getLastCellNum();
	//	System.out.println(colCount);
		String arr[][]=new String[rowcount-1][colCount];
		for (int i = 1; i < rowcount; i++) {
			
			for (int j = 0; j < colCount; j++)
			{
				Cell cell = sheet.getRow(i).getCell(j);
				System.out.println(cell);
				
				arr[i-1][j]=cell.toString();
			}
			
		}
		
		return arr ;
	
	}
	@Test(dataProvider="test1")
	public void test4(String s1,String s2)
	{
		
		System.out.println(s1);
		System.out.println(s2);
	}

}
