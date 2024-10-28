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
	
	@Then("Select {string} trip type radio button")
	public void selectTripType(String tripType) {
		page3.selectTrip(tripType);
	}
	
	@And("Select {string} passenger to book a flight")
	public void selectPassenger(String passangerSelection){
		page3.passangersSelection(passangerSelection);
	}
	
	@Then("Select departure as {string} city")
	public void selectDepartureValue(String departureName){
		page3.departureSelection(departureName);
	}
	
	@And("Select arrival as {string} city")
	public void selectArriveInValue(String arrivalName){
		page3.arriveInSelection(arrivalName);
	}
	
	@Then("Check default service class selected is First class")
	public void defaultServiceClassCheck(){
		boolean defClassChk = page3.defaultServiceClassCheck();
		Assert.assertTrue(defClassChk);
	}
	
	@And("Select {string} as service class for this flight")
	public void selectServiceClass(String serviceSelected){
		page3.selectServiceClass(serviceSelected);
	}
	
	@Then("Click on search flights button")
	public void clkSearchFlightsBtn() {
		page3.clkSrchFlightsBtn();
	}

}
