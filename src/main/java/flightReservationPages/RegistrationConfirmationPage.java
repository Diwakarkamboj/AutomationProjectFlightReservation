package flightReservationPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class RegistrationConfirmationPage {

	private WebDriver driver;
	
	 public RegistrationConfirmationPage(WebDriver driver) {
	        this.driver = driver;
	    }

	public void clkGoToFlightsSrchBtn() {
		String flightsSrchBtnLocator = registerConfirmationPageLocator().get("goToFlightsSearch");
		WebElement flightsSrchBtn = this.driver.findElement(By.xpath(flightsSrchBtnLocator));
		flightsSrchBtn.click();
	}

	public Map<String, String> registerConfirmationPageLocator() {
		Map<String, String> locatorsMap = new HashMap<String, String>();
		locatorsMap.put("goToFlightsSearch", "//a[@id='go-to-flights-search']");

		return locatorsMap;
	}

}
