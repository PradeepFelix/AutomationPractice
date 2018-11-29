package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import dataProvider.FileReaderManager;
import pageElements.AutoHomePageElements;
import pageInterfaces.IAutoHomePage;
import pageInterfaces.IPageLaunch;

public class AutoHomePage extends AutoHomePageElements implements IAutoHomePage, IPageLaunch {

	WebDriver driver;
	WebElement element;
	
	public AutoHomePage(WebDriver driver) 
	{	
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@Override
	public void launchAppPage()
	{
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl("appURL"));
	}

	@Override
	public void clickSignin() {

		_signInLink.click();
	}

}
