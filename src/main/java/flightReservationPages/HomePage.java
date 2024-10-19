package flightReservationPages;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class HomePage{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	
	public String vfyPageFormTitle() {
		String pageTitleLocator = locators().get("pageTitle");
		WebElement formName = this.driver.findElement(By.xpath(pageTitleLocator));
		String expectedFormTitle = formName.getText();
		
		return expectedFormTitle;

	}

	public String vfyPageTitle() {
		return this.driver.getTitle();
	}
	
	public void setFirstNameField(String firstName) {
		String firstNameLocator = locators().get("firstName");
        WebElement firstNameField = this.driver.findElement(By.xpath(firstNameLocator));
        firstNameField.sendKeys(firstName);	
	}
	
	public void setLastNameField(String lastName) {
		String lastNameLocator = locators().get("lastName");
        WebElement lastNameField = this.driver.findElement(By.xpath(lastNameLocator));
        lastNameField.sendKeys(lastName);	
	}
	
	public void setEmailField(String email) {
		String emailLocator = locators().get("email");
        WebElement emailField = this.driver.findElement(By.xpath(emailLocator));
        emailField.sendKeys(email);	
	}
	
	public void setPwdField(String pwd) {
		String pwdLocator = locators().get("pwd");
        WebElement pwdField = this.driver.findElement(By.xpath(pwdLocator));
        pwdField.sendKeys(pwd);	
	}
	
	public void setStreetField(String street) {
		String streetLocator = locators().get("street");
        WebElement streetField = this.driver.findElement(By.xpath(streetLocator));
        streetField.sendKeys(street);	
	}
	
	public void setCityField(String city) {
		String cityLocator = locators().get("city");
        WebElement cityField = this.driver.findElement(By.xpath(cityLocator));
        cityField.sendKeys(city);	
	}
	
	public void setStateField(String state) {
//		String stateLocator = locators().get("state");
		String stateOptionsLocator = locators().get("stateOptions");
		
//		WebElement stateFieldDrpDownBtn = this.driver.findElement(By.xpath(stateLocator));
//		stateFieldDrpDownBtn.click();
		List<WebElement> stateFieldDrpDown = this.driver.findElements(By.xpath(stateOptionsLocator));
		for (WebElement option : stateFieldDrpDown) {
			if(option.getText().equals(state))
			{
				option.click();
				break;
			}
		}
		
//        Select select = new Select(stateField);
//		select.selectByVisibleText(state);
	}
	
	public void vfyNumberOfStateDropDowns(String count) {
		String stateLocator = locators().get("state");
		String stateOptionsLocator = locators().get("stateOptions");
		
		WebElement stateFieldDrpDownBtn = this.driver.findElement(By.xpath(stateLocator));
		stateFieldDrpDownBtn.click();
		List<WebElement> stateFieldDrpDown = this.driver.findElements(By.xpath(stateOptionsLocator));
		
		int totalStateDropDowns = stateFieldDrpDown.size();
		
		String ans = (String.valueOf(totalStateDropDowns).equals(count)) ? "Yes the drop-down values are equal": "No";
		System.out.println(ans);
	}
	
	public void setZip(String ZIP) {
		String zipLocator = locators().get("zip");
		WebElement zipField = this.driver.findElement(By.xpath(zipLocator));
		zipField.sendKeys(ZIP);
	}
	
	public void registerBtn() {
		String registerBtnLocator = locators().get("register");
		WebElement regBtn = this.driver.findElement(By.xpath(registerBtnLocator));
		new Actions(this.driver).moveToElement(regBtn).click().build().perform();
		
	}

	private Map<String, String> locators() {

		Map<String, String> locatorsMap = new HashMap<String, String>();
		
		locatorsMap.put("pageTitle", "//*[text()='Customer Registration']");
		locatorsMap.put("firstName", getDynamicLocators("First Name"));
		locatorsMap.put("lastName", getDynamicLocators("Last Name"));
		locatorsMap.put("email", getDynamicLocators("Email"));
		locatorsMap.put("pwd", getDynamicLocators("Password")); 
		locatorsMap.put("street", "//input[@name='street']"); 
		locatorsMap.put("city", getDynamicLocators("City")); 
		locatorsMap.put("state", "//select[@id='inputState']");
		locatorsMap.put("stateOptions", "//select[@id='inputState']//option");
		locatorsMap.put("zip","//input[@name='zip']" );
		locatorsMap.put("register", "//button[@id='register-btn']");

		return locatorsMap;
	}
	
	private String getDynamicLocators(String idValue) {
//		return String.format("%s", idValue); if using only id
		return String.format("//div[@class=\"col-md-6\"]//label[text()='%s']//following::input[1]", idValue); 
		
	}

}
