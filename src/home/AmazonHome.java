package home;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHome {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\megha\\eclipse-workspace\\"
				+ "SeleniumProject1\\ChromeDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
