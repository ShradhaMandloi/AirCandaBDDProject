package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	static	WebDriver driver;

	public WebDriver initBrowser(String browserName) {
		
		if(browserName.equals("Chrome")) { 
		
		driver= new ChromeDriver();
		}
		else if(browserName.equals("Edge")){
			
			driver= new EdgeDriver();
		}
		return driver;
	}
	public static WebDriver getDriver() {
		
		return driver;
	}
}
