package flightReservationPages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class SelectFlights {

	private WebDriver driver;

	public SelectFlights(WebDriver driver) {
		this.driver = driver;
	}

	public String getselectFlightsTitle() throws InterruptedException {
		String selectFlightsLocator = getSelectFlightsPageLocator().get("Selectflights");
		WebElement selectFlightsElement = this.driver.findElement(By.xpath(selectFlightsLocator));
		Thread.sleep(2000);
		String selectFlightsTitle = selectFlightsElement.getText();
		return selectFlightsTitle;
	}

	public void verifyDepFlights() {
		String departureTableLocator = getSelectFlightsPageLocator().get("departureBox");
		WebElement departureTableElement = this.driver.findElement(By.xpath(departureTableLocator));
		String tableName = departureTableElement.getText();
		List<String> expectedRowNames = Arrays.asList("#", "Economy", "First    ", "Business", "Emirates", "Qatar",
				"British Airways");
		String tableDepLocator = getSelectFlightsPageLocator().get("tableDep");
		int rowCount = this.driver.findElements(By.xpath(tableDepLocator)).size();

		List<String> rowName = new ArrayList<String>();

		if (tableName.equalsIgnoreCase("Departure")) {

			for (int i = 1; i <= rowCount; i++) {
				String actValue = this.driver
						.findElement(By.xpath("((//table[contains(@class,'table table-sm')])[1]//th)[" + i + "]"))
						.getText();
				rowName.add(actValue);
			}

		}
		Assert.assertEquals(expectedRowNames, rowName);

	}
	
	public void verifyArrFlights() {
		String arrivalTableLocator = getSelectFlightsPageLocator().get("arrivalBox");
		WebElement arrivalTableElement = this.driver.findElement(By.xpath(arrivalTableLocator));
		String arrTableName = arrivalTableElement.getText();
		List<String> expectedArrRowNames = Arrays.asList("#", "Economy", "First    ", "Business", "Emirates", "Qatar",
				"British Airways");
		String tableArrLocator = getSelectFlightsPageLocator().get("tableArr");
		int rowCount = this.driver.findElements(By.xpath(tableArrLocator)).size();

		List<String> rowName = new ArrayList<String>();

		if (arrTableName.equalsIgnoreCase("Arrival")) {

			for (int i = 1; i <= rowCount; i++) {
				String actValue = this.driver
						.findElement(By.xpath("((//table[contains(@class,'table table-sm')])[2]//th)[" + i + "]"))
						.getText();
				rowName.add(actValue);
			}

		}
		Assert.assertEquals(expectedArrRowNames, rowName);

	}
	
	
//	public void selectDepFlights(String depClassName, String depFlightName) {
//		
//		String depEmiratesEconomyLocator = getSelectFlightsPageLocator().get("depEmiratesEconomy");
//		WebElement depEmiratesEconomyElement = this.driver.findElement(By.xpath(depEmiratesEconomyLocator));
//		
//		String depEmiratesFirstLocator = getSelectFlightsPageLocator().get("depEmiratesFirst");
//		WebElement depEmiratesFirstElement = this.driver.findElement(By.xpath(depEmiratesFirstLocator));
//		
//		String depEmiratesBusinessLocator = getSelectFlightsPageLocator().get("depEmiratesBusiness");
//		WebElement depEmiratesBusinessElement = this.driver.findElement(By.xpath(depEmiratesBusinessLocator));
//		
//
//		String depQatarEconomyLocator = getSelectFlightsPageLocator().get("depQatarEconomy");
//		WebElement depQatarEconomyElement = this.driver.findElement(By.xpath(depQatarEconomyLocator));
//		
//		String depQatarFirstLocator = getSelectFlightsPageLocator().get("depQatarFirst");
//		WebElement depQatarFirstElement = this.driver.findElement(By.xpath(depQatarFirstLocator));
//		
//		String depQatarBusinessLocator = getSelectFlightsPageLocator().get("depQatarBusiness");
//		WebElement depQatarBusinessElement = this.driver.findElement(By.xpath(depQatarBusinessLocator));
//		
//		String depBritishAirEconomyLocator = getSelectFlightsPageLocator().get("depBritishAirEconomy");
//		WebElement depBritishAirEconomyElement = this.driver.findElement(By.xpath(depBritishAirEconomyLocator));
//		
//		String depBritishAirFirstLocator = getSelectFlightsPageLocator().get("depBritishAirFirst");
//		WebElement depBritishAirFirstElement = this.driver.findElement(By.xpath(depBritishAirFirstLocator));
//		
//		String depBritishAirBusinessLocator = getSelectFlightsPageLocator().get("depBritishAirBusiness");
//		WebElement depBritishAirBusinessElement = this.driver.findElement(By.xpath(depBritishAirBusinessLocator));
//		
//				if(depFlightName.equalsIgnoreCase("Emirates") && depClassName.equalsIgnoreCase("Economy"))
//				{
//					new Actions(this.driver).moveToElement(depEmiratesEconomyElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("Emirates") && depClassName.equalsIgnoreCase("First"))
//				{
//					new Actions(this.driver).moveToElement(depEmiratesFirstElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("Emirates") && depClassName.equalsIgnoreCase("Business"))
//				{
//					new Actions(this.driver).moveToElement(depEmiratesBusinessElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("Qatar") && depClassName.equalsIgnoreCase("Economy"))
//				{
//					new Actions(this.driver).moveToElement(depQatarEconomyElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("Qatar") && depClassName.equalsIgnoreCase("First"))
//				{
//					new Actions(this.driver).moveToElement(depQatarFirstElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("Qatar") && depClassName.equalsIgnoreCase("Business"))
//				{
//					new Actions(this.driver).moveToElement(depQatarBusinessElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("British Airways") && depClassName.equalsIgnoreCase("Economy"))
//				{
//					new Actions(this.driver).moveToElement(depBritishAirEconomyElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("British Airways") && depClassName.equalsIgnoreCase("First"))
//				{
//					new Actions(this.driver).moveToElement(depBritishAirFirstElement).click().build().perform();
//				}
//				else if(depFlightName.equalsIgnoreCase("British Airways") && depClassName.equalsIgnoreCase("Business"))
//				{
//					new Actions(this.driver).moveToElement(depBritishAirBusinessElement).click().build().perform();
//				}
//				
//		
//	}
	
	
	public void selectDepFlights(String depClassName, String depFlightName) {
	    // Map to store locators for each airline and class
	    Map<String, Map<String, String>> flightLocators = new HashMap<>();
	    
	    // Initialize locators for Emirates
	    Map<String, String> emiratesLocators = new HashMap<>();
	    emiratesLocators.put("Economy", getSelectFlightsPageLocator().get("depEmiratesEconomy"));
	    emiratesLocators.put("First", getSelectFlightsPageLocator().get("depEmiratesFirst"));
	    emiratesLocators.put("Business", getSelectFlightsPageLocator().get("depEmiratesBusiness"));
	    flightLocators.put("Emirates", emiratesLocators);

	    // Initialize locators for Qatar
	    Map<String, String> qatarLocators = new HashMap<>();
	    qatarLocators.put("Economy", getSelectFlightsPageLocator().get("depQatarEconomy"));
	    qatarLocators.put("First", getSelectFlightsPageLocator().get("depQatarFirst"));
	    qatarLocators.put("Business", getSelectFlightsPageLocator().get("depQatarBusiness"));
	    flightLocators.put("Qatar", qatarLocators);

	    // Initialize locators for British Airways
	    Map<String, String> britishAirLocators = new HashMap<>();
	    britishAirLocators.put("Economy", getSelectFlightsPageLocator().get("depBritishAirEconomy"));
	    britishAirLocators.put("First", getSelectFlightsPageLocator().get("depBritishAirFirst"));
	    britishAirLocators.put("Business", getSelectFlightsPageLocator().get("depBritishAirBusiness"));
	    flightLocators.put("British Airways", britishAirLocators);

	    // Retrieve the locator dynamically
	    String locator = flightLocators
	            .getOrDefault(depFlightName, Collections.emptyMap())
	            .get(depClassName);

	    // If a locator is found, proceed to locate and click the element
	    if (locator != null) {
	        WebElement flightElement = this.driver.findElement(By.xpath(locator));
	        new Actions(this.driver).moveToElement(flightElement).click().build().perform();
	        System.out.println("Selected flight: " + depFlightName + ", Class: " + depClassName);
	    } else {
	        System.out.println("No flight found for " + depFlightName + " with class " + depClassName);
	    }
	}
	
	
	public void selectArrFlights(String arrClassName, String arrFlightName) {
	    // Map to store locators for each airline and class
	    Map<String, Map<String, String>> flightLocators = new HashMap<>();
	    
	    // Initialize locators for Emirates
	    Map<String, String> emiratesLocators = new HashMap<>();
	    emiratesLocators.put("Economy", getSelectFlightsPageLocator().get("arrEmiratesEconomy"));
	    emiratesLocators.put("First", getSelectFlightsPageLocator().get("arrEmiratesFirst"));
	    emiratesLocators.put("Business", getSelectFlightsPageLocator().get("arrEmiratesBusiness"));
	    flightLocators.put("Emirates", emiratesLocators);

	    // Initialize locators for Qatar
	    Map<String, String> qatarLocators = new HashMap<>();
	    qatarLocators.put("Economy", getSelectFlightsPageLocator().get("arrQatarEconomy"));
	    qatarLocators.put("First", getSelectFlightsPageLocator().get("arrQatarFirst"));
	    qatarLocators.put("Business", getSelectFlightsPageLocator().get("arrQatarBusiness"));
	    flightLocators.put("Qatar", qatarLocators);

	    // Initialize locators for British Airways
	    Map<String, String> britishAirLocators = new HashMap<>();
	    britishAirLocators.put("Economy", getSelectFlightsPageLocator().get("arrBritishAirEconomy"));
	    britishAirLocators.put("First", getSelectFlightsPageLocator().get("arrBritishAirFirst"));
	    britishAirLocators.put("Business", getSelectFlightsPageLocator().get("arrBritishAirBusiness"));
	    flightLocators.put("British Airways", britishAirLocators);

	    // Retrieve the locator dynamically
	    String locator = flightLocators
	            .getOrDefault(arrFlightName, Collections.emptyMap())
	            .get(arrClassName);

	    // If a locator is found, proceed to locate and click the element
	    if (locator != null) {
	        WebElement flightElement = this.driver.findElement(By.xpath(locator));
	        new Actions(this.driver).moveToElement(flightElement).click().build().perform();
	        System.out.println("Selected flight: " + arrFlightName + ", Class: " + arrClassName);
	    } else {
	        System.out.println("No flight found for " + arrFlightName + " with class " + arrClassName);
	    }
	}
	
	public void clkConfirmFlightBtn() {
		String confirmFlightBtnLocator = getSelectFlightsPageLocator().get("confirmFlightsBtn");
		WebElement confirmFlightBtnElement = this.driver.findElement(By.xpath(confirmFlightBtnLocator));
		
        new Actions(this.driver).moveToElement(confirmFlightBtnElement).click().build().perform();
		
		
	}


	public Map<String, String> getSelectFlightsPageLocator() {
		Map<String, String> selectFlightsPageLocators = new HashMap<String, String>();
		selectFlightsPageLocators.put("Selectflights", "//*[text()='Select Flights']");
		selectFlightsPageLocators.put("departureBox", "//*[contains(text(),'Departure')]");
		selectFlightsPageLocators.put("tableDep", "(//table[contains(@class,'table table-sm')])[1]//th");
		selectFlightsPageLocators.put("arrivalBox", "//*[contains(text(),'Arrival')]");
		selectFlightsPageLocators.put("tableArr", "(//table[contains(@class,'table table-sm')])[2]//th");
		selectFlightsPageLocators.put("depEmiratesEconomy", getDynamicLocators("dep-emirates-economy"));
		selectFlightsPageLocators.put("depEmiratesFirst", getDynamicLocators("dep-emirates-first"));
		selectFlightsPageLocators.put("depEmiratesBusiness", getDynamicLocators("dep-emirates-business"));
		selectFlightsPageLocators.put("depQatarEconomy", getDynamicLocators("dep-qatar-economy"));
		selectFlightsPageLocators.put("depQatarFirst", getDynamicLocators("dep-qatar-first"));
		selectFlightsPageLocators.put("depQatarBusiness", getDynamicLocators("dep-qatar-business"));
		selectFlightsPageLocators.put("depBritishAirEconomy", getDynamicLocators("dep-ba-economy"));
		selectFlightsPageLocators.put("depBritishAirFirst", getDynamicLocators("dep-ba-first"));
		selectFlightsPageLocators.put("depBritishAirBusiness", getDynamicLocators("dep-ba-business"));

		selectFlightsPageLocators.put("arrEmiratesEconomy", getDynamicLocators("arr-emirates-economy"));
		selectFlightsPageLocators.put("arrEmiratesFirst", getDynamicLocators("arr-emirates-first"));
		selectFlightsPageLocators.put("arrEmiratesBusiness", getDynamicLocators("arr-emirates-business"));
		selectFlightsPageLocators.put("arrQatarEconomy", getDynamicLocators("arr-qatar-economy"));
		selectFlightsPageLocators.put("arrQatarFirst", getDynamicLocators("arr-qatar-first"));
		selectFlightsPageLocators.put("arrQatarBusiness", getDynamicLocators("arr-qatar-business"));
		selectFlightsPageLocators.put("arrBritishAirEconomy", getDynamicLocators("arr-ba-economy"));
		selectFlightsPageLocators.put("arrBritishAirFirst", getDynamicLocators("arr-ba-first"));
		selectFlightsPageLocators.put("arrBritishAirBusiness", getDynamicLocators("arr-ba-business"));
		selectFlightsPageLocators.put("confirmFlightsBtn", getDynamicLocators("confirm-flights"));

		return selectFlightsPageLocators;
	}
	
	private String getDynamicLocators(String idValue) {
//		return String.format("%s", idValue); if using only id
		return String.format("//*[@id='%s']", idValue);

	}

}
