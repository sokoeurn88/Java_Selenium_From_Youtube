package locator;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator {

	@Test
	public void locatorsConcept() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");

		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setAcceptInsecureCerts(true);

		ChromeOptions opt = new ChromeOptions();

		opt.merge(cap);

		opt.addArguments("--disable-infobars");

		opt.addArguments("--disable-notifications");

		WebDriver driver = new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("sokoeurn.chhaya@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("#Kem1988#");
		driver.findElement(By.name("login")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebDriverWait wait = new WebDriverWait(driver, 50);
		js.executeScript("scrollBy(0, 20000)");
		
		driver.findElement(By.xpath("//*[@id=\"mount_0_0_Ip\"]/div[1]/div[1]/div/div[2]/div[4]/div[1]/div[2]/span/span/div/div[1]/svg")).click();

	};

}
