package firstt;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class ExcelDemo {

	public  static void getCellValue(String name, String sub) throws EncryptedDocumentException, FileNotFoundException, IOException
	{
		Sheet sheet = WorkbookFactory.create(new FileInputStream("./demo.xlsx")).getSheet("Marks");
		Row firstRow = sheet.getRow(0);
		int colNo = -1;
		int rowNo = -1;
		for (int i = 0; i < firstRow.getLastCellNum(); i++) {
			if(sub.equalsIgnoreCase(firstRow.getCell(i).getStringCellValue())) {
				colNo = i;
				for (int j = 0; j < sheet.getLastRowNum(); j++) {
					if(name.equalsIgnoreCase(sheet.getRow(j).getCell(0).getStringCellValue()))
					{
						rowNo = j;
						System.out.println("The mark is : "+sheet.getRow(rowNo).getCell(colNo).toString());
						break;
					}
				}
			}
		}
	}

	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of student : ");
		String name = s.next();
		System.out.println("Enter the subject name to find marks : ");
		String sub = s.next();
		getCellValue(name,sub);
	}
}
