package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy(xpath="//*[@id='acUserMenu-aco']") WebElement signIn;	
	
	@FindBy(xpath="//*[@id='bkmgFlights_destination_trip_1']") WebElement cityField;	
	
	@FindBy(xpath="//*[@id='bkmgFlights_destination_trip_1SearchResult0']") WebElement searchResult;
	
	@FindBy(xpath="//*[@id='bkmgFlights_travelDates_1-formfield-1']") WebElement departure;
	
	@FindBy(xpath="//*[@class='abc-calendar-wrapper']") WebElement calendar;
	
	@FindBy(xpath="(//*[normalize-space(text())='31'])[1]") WebElement depDate;
	
	@FindBy(xpath="(//*[normalize-space(text())='15'])[2]") WebElement returnDate;
	
	@FindBy(xpath="//*[@id='bkmgFlights_travelDates_1_confirmDates']") WebElement confirmDate;
	
	@FindBy(xpath="//*[@id='bkmgFlights_findButtonContent']") WebElement searchFlight;
	
	
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		wait=new WebDriverWait(driver,Duration.ofSeconds(80));
	}
	public String fetchTitleOfPage() {
		wait.until(ExpectedConditions.visibilityOf(signIn));
		String Title=driver.getTitle();
		
		return Title;
		
	}
	public boolean verifySignInButton() {
			wait.until(ExpectedConditions.visibilityOf(signIn));
			boolean IsDisplay=signIn.isDisplayed();
			return IsDisplay;
		
	}
	public void enterCityName(String cityName) {
		wait.until(ExpectedConditions.visibilityOf(cityField));
		cityField.sendKeys(cityName);
		
		Actions a= new Actions(driver);
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(searchResult));
		a.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
	}
	public void selectDepartAndReturnDate() {
		departure.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(calendar));
		
		depDate.click();
		
		returnDate.click();
	
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		confirmDate.click();
		
		
	}
	public void clickOnSearchFlightbutton() {
		
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", searchFlight);
		 
		//searchFlight.click();
		
	}
	

}
