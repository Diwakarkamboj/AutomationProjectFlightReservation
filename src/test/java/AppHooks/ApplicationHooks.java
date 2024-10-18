package AppHooks;


import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import flightReservation.DriverFactory.DriverFactory;
import flightReservation.utils.Config;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class ApplicationHooks {
	
	private DriverFactory driverFactory;
	private WebDriver driver;
	private Config configReader;
	Properties prop;
	
	@Before(order = 0)
	public void getProperty() {
		configReader = new Config();
		prop = configReader.init_prop();
	}
	
	
	@Before(order = 1)
	public void invokeBrowser() {
		String browserName = prop.getProperty("browser");
		String URL = prop.getProperty("flightReservation.url");
		driverFactory = new DriverFactory();
		driver = driverFactory.init_driver(browserName);
		driverFactory.enterURL(URL);
		driverFactory.setTime();
	}
	
//	@After(order = 0)
//	public void quitBrowser() {
//		driver.quit();
//	}
	
	@After(order = 1)
	public void tearDown(Scenario scenario)
	{
		if(scenario.isFailed())
		{
			//takeScreenshot
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			byte[] sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(sourcePath, "image/png", screenshotName); 
			
		}
		
	}
	
	
	
	

}
