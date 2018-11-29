package dataProvider;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import customEnums.DriverType;

public class WebDriverManager {

	private static WebDriver driver;
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	private static DriverType driverType;

	private static WebDriverManager SINGLE_INSTANCE = null;
	
    private WebDriverManager() {}
    
    public static WebDriverManager getInstance() {
        if (SINGLE_INSTANCE == null) {  
          synchronized(WebDriverManager.class) {
        	  SINGLE_INSTANCE = new WebDriverManager();
        	  System.out.println("Driver Initialized...");
          }
        }
        return SINGLE_INSTANCE;
    }
	
	public WebDriver getDriver() 
	{
		if(driver == null) driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		
		driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
		
		switch (driverType) 
		{
			case CHROME : 
				System.setProperty(CHROME_DRIVER_PROPERTY, FileReaderManager.getInstance().getConfigReader().getDriverPath());
				driver = new ChromeDriver();
			break;
		default:
			break;

		}

		if(FileReaderManager.getInstance().getConfigReader().getBrowserWindowSize()) 
			driver.manage().window().maximize();

		return driver;
	} 


	public void closeDriver() {
		driver.close();
		driver.quit();
	}

}




