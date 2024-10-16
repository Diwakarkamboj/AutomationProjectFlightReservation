package flightReservation.stepDefinationFiles;


import org.openqa.selenium.WebDriver;

import flightReservationPages.RegistrationConfirmationPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;

public class RegistrationConfStep {
	
	private WebDriver driver; 
	private RegistrationConfirmationPage page2;
	
	
	@Before
	public void setup() {
		this.page2 = new RegistrationConfirmationPage(driver);
	}
	@Then("I click on Go To Flights Search button")
	public void clkGoToSrchFlightBtn() {
		page2.clkGoToFlightsSrchBtn();
	}

}
