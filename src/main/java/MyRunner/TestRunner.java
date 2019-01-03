package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"src/test/java/HotelBooking.feature"},
		glue= {"HotelApp_StepDefinitions"},
		format= {"pretty","html:test-output"},
		monochrome=true
		)


public class TestRunner {

}
