package flightReservation.stepDefinationFiles;


import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.RegistrationConfirmationPage;
import io.cucumber.java.en.Then;

public class RegistrationConfStep {
	
	private RegistrationConfirmationPage page2 = new RegistrationConfirmationPage(DriverFactory.getDriver());
	
	
	
	@Then("I click on Go To Flights Search button")
	public void clkGoToSrchFlightBtn() throws InterruptedException {
		page2.clkGoToFlightsSrchBtn();
	}

}
