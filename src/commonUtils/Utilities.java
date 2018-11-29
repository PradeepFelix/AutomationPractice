package commonUtils;

import org.openqa.selenium.WebElement;

import dataProvider.ConfigFileReader;

public class Utilities extends ConfigFileReader 
{
	public void typeTextInsideTextBox(String text, WebElement el) 
	{
		el.clear();
		el.sendKeys(text);
		
	}
	
}
		


