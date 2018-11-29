package dataProvider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import customEnums.DriverType;

public class ConfigFileReader {

	private Properties properties;
	private final String propertyFilePath= "configs//Configuration.properties";
	

	public ConfigFileReader(){

		BufferedReader reader;
		
		try {

			reader = new BufferedReader(new FileReader(propertyFilePath));
			
			properties = new Properties();

			try 
			{
				properties.load(reader);
				reader.close();
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
			throw new RuntimeException("Propert files are not found");
		} 
	}

	public DriverType getBrowser() {
		String browserName1 = properties.getProperty("browser");
		if(browserName1 == null || browserName1.equals("chrome")) return DriverType.CHROME;
		else if(browserName1.equalsIgnoreCase("firefox")) return DriverType.FIREFOX;
		else if(browserName1.equals("iexplorer")) return DriverType.INTERNETEXPLORER;
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browserName1);
	}


	public String getDriverPath(){
		String driverPath = System.getProperty("user.dir") + properties.getProperty("driverPath");
		
		if(driverPath!= null) return driverPath;
		else throw new RuntimeException("driverPath not specified in the Configuration.properties file."); 
	}

	public String getApplicationUrl(String application) {

		String url = properties.getProperty("appURL");
		if(url != null) return url;
		else throw new RuntimeException("url not specified in the Configuration.properties file.");
	}
	
	public Boolean getBrowserWindowSize() {
		String windowSize = properties.getProperty("windowMaximize");
		if(windowSize != null) return Boolean.valueOf(windowSize);
		return true;
	}
}
