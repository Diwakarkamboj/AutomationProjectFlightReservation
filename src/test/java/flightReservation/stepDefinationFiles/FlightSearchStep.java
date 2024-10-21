package flightReservation.stepDefinationFiles;

import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.FlightSearchPage;
import io.cucumber.java.en.Then;

public class FlightSearchStep {
	
	private FlightSearchPage page3 = new FlightSearchPage(DriverFactory.getDriver());
	
	@Then("Check that {string} page is displayed")
	public void checkPage3Name(String expectedPage3Title) throws InterruptedException {
		String page3Title = page3.isPageDisplayed();
		Assert.assertTrue(page3Title.contains(expectedPage3Title));
	}

}
