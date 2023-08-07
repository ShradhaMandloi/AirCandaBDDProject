package ExecutionPackage;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


import io.cucumber.java.Scenario;

import DriverFactory.Driver;
import Utility.ConfigReader;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AirCandaHooks {
	WebDriver driver;
	@Before
	public void launchBrowser() throws IOException {
		
		 Driver d= new Driver();
		 driver=d.initBrowser(ConfigReader.readProperty("browser"));
		 driver.manage().window().maximize();
		
	}
	@After(order=2)
	public void CaptureScreenshot(Scenario scenario) {
		if(scenario.isFailed())
		{
			String Scenarioname=scenario.getName();
			String scenarionupdatedName =Scenarioname.replaceAll(" ","_");

			TakesScreenshot Ts=(TakesScreenshot)driver;        //down casting
			
			byte[] source=Ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source,"image/png", scenarionupdatedName);
			
	}
	
}
	@After(order=1)
	public void tearDown() {
		
		driver.quit();
		
	}
	
	
}
