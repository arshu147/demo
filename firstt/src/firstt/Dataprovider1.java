package firstt;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 {
	@DataProvider
	public String[][] normalTestCase() throws EncryptedDocumentException, InvalidFormatException, IOException {
		
		FileInputStream fis=new FileInputStream("./data/Ex1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sheet = wb.getSheet("Sheet1");
		Row firstRow = sheet.getRow(0);
//		System.out.println(firstRow.getLastCellNum());
		int rowCount=sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		int colcount = firstRow.getLastCellNum(); 
//		System.out.println(colcount);
		
		String[][] arr=new String[rowCount-1][colcount];
		for (int i = 1; i < rowCount; i++) {
			for (int j = 0; j < firstRow.getLastCellNum(); j++) {
				Cell cell = sheet.getRow(i).getCell(j);
//				System.out.println(cell);
				arr[i-1][j]=cell.toString();
			}
		}
		return arr;
			
	}
	@Test(dataProvider="normaltestcase")
	public void test(String s,String s2) {
		System.out.println(s);
		System.out.println(s2);
	}

}
