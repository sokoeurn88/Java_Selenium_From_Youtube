package javaseleniumfromyoutube;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allinterviewquestions {
	WebDriver driver;
	
	@Test
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.getCurrentUrl();
		driver.getTitle();
	};
	
	public void signInEmail() {
		
		String mainWindow = driver.getWindowHandle();
		mainWindow.toString();
		
	};
}
