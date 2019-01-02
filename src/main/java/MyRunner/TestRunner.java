package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Bharath\\workspace\\HotelApp_CucumberProject\\src\\main\\java\\HotelApp_Features\\LoginExamples.feature",
		glue= {"HotelApp_StepDefinitions"},
		format= {"pretty","html:test-output"}
		//dryRun=true
		)


public class TestRunner {

}
