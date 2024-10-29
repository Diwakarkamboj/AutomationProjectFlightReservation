package testrunners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src/test/resources/flightReservation/FeatureFiles"},
    glue = {"flightReservation/stepDefinationFiles", "AppHooks"},
    tags = "@Regformtile1",
    plugin = {
        "pretty"
    }
)
public class MyTestRunner {

	
	
	
}
