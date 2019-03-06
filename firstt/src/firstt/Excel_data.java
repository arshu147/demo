package firstt;

import java.io.FileInputStream;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class Excel_data {


	public static void  readData(String sname, String subname) throws Exception
	{

		FileInputStream fis = new FileInputStream("./inputdata/data.xlsx");
		Workbook wb = WorkbookFactory.create(fis);

		Sheet s = wb.getSheet("Sheet1");
		Row fname = s.getRow(0);

		for(int i = 0; i<s.getPhysicalNumberOfRows();i++)
		{
			if(sname.equals(s.getRow(i).getCell(0).toString()))
			{

				for(int j = 0; j<fname.getLastCellNum();j++)
				{
					if(subname.equals(s.getRow(0).getCell(j).toString()))
					{
						System.out.println(" marks  : "+s.getRow(i).getCell(j).toString());
					}
				}
			}

		}	 


	}
	public static void main(String[] args) throws Exception
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the student name : ");
		String sname = sc.nextLine();
		
		System.out.println("Enter the sub name : ");
		String subname = sc.nextLine();
		readData(sname,subname);
	}


}
