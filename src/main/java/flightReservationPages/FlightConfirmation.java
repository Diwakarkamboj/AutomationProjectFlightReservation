package flightReservationPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightConfirmation {
	
	WebDriver driver;
	
	String confirmationText;
	String confirmationNum;
	
	public FlightConfirmation(WebDriver driver) {
		this.driver = driver;
	}
	
	public FlightConfirmation(String confirmationText,String confirmationNum ) {
		this.confirmationText = confirmationText;
        this.confirmationNum = confirmationNum;
	}
	
	public String getFlightsConfirmationTitle() throws InterruptedException {
		String flightConfirmationLocator = getFlightConfirmationLocator().get("flightConfirmationTitle");
		WebElement flightConfirmationElement = this.driver.findElement(By.xpath(flightConfirmationLocator));
		Thread.sleep(2000);
		String flightsConfirmationTitle = flightConfirmationElement.getText();
		return flightsConfirmationTitle;
	}
	
	public String vfyCongratualtionsMsg() throws InterruptedException {
		String confirmationMessageLocator = getFlightConfirmationLocator().get("congratsMsg");
		WebElement confirmationMessageElement = this.driver.findElement(By.xpath(confirmationMessageLocator));
		Thread.sleep(2000);
		String confirmationMessage = confirmationMessageElement.getText();
		return confirmationMessage;
	}
	
	public FlightConfirmation vfyFlightConfirmationText_Number() throws InterruptedException {
		String confirmationTextLocator = getFlightConfirmationLocator().get("flightConfirmationText");
		WebElement confirmationTextElement = this.driver.findElement(By.xpath(confirmationTextLocator));
		
		String confirmationNumberLocator = getFlightConfirmationLocator().get("flightConfirmationNumber");
		WebElement confirmationNumberElement = this.driver.findElement(By.xpath(confirmationNumberLocator));
		Thread.sleep(2000);
		confirmationText = confirmationTextElement.getText();
		confirmationNum = confirmationNumberElement.getText();
		
	    return new FlightConfirmation(confirmationText, confirmationNum);
	}
	
	public String vfyFlightTax() throws InterruptedException {
		String flightTaxLocator = getFlightConfirmationLocator().get("flightTax");
		WebElement flightTaxElement = this.driver.findElement(By.xpath(flightTaxLocator));
		
		String flightTotalTaxLocator = getFlightConfirmationLocator().get("flightTotalTax");
		WebElement flightTotalTaxElement = this.driver.findElement(By.xpath(flightTotalTaxLocator));
		Thread.sleep(2000);
		String flightTax = flightTaxElement.getText();
		String flightTotalTax = flightTotalTaxElement.getText();
		System.out.println("Flight Total Tax is: "+ flightTotalTax);
		return flightTax;
		
	}
	
	
	public String vfyFlightAmount() throws InterruptedException {
		String flightPriceTextLocator = getFlightConfirmationLocator().get("totalPriceText");
		WebElement flightPriceTextElement = this.driver.findElement(By.xpath(flightPriceTextLocator));
		
		String flightTotalPriceLocator = getFlightConfirmationLocator().get("totalFlightsPrice");
		WebElement flightTotalPriceElement = this.driver.findElement(By.xpath(flightTotalPriceLocator));
		Thread.sleep(2000);
		String flightPriceText = flightPriceTextElement.getText();
		String flightTotalPrice = flightTotalPriceElement.getText();
		System.out.println("Flight Total Price is: "+ flightTotalPrice);
		return flightPriceText;
		
	}
	
	public String getConfirmationText() {
        return confirmationText;
    }

    public String getConfirmationNumber() {
        return confirmationNum;
    }
	
	
	public Map<String,String> getFlightConfirmationLocator() {
		
		Map<String, String> flightConfirmationPageLocator = new HashMap<String, String>();
		
		flightConfirmationPageLocator.put("flightConfirmationTitle", "//*[text()='Flights Confirmation']");
		flightConfirmationPageLocator.put("congratsMsg","//*[text()='Congratulations on booking your flight ticket! ']");
		flightConfirmationPageLocator.put("flightConfirmationText", "//*[contains(text(),'Flight Confirmation #')]");
		flightConfirmationPageLocator.put("flightConfirmationNumber", "//*[contains(text(),'Flight Confirmation #')]//following::p[1]");
		flightConfirmationPageLocator.put("flightTax", "//*[contains(text(),'Tax')]");
		flightConfirmationPageLocator.put("flightTotalTax", "//*[contains(text(),'Tax')]//following::p[1]");
		flightConfirmationPageLocator.put("totalPriceText", "//*[contains(text(),'Total Price')]");
		flightConfirmationPageLocator.put("totalFlightsPrice", "//*[contains(text(),'Total Price')]//following::p[1]");

		return flightConfirmationPageLocator;
	}

}
