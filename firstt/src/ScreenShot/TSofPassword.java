package ScreenShot;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TSofPassword {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		TakesScreenshot ts = (TakesScreenshot)driver;
		File srcfile = ts.getScreenshotAs(OutputType.FILE);
		WebElement ele = driver.findElement(By.xpath("//input[@name='pwd']"));
		Point loc = ele.getLocation();//returns point type
		int xcoordinate = loc.getX();
		int ycoordinate=loc.getY();
		int wimg = ele.getSize().getWidth();
		int himg = ele.getSize().getHeight();
		
		BufferedImage rimg = ImageIO.read(srcfile);//reading the srcfile
		BufferedImage finalimg = rimg.getSubimage(xcoordinate, ycoordinate, wimg, himg);//performing cutting action subimage
		ImageIO.write(finalimg, "png", srcfile);
		File destfile = new File("./Screenshot/actiimgpwd1.png");//for storing in folder 
		Files.copy(srcfile, destfile);
		driver.close();
	}

}
