package MyRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun=false,
		features= {"src/test/java/HotelApp_Features"},
		glue= {"HotelApp_StepDefinitions"},
		format= {"pretty","html:test-output", "junit:junit-xml/cucumber.xml"},
		monochrome=true,
		strict=true
		)


public class TestRunner {

}
