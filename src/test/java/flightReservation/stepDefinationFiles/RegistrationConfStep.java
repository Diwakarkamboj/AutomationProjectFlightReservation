package flightReservation.stepDefinationFiles;


import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.RegistrationConfirmationPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class RegistrationConfStep {
	
	private RegistrationConfirmationPage page2 = new RegistrationConfirmationPage(DriverFactory.getDriver());
	
	@Then("Check that page name is {string}")
	public void checkPageName(String expectedPageName) throws InterruptedException {
		String pageName = page2.isPageDisplayed();
		Assert.assertTrue(pageName.contains(expectedPageName));
	}
	
	@And("I click on Go To Flights Search button")
	public void clkGoToSrchFlightBtn() throws InterruptedException {
		page2.clkGoToFlightsSrchBtn();
	}

}
