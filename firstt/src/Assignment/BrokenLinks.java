package Assignment;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com");
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("No of Links are : "+allLinks.size());
		for (int i = 0; i < allLinks.size(); i++) {
			String link = allLinks.get(i).getAttribute("href");
			brokenLinks(link);
		}
		Thread.sleep(3000);
		driver.close();
	}
	static void brokenLinks(String link) throws Exception {
		URL url = new URL(link);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setConnectTimeout(2000);
		connection.connect();
		if(connection.getResponseCode()==200) {
			System.out.println(link+"---"+connection.getResponseCode()+connection.getResponseMessage());
		}
		if(connection.getResponseCode()>=400) {
			System.err.println(link+"---"+connection.getResponseCode()+connection.getResponseMessage());
		}
	}
}