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

	public void clkGoToFlightsSrchBtn() throws InterruptedException {
		String flightsSrchBtnLocator = registerConfirmationPageLocator().get("goToFlightsSearch");
		WebElement flightsSrchBtn = this.driver.findElement(By.xpath(flightsSrchBtnLocator));
		Thread.sleep(2000);
		flightsSrchBtn.click();
	}

	private Map<String, String> registerConfirmationPageLocator() {
		Map<String, String> locatorsMap = new HashMap<String, String>();
		locatorsMap.put("goToFlightsSearch", "//*[@href='#']");

		return locatorsMap;
	}

}
