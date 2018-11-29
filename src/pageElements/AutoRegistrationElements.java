package pageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AutoRegistrationElements {

	//@FindBy(how = How.ID, using ="id_gender1")
	//protected WebElement _radioSalutation;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"uniform-id_gender1\"]/span")
	protected WebElement _spanMaleRadio;
	
	@FindBy(how = How.XPATH, using ="//*[@id=\"uniform-id_gender2\"]/span")
	protected WebElement _spanFemaleRadio;
	
	@FindBy(how = How.ID, using = "customer_firstname")
	protected WebElement _txtFirstName;
	
	@FindBy(how = How.ID, using = "customer_lastname")
	protected WebElement _txtLastName;
	
	//ToDo remainder of elements from the page
}
