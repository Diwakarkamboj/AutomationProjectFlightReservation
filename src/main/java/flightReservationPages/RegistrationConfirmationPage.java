package flightReservationPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import flightReservation.DriverFactory.DriverFactory;

public class RegistrationConfirmationPage {

	private WebDriver driver;
	DriverFactory driverFactory = new DriverFactory();
	
	 public RegistrationConfirmationPage(WebDriver driver) {
	        this.driver = driver;
	    }

	public void clkGoToFlightsSrchBtn() throws InterruptedException {
		String flightsSrchBtnLocator = registerConfirmationPageLocator().get("goToFlightsSearch");
		WebElement flightsSrchBtn = this.driver.findElement(By.xpath(flightsSrchBtnLocator));
		Thread.sleep(2000);
		flightsSrchBtn.click();
	}
	
	public String isPageDisplayed() throws InterruptedException
	{
		String pageNameLocator = registerConfirmationPageLocator().get("registerationConfirmation");
		WebElement pageName = this.driver.findElement(By.xpath(pageNameLocator));
		Thread.sleep(2000);
		String pageNameTitle = pageName.getText();
		System.out.println(pageNameTitle);
		return pageNameTitle;
	}

	private Map<String, String> registerConfirmationPageLocator() {
		Map<String, String> locatorsMap = new HashMap<String, String>();
		locatorsMap.put("goToFlightsSearch", "//*[@href='#']");
		locatorsMap.put("registerationConfirmation", "//*[text()='Registration Confirmation']");

		return locatorsMap;
	}

}
