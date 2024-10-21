package flightReservationPages;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FlightSearchPage {
		
	private WebDriver driver;
	
	public FlightSearchPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public String isPageDisplayed() throws InterruptedException
	{
		String pageNameLocator = getFlightSearchPageLocators().get("flightSearch");
		WebElement pageName = this.driver.findElement(By.xpath(pageNameLocator));
		Thread.sleep(2000);
		String pageNameTitle = pageName.getText();
		System.out.println(pageNameTitle);
		return pageNameTitle;
	}
	
	public void selectTrip() {
		String frstRadioBtnLocator = getFlightSearchPageLocators().get("firstRadioBtn");
		WebElement frstRadioBtn = this.driver.findElement(By.xpath(frstRadioBtnLocator));
		Boolean oneWayRadioBtn = frstRadioBtn.isEnabled();
		
	}
	
	
	
	
	
	public Map<String, String> getFlightSearchPageLocators() {
		Map<String, String> locatorsMap = new HashMap<String, String>();
		locatorsMap.put("flightSearch", "//*[text()='Flight Search']");
		locatorsMap.put("firstRadioBtn", getDynamicLocators("oneway"));
		locatorsMap.put("secondRadioBtn",  getDynamicLocators("twoway"));
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
