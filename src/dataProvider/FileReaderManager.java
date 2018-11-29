package dataProvider;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager ;
	private static ConfigFileReader configFileReader;
	
	private FileReaderManager() 
	{
	}

	public static FileReaderManager getInstance( ) 
	{
		return (fileReaderManager == null) ? new FileReaderManager() : fileReaderManager;
	}

	public static ConfigFileReader getConfigReader() 
	{
		return (configFileReader == null) ? new ConfigFileReader() : configFileReader;
	}

}
