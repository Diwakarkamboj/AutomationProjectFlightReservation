package flightReservation.stepDefinationFiles;

import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.FlightSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class FlightSearchStep {
	
	private FlightSearchPage page3 = new FlightSearchPage(DriverFactory.getDriver());
	
	@Then("Check that {string} page is displayed")
	public void checkPage3Name(String expectedPage3Title) throws InterruptedException {
		String page3Title = page3.isPageDisplayed();
		Assert.assertTrue(page3Title.contains(expectedPage3Title));
	}
	
	@And("Check that default trip selected is round trip")
	public void defaultTripCheck() {
		boolean defTripChk = page3.defaultTripCheck();
		Assert.assertTrue(defTripChk);
	}
	
	@Then("Select {} trip type radio button")
	public void selectTripType(String tripType) {
		page3.selectTrip(tripType);
	}

}
