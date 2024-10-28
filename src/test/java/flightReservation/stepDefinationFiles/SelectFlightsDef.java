package flightReservation.stepDefinationFiles;

import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.SelectFlights;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class SelectFlightsDef {
	
	SelectFlights page4 = new SelectFlights(DriverFactory.getDriver());
	
	@Then("Verify that search flights title is {string}")
	public void verifyPage4Title(String expectedPage4Title) throws InterruptedException {
		String page4Title = page4.getselectFlightsTitle();
		Assert.assertEquals(page4Title,expectedPage4Title);
	}
	
	@Then("Verify that departure flight table shows correct row names")
	public void verifyFlightDepartureElements() {
		page4.verifyDepFlights();
	}
	
	@Then("Verify that arrival flight table shows correct row names")
	public void verifyFlightArrivalElements() {
		page4.verifyArrFlights();
	}
	
	@Then("Select {string} class for {string} flight for departure")
	public void selectDepFlight(String flightName, String className) {
		page4.selectDepFlights(flightName, className);
	}
	
	@Then("Select {string} class for {string} flight for arrival")
	public void selectArrFlight(String flightName, String className) {
		page4.selectArrFlights(flightName, className);
	}
	
	@And("Click on confirm flights button")
	public void clkConfirmFlights() {
		page4.clkConfirmFlightBtn();
	}

}
