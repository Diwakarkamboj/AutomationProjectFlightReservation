package flightReservation.stepDefinationFiles;

import flightReservationPages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {
	
	HomePage page1 = new HomePage();
	
	@When("I Open Customer Registration page")
	public void openCRPage() {
		page1.invokeBrowser();
	}
	
	@Then("Verify that page title is same as expected")
	public void vfyHomePageTitle() {
		page1.vfyPageTitle();
		page1.setTime();
	}
	
	@Then("I close the browser")
	public void closeBr() {
		page1.closeBrowser();
	}
	

}
