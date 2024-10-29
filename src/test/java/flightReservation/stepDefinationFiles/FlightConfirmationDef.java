package flightReservation.stepDefinationFiles;

import org.testng.Assert;

import flightReservation.DriverFactory.DriverFactory;
import flightReservationPages.FlightConfirmation;
import io.cucumber.java.en.Then;

public class FlightConfirmationDef {

	FlightConfirmation page5 = new FlightConfirmation(DriverFactory.getDriver());

	@Then("Verify that page5 title is {string}")
	public void getflightConfirmationTitle(String actualPage5Title) throws InterruptedException {
		String page5Title = page5.getFlightsConfirmationTitle();
		Assert.assertTrue(page5Title.contains(actualPage5Title));
	}

	@Then("Verify that congratualtions message {string} is correct")
	public void verifyCongratulationMsg(String expectedCongratsMsg) throws InterruptedException {
		String congratsMsg = page5.vfyCongratualtionsMsg();
		Assert.assertTrue(congratsMsg.contains(expectedCongratsMsg));
	}

	@Then("Verify that flight confirmation text is {string}")
	public void verifyFlightConfirmationText_Num(String expectedConfText) throws InterruptedException {
		FlightConfirmation confirmation = page5.vfyFlightConfirmationText_Number();

		String confirmationText = confirmation.getConfirmationText();
		String confirmationNumber = confirmation.getConfirmationNumber();

		Assert.assertTrue(confirmationText.contains(expectedConfText));
		System.out.println("Flight confirmation number is: " + confirmationNumber);
	}

	@Then("Verify that flight total tax is {string}")
	public void verifyFlightTax(String expectedTax) throws InterruptedException {
		String tax = page5.vfyFlightTax();
		Assert.assertTrue(tax.contains(expectedTax));
	}

	@Then("Verify that flight total amount text is {string}")
	public void verifyFlightTotalPrice(String expectedPriceText) throws InterruptedException {
		String flightAmountText = page5.vfyFlightAmount();
		Assert.assertTrue(flightAmountText.contains(expectedPriceText));
	}

}
