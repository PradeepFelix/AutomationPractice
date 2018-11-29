package stepDefinition;

import org.junit.After;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import dataProvider.WebDriverManager;

import pages.AutoHomePage;
import pages.AutoSignupPage;


public class AutoHomeSteps {
	
	WebDriver driver;
	static WebDriverManager  webDriverManager;
	AutoHomePage _autoHomePageObject;
	
	@Before("@tag1")
	public void InitializeDriver() {
		
		webDriverManager = webDriverManager.getInstance();
		driver = webDriverManager.getInstance().getDriver();

		_autoHomePageObject = new AutoHomePage(driver);
				
	}
	
	@Given("^User is on the autopractice home page$")
	public void user_is_on_the_autopractice_home_page() throws Throwable {
		
	    _autoHomePageObject.launchAppPage();
	    
	}

	@Given("^User clicks on the signin link$")
	public void user_clicks_on_the_signin_link() throws Throwable {
	    
		_autoHomePageObject.clickSignin();
	}

	@Then("^it takes the user to the registration page$")
	public void it_takes_the_user_to_the_registration_page() throws Throwable {
	    
		System.out.println("on the registration page");
		
	}

}
