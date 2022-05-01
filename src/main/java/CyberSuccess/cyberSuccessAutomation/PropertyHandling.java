package CyberSuccess.cyberSuccessAutomation;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyHandling {
	
	Properties property;
	
	public PropertyHandling() throws Exception{
		property=new Properties();
		String filePath="C:\\Users\\Admin\\eclipse-workspace\\cyberSuccessAutomation\\config.properties";
		FileInputStream input=new FileInputStream(filePath);
		property.load(input);
		}
	public String getValue(String key) {
		return property.getProperty(key);
	}
	
}
