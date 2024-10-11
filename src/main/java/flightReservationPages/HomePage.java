package flightReservationPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;


public class HomePage {
	
	public static void locators() {
		String pageTitle = "//*[text()='Customer Registration']";
	}
	
	WebDriver driver;
	
	public HomePage() {
		this.driver = new ChromeDriver();
	}
	
	
	public void vfyPageFormTitle() {
		WebElement formName =  this.driver.findElement(By.xpath("//*[text()='Customer Registration']"));
		String expectedFormTitle = formName.getText();
		String actualFormTitle = "Customer Registration";
//		Assert.isTrue(true, actualFormTitle, expectedFormTitle);
		//Assert.assertEquals();
		
	}
	
	public void vfyPageTitle(){
		String expectedPageTitle = this.driver.getTitle();
		String actualPageTitle = "Book Your Flights";
		System.out.println("Page title is "+ expectedPageTitle);
		Assert.isTrue(true, actualPageTitle, expectedPageTitle);
		//Assert.assertEquals();
		
	}
	
	public void invokeBrowser() {
		this.driver.get("https://d1uh9e7cu07ukd.cloudfront.net/selenium-docker/reservation-app/index.html");
		this.driver.manage().window().maximize();
	}
	
	@SuppressWarnings("deprecation")
	public void setTime() {
		this.driver.manage().timeouts().implicitlyWait(1000,TimeUnit.MICROSECONDS);
	}
	
	public void closeBrowser() {
		this.driver.close();
	}
	

}
