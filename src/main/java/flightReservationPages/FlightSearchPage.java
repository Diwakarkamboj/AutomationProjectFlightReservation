package flightReservationPages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class FlightSearchPage {

	private WebDriver driver;

	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
	}

	public String isPageDisplayed() throws InterruptedException {
		String pageNameLocator = getFlightSearchPageLocators().get("flightSearch");
		WebElement pageName = this.driver.findElement(By.xpath(pageNameLocator));
		Thread.sleep(2000);
		String pageNameTitle = pageName.getText();
		System.out.println(pageNameTitle);
		return pageNameTitle;
	}

	public boolean defaultTripCheck() {
		String roundtripBtnLocator = getFlightSearchPageLocators().get("roundtripRadioBtn");
		WebElement roundtripBtn = this.driver.findElement(By.xpath(roundtripBtnLocator));

		Boolean roundTripRadioBtnisEnabled = roundtripBtn.isEnabled();
		return roundTripRadioBtnisEnabled;

	}

	public void selectTrip(String selectedOption) {
		String onewayRadioBtnLocator = getFlightSearchPageLocators().get("onewayRadioBtn");
		WebElement onewayRadioBtn = this.driver.findElement(By.xpath(onewayRadioBtnLocator));
		String roundtripBtnLocator = getFlightSearchPageLocators().get("roundtripRadioBtn");
		WebElement roundtripBtn = this.driver.findElement(By.xpath(roundtripBtnLocator));

		// Remove any extra double quotes from the input string
		selectedOption = selectedOption.replace("\"", "");

		if (selectedOption.equalsIgnoreCase("One Way")) {
			onewayRadioBtn.click();
		} else if (selectedOption.equalsIgnoreCase("Round Trip")) {
			roundtripBtn.click();
		}

	}

	public void passangersSelection(String passangerSelection) {
		String passangersFieldLocator = getFlightSearchPageLocators().get("passangerField");
		WebElement passangersField = this.driver.findElement(By.xpath(passangersFieldLocator));
		boolean passangerFieldVisible = passangersField.isDisplayed();
		if (passangerFieldVisible == true) {
			String passangersDropDownLocator = getFlightSearchPageLocators().get("passangersDropDown");

			List<WebElement> noOfPassangers = this.driver.findElements(By.xpath(passangersDropDownLocator));
			for (WebElement option : noOfPassangers) {
				if (option.getText().equalsIgnoreCase(passangerSelection)) {
					option.click();
					break;
				}
			}

		} else {
			Assert.fail("Failed as Passanger field is not visible");
		}
	}

	public void departureSelection(String departureName) {
		String departureLocator = getFlightSearchPageLocators().get("departFromField");
		WebElement departureField = this.driver.findElement(By.xpath(departureLocator));
		boolean departureFieldVisible = departureField.isDisplayed();
		if (departureFieldVisible == true) {
			String departureDropDownLocator = getFlightSearchPageLocators().get("departFromDropDwon");
			List<WebElement> departureDropDownValues = this.driver.findElements(By.xpath(departureDropDownLocator));
			for (WebElement option : departureDropDownValues) {
				if (option.getText().equalsIgnoreCase(departureName)) {
					option.click();
					break;
				}
			}
		} else {
			Assert.fail();
		}
	}

	public void arriveInSelection(String arrivalName) {
		String arrivalLocator = getFlightSearchPageLocators().get("arriveInField");
		WebElement arrivalField = this.driver.findElement(By.xpath(arrivalLocator));
		boolean arrivalFieldVisible = arrivalField.isDisplayed();
		if (arrivalFieldVisible == true) {
			String arrivalDropDownLocator = getFlightSearchPageLocators().get("arriveInDropDwon");
			List<WebElement> arrivalDropDownValues = this.driver.findElements(By.xpath(arrivalDropDownLocator));
			for (WebElement option : arrivalDropDownValues) {
				if (option.getText().equalsIgnoreCase(arrivalName)) {
					option.click();
					break;
				}
			}
		} else {
			Assert.fail();
		}
	}
	
	
	public boolean defaultServiceClassCheck() {
		String FirstClassBtnLocator = getFlightSearchPageLocators().get("first");
		WebElement firstClassBtn = this.driver.findElement(By.xpath(FirstClassBtnLocator));

		Boolean firstClassBtnisEnabled = firstClassBtn.isEnabled();
		return firstClassBtnisEnabled;

	}

	public void selectServiceClass(String serviceSelected) {
		String FirstClassBtnLocator = getFlightSearchPageLocators().get("first");
		WebElement firstClassBtn = this.driver.findElement(By.xpath(FirstClassBtnLocator));
		String economyClassBtnLocator = getFlightSearchPageLocators().get("economy");
		WebElement economyClassBtn = this.driver.findElement(By.xpath(economyClassBtnLocator));
		String businessClassBtnLocator = getFlightSearchPageLocators().get("business");
		WebElement businessClassBtn = this.driver.findElement(By.xpath(businessClassBtnLocator));

		// Remove any extra double quotes from the input string
		serviceSelected = serviceSelected.replace("\"", "");

		if (serviceSelected.equalsIgnoreCase("First")) {
			firstClassBtn.click();
		} else if (serviceSelected.equalsIgnoreCase("Economy")) {
			economyClassBtn.click();
		}
		else if (serviceSelected.equalsIgnoreCase("Business")) {
			businessClassBtn.click();
		}

	}

	
	
	
	
	
	
	
	
	

	public Map<String, String> getFlightSearchPageLocators() {
		Map<String, String> locatorsMap = new HashMap<String, String>();
		locatorsMap.put("flightSearch", "//*[text()='Flight Search']");
		locatorsMap.put("onewayRadioBtn", getDynamicLocators("oneway"));
		locatorsMap.put("roundtripRadioBtn", getDynamicLocators("twoway"));
		locatorsMap.put("passangerField", getDynamicLocators("passengers"));
		locatorsMap.put("passangersDropDown", "//*[@id='passengers']//option");
		locatorsMap.put("departFromField", getDynamicLocators("depart-from"));
		locatorsMap.put("departFromDropDwon", "//*[@id='depart-from']//option");
		locatorsMap.put("arriveInField", getDynamicLocators("arrive-in"));
		locatorsMap.put("arriveInDropDwon", "//*[@id='arrive-in']//option");
		locatorsMap.put("economy", getDynamicLocators("service-class1"));
		locatorsMap.put("first", getDynamicLocators("service-class2"));
		locatorsMap.put("business", getDynamicLocators("service-class3"));
		locatorsMap.put("searchFlightsBtn", getDynamicLocators("search-flights"));

		return locatorsMap;
	}

	private String getDynamicLocators(String idValue) {
//		return String.format("%s", idValue); if using only id
		return String.format("//*[@id='%s']", idValue);

	}

}
