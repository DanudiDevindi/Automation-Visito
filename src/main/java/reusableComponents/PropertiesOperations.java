package reusableComponents;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class PropertiesOperations {
	
	static Properties prop = new Properties();
	public static String getPropertyValueByKey(String key) throws Exception {
		
		//load data from property file
		//location of file
		String propertyFilePath = System.getProperty("user.dir")+"/src/test/resources/config.properties";
		FileInputStream file = new FileInputStream(propertyFilePath);
		prop.load(file);
		
		//read data
		String value= prop.get(key).toString();
		if(StringUtils.isEmpty(value)) {
			throw new Exception("Value is not specified for key:" +key + "in property file");
		}
		return value;
	}

}
