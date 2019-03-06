package firstt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoAssert
{
@Test
public void testa()
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
String aTitle = driver.getTitle();
String eTitle="Google";
SoftAssert s=new SoftAssert();
//Assert.assertEquals(aTitle, eTitle);
s.assertEquals(aTitle, eTitle);
s.assertAll();

}
}
