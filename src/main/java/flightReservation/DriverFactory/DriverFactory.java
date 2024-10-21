package flightReservation.DriverFactory;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverFactory {
	
	public WebDriver driver;
	public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<>();
	
	public WebDriver init_driver(String browser)
	{
		System.out.println("Browser value is: "+ browser);
		
		if(browser.equals("chrome")) {
			tlDriver.set(new ChromeDriver());
		}
		else if(browser.equals("firefox")) {
			tlDriver.set(new FirefoxDriver());
		}
		else {
			System.out.println("Incorrect browser value entered: "+ browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		
		return getDriver();
	}
	
	public void enterURL(String url) {
		DriverFactory.getDriver().get(url);
	}
	
	
	public static synchronized WebDriver getDriver()
	{
		return tlDriver.get();
	}
	
	@SuppressWarnings("deprecation")
	public void setTime() {	
		 //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(2000, TimeUnit.MICROSECONDS);
	}

}
