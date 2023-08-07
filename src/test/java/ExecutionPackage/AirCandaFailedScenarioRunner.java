package ExecutionPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		//features = {"\\src\\test\\resources\\AirCanda.feature\\HomePage.feature"},
		features= {"@target/failedrun.txt"},     //only run failed scenario 
		glue= {"ExecutionPackage"},
		plugin= {"pretty","rerun:target/failedrun.txt"}
		)


public class AirCandaFailedScenarioRunner extends AbstractTestNGCucumberTests {

	
	
}
