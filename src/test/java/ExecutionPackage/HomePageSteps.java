package ExecutionPackage;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import DriverFactory.Driver;
import Pages.HomePage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	
	HomePage homepage= new HomePage(Driver.getDriver());
	
	@Given("User should be at landing page")
	public void user_should_be_at_landing_page() {
	  WebDriver driver=  Driver.getDriver();
	    driver.get("https://www.aircanada.com/ca/en/aco/home.html");
	}

	@Then("Title of the page should contains {string}")
	public void title_of_the_page_should_contains(String TitleWords) {
		String title=homepage.fetchTitleOfPage(); 
		System.out.println(title);
		boolean ispresent= title.contains(TitleWords);
		
		Assert.assertTrue(ispresent);	
		
	}

	@Then("Signin icon should get display")
	public void signin_icon_should_get_display() {
	    boolean isdisplayed=homepage.verifySignInButton();
	    Assert.assertTrue(isdisplayed);
	}

	@When("User enter the name of to city as {string}")
	public void user_enter_the_name_of_to_city_as(String cityName) {
	    homepage.enterCityName(cityName);
	}

	@When("Enter Departure with return date")
	public void enter_departure_with_return_date() {
	   homepage.selectDepartAndReturnDate();
	   
	}

	@When("Click on search flight button")
	public void click_on_search_flight_button() {
	   homepage.clickOnSearchFlightbutton();
	}
	
}
