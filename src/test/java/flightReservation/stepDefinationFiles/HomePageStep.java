package flightReservation.stepDefinationFiles;


import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.HomePage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {

	private HomePage page1 = new HomePage(DriverFactory.getDriver());
		
	
	@When("I Open Customer Registration page")
	public void openCRPage() {
		
	}
	
	@Then("Verify that page title is {string}")
	public void vfyHomePageTitle(String expectedTitleName) {
		String title = page1.vfyPageTitle();
		System.out.println(title);
		Assert.assertTrue(title.contains(expectedTitleName));
	}
	
	@Then("Verify that form title {string}")
	public void vfyPageFormTitle(String expectedFormTitle) {
		String formTitle = page1.vfyPageFormTitle();
		System.out.println(formTitle);
		Assert.assertTrue(formTitle.contains(expectedFormTitle));
	}
	
	@Then("Enter {string} in first name")
	public void setfirstName(String firstName) {
		page1.setFirstNameField(firstName);
		
	}
	
	@Then("Enter {string} in last name")
	public void setLastName(String lastName) {
		page1.setLastNameField(lastName);
	}
	
	@Then("Enter {string} in email field")
	public void setEmailField(String email) {
		page1.setEmailField(email);	}
	
	@Then("Enter {string} in password field")
	public void setPwdField(String pwd) {
		page1.setPwdField(pwd);
	}
	
	@Then("Enter {string} in street name")
	public void setStreetName(String street) {
		page1.setStreetField(street);
	}
	
	@Then("Enter {string} in city name")
	public void setCityName(String city) {
		page1.setCityField(city);
	}
	
	@Then("Check total displayed states in drop-downs are {string}")
	public void chkStateDrpDwnVal(String count) {
		page1.vfyNumberOfStateDropDowns(count);
	}
	
	@Then("Enter {string} in state name")
	public void setStateName(String state) {
		page1.setStateField(state);
	}
	
	@Then("Enter {string} ZIP code")
	public void setZIPCode(String ZIP) {
		page1.setZip(ZIP);
	}
	
	@Then("Click on register button")
	public void clkRegBtn() {
		page1.registerBtn();
	}
	

}
