package ScreenShot;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TSforPerticularelementUsingRobot { //Taking ScreenShot using Robot Class
	
	public static void main(String[] args) throws AWTException, IOException  {
		
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement e;
		
		
//		TS using robot class
		Robot r=new Robot();
		Rectangle r1=new Rectangle(1000,700);
		BufferedImage image=r.createScreenCapture(r1);
		ImageIO.write(image, "JPG", new File("./Screenshot/RobotGoogle.jpg"));
		driver.close();

	}


}
