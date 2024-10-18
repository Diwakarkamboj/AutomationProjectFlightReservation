package flightReservation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Config {

	private Properties properties;

	public Properties init_prop() {
		properties = new Properties();
		try {
			FileInputStream propVal = new FileInputStream("./src/main/resources/config/default.properties");
			properties.load(propVal);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		return properties;
	}

}
