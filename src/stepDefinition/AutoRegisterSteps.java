package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import dataProvider.WebDriverManager;
import pages.AutoHomePage;
import pages.AutoRegisterPage;

public class AutoRegisterSteps {

	WebDriver driver;
	static WebDriverManager  webDriverManager;
	AutoRegisterPage _autoRegisterObject;

	@Before("@tag3")
	public void InitializeDriver() {

		webDriverManager = webDriverManager.getInstance();
		driver = webDriverManager.getInstance().getDriver();

		_autoRegisterObject = new AutoRegisterPage(driver);

	}

	@Given("^user is on the detailed registration page$")
	public void user_is_on_the_detailed_registration_page() throws Throwable {
		System.out.println("user on the registration page");
	}

	@Given("^User selects the salutation$")
	public void user_selects_the_salutation() throws Throwable {
		
		_autoRegisterObject.selectSalutation("m");
	}

	@Given("^User enters the first name$")
	public void user_enters_the_first_name() throws Throwable {

		_autoRegisterObject.enterFirstName("MyFirstName");

	}

	@Given("^User enters the last name$")
	public void user_enters_the_last_name() throws Throwable {
		
		_autoRegisterObject.enterLastName("MyLastName");

	}
	
	@Then("^details are filled$")
	public void details_are_filled() throws Throwable {
	    System.out.println("Details filled");
	    
	}
	

}
