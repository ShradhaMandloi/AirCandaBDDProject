package ExecutionPackage;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\AirCanda.feature\\HomePage.feature"},
		glue= {"ExecutionPackage"},
		plugin= {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class AirCandaRunner extends AbstractTestNGCucumberTests {

	
	
}
