package flightReservation.utils;

import java.util.Properties;

public class Config {

	private static final String DEFAULT_PROPERTIES = "config/default.properties";
	private static Properties properties = new Properties();
	
	
	static {
		try
		{
			properties.load(Config.class.getClassLoader().getResourceAsStream(DEFAULT_PROPERTIES));	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static String get(String key) {
		 return properties.getProperty(key);
	}
	
}

