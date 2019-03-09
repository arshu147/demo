package Assignments;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProviderforurbanladder
{
	@DataProvider
	public static String[][] data() throws Exception
	{
		Workbook excel = WorkbookFactory.create(new FileInputStream("./data/urbanladder.xlsx"));
		Sheet sheet = excel.getSheet("Sheet2");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		System.out.println("rows"+row);
		System.out.println("cols"+col);
		String[][] data = new String[row][col];
		for (int i = 1; i <= row; i++)
		{
			for (int j = 0; j < col; j++) 
			{
				data[i-1][j] = sheet.getRow(i).getCell(j).toString();
			}
		}
		return data;
	}
	
	@Test(dataProvider="data")
	public void test(String exp, String act) 
	{
		System.out.println(exp+"----"+act);
		Assert.assertEquals(act, exp);
	}

}
