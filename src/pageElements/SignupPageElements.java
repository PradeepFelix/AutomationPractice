package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignupPageElements {

	@FindBy(how = How.ID, using="email_create")
	protected WebElement _txtEmail;
	
	@FindBy(how = How.ID, using="SubmitCreate")
	protected WebElement _btnCreate;
	
}

