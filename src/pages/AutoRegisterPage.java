package pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import pageElements.AutoRegistrationElements;
import pageInterfaces.IAutoRegistrationPage;

public class AutoRegisterPage extends AutoRegistrationElements implements IAutoRegistrationPage {

	WebDriver driver;
	
	public AutoRegisterPage(WebDriver driver) 
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Override
	public void selectSalutation(String gender) {
		
		try {
			Thread.sleep(3500); //allowing a delay for the DOM to get ready
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		if(gender.toLowerCase() == "m") {
			
			_spanMaleRadio.click();
		}
		else {
			
			_spanFemaleRadio.click();
		}
		
	}

	@Override
	public void enterFirstName(String firstName) {
		
		_txtFirstName.sendKeys(firstName);
		
		
	}

	@Override
	public void enterLastName(String lastName) {

		_txtLastName.sendKeys(lastName);
		
	}

}
