package flightReservation.stepDefinationFiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import flightReservationPages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStep {
	private WebDriver driver; 
	private HomePage page1;
		
	@Before
	public void setup() {
		this.driver = new ChromeDriver();
		this.page1 = new HomePage(driver);	
	}
	
	@When("I Open Customer Registration page")
	public void openCRPage() {
		page1.invokeBrowser();
	}
	
	@Then("Verify that page title is same as expected")
	public void vfyHomePageTitle() {
		page1.vfyPageTitle();
		page1.setTime();
	}
	
	@Then("Verify that form title is same as expected")
	public void vfyPageFormTitle() {
		page1.vfyPageFormTitle();
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
	
	
	@Then("I close the browser")
	public void closeBr() {
		page1.closeBrowser();
	}
	

}
