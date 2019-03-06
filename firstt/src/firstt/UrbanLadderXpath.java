package firstt;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class UrbanLadderXpath {
	WebDriver driver;
	static public void writeToExcel(String menus,int i) throws Exception{
		Workbook book = WorkbookFactory.create(new FileInputStream("./testdata/urban2.xlsx"));
		Sheet sheet = book.getSheet("Sheet1");
		sheet.createRow(0).createCell(0).setCellValue("Expected");
		sheet.createRow(i).createCell(0).setCellValue(menus);
		FileOutputStream out = new FileOutputStream("./testdata/urban2.xlsx");
		book.write(out);
		out.close();
	}
	@DataProvider(name="data")
	public String[][] dataBank() throws Exception{
		Workbook excel = WorkbookFactory.create(new FileInputStream("./testdata/urban.xlsx"));
		Sheet sheet = excel.getSheet("Sheet1");
		int row = sheet.getLastRowNum();
		int col = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[row][col];
		for (int i = 1; i < row; i++) {
			for (int j = 0; j < col; j++) {
				data[i][j] = sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
	}
	@BeforeMethod
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "/home/tyss/Desktop/TestDemo/chromedriver");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
	}
	@Test(dataProvider="data")
	public void urbanDemo(String actual, String exp) throws Exception {
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		String mainMenuXpath = "//div[@id='topnav_wrapper']/ul/li";
		List<WebElement> mainMenus = driver.findElements(By.xpath(mainMenuXpath));
		Actions act = new Actions(driver);
		Thread.sleep(2000);
		int c = 1;
		for (int i = 0; i < mainMenus.size(); i++) {
			Thread.sleep(1000);
			//Print Main Heading
			String menuText = mainMenus.get(i).getText();
			writeToExcel(menuText, c);
			c++;
			System.out.println("Category : "+menuText);
			System.out.println("****************");
			act.moveToElement(mainMenus.get(i)).build().perform();
			String head = "//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')and contains(.,'"+menuText+"')]/following-sibling::div/descendant::div[@class='taxontype']/a";
			List<WebElement> boldHeading = driver.findElements(By.xpath(head));
//			for (int j = 0; j < boldHeading.size(); j++) {
//				Thread.sleep(2000);
//				//Print SubHeading
//				String boldText = boldHeading.get(j).getText();
//				System.out.println("Sub Category : "+boldText);
//				System.out.println(".....................");
//				System.out.println("Listed Items Are : ");
//				List<WebElement> subMenus = driver.findElements(By.xpath("//div[@id='topnav_wrapper']/descendant::span[contains(@class,'topnav_itemname')and contains(.,'"+menuText+"')]/following-sibling::div/descendant::div[@class='taxontype']/a[.='"+boldText+"']/parent::div/following-sibling::ul[@class='taxonslist']/li/a/span"));
//				for (int k = 0; k < subMenus.size(); k++) {
//					//Print Items
//					System.out.println(subMenus.get(k).getText());
//				}
//				System.out.println();
//			}
//			System.out.println("-------------------------------");
		}
		Assert.assertEquals(actual, exp, "Failed");
	}
	@AfterMethod
	public void closeBrowser(){
		driver.close();
	}
}
