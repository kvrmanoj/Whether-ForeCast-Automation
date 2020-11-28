package reusableUtility;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Properties;

public class PropertyManager {
	private static final String PROPERTY_PATH="Config.properties";
	
	Properties property= new Properties();
	static {
	    loadConfigToSystemProp(PROPERTY_PATH);
	}
	
	
	private static void loadConfigToSystemProp(String propPath) {
		try {
			setSystemEnvironmentVariables(propPath);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	private static void setSystemEnvironmentVariables(String propPath) throws IOException {
		Properties properties=new Properties();
		properties.load(FileUtil.getInputStream(propPath));
		for(Object property:properties.keySet()) {
			if(!System.getProperties().containsKey(property)) {
				System.out.println(properties.get(property).toString());
				System.setProperty(property.toString(),properties.get(property).toString());
			}
		}
	}

	public static String get(String key) {
		if(key!=null) 
		return System.getProperty(key);
		else
		 throw new InputMismatchException("Given property key value is empty");
	}

	
	
	
    
}
