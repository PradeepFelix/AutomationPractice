package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import pageElements.SignupPageElements;
import pageInterfaces.ISignupPage;

public class AutoSignupPage extends SignupPageElements implements ISignupPage {

	WebDriver driver;
	
	public AutoSignupPage(WebDriver driver) 
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@Override
	public void enterEmail(String email) {

		_txtEmail.sendKeys(email);
	}

	@Override
	public void clickCreateButton() {

		_btnCreate.click();
		
	}

}
