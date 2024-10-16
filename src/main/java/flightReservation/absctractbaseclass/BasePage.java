package flightReservation.absctractbaseclass;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import flightReservation.utils.Config;

public abstract class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    
    @BeforeTest
    public void invokeBrowser() {
        String flightReservationUrl = Config.get("flightReservation.url");
		this.driver.get(flightReservationUrl);
		this.driver.manage().window().maximize();
	}
}
