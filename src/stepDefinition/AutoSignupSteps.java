package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.WebDriverManager;
import pages.AutoHomePage;
import pages.AutoSignupPage;

public class AutoSignupSteps {
	
	WebDriver driver;
	static WebDriverManager  webDriverManager;
	AutoSignupPage _autoSignupObject;
	
	@Before("@tag2")
	public void InitializeDriver() {
		
		webDriverManager = webDriverManager.getInstance();
		driver = webDriverManager.getInstance().getDriver();

		_autoSignupObject = new AutoSignupPage(driver);
				
	}

	@Given("^User is on the registration page$")
	public void user_is_on_the_registration_page() throws Throwable {
	    
		System.out.println("in the registration page");
		
	}

	@Given("^User enters the email address$")
	public void user_enters_the_email_address() throws Throwable {
	    
		_autoSignupObject.enterEmail("sampleuser12@abc.com");
	}

	@Given("^user clicks on the create button$")
	public void user_clicks_on_the_create_button() throws Throwable {
	   
		_autoSignupObject.clickCreateButton();
	}

	@Then("^it takes the user to the detailed registration page$")
	public void it_takes_the_user_to_the_detailed_registration_page() throws Throwable {
		
		System.out.println("on the detailed registration page");
	   
	}
}
