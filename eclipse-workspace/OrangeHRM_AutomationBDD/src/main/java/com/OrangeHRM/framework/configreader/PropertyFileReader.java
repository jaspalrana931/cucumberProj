package com.OrangeHRM.framework.configreader;

import java.util.Properties;
import org.apache.log4j.Level;
import com.OrangeHRM.framework.configuration.browser.BrowserType;
import com.OrangeHRM.framework.utility.ResourceHelper;

public class PropertyFileReader implements ConfigReader {
	private Properties prop = null;
	
	public PropertyFileReader() {
		prop = new Properties();
		try {
			prop.load(ResourceHelper.getResourcePathInputStream("/src/main/resouces/configfile/config/.properties"));
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
public String getWebsite() {
	return prop.getProperty("Website");
}

public int getPageLoadTimeOut() {
return Integer.parseInt(prop.getProperty("PageLoadTimeOut"));
}

public int getImplicitWait() {
	return Integer.parseInt(prop.getProperty("ImplicitWait"));
	
}

public String  getDeviceName() {
	return prop.getProperty("deviceName");
}

public String ip() {
	//TODO Auto-generated method stub
	String str = prop.getProperty("gridIp");
	return prop.getProperty("gridIp");
}

public int getVerySmall() {
	return Integer.parseInt(prop.getProperty("VerySmall"));
}

public int getSmall() {
	return Integer.parseInt(prop.getProperty("Small"));
}
public int getMedium() {
	return Integer.parseInt(prop.getProperty("Medium"));
}

public int getLarge() {
	return Integer.parseInt(prop.getProperty("Large"));
}
public int getVeryLarge() {
	return Integer.parseInt(prop.getProperty("VeryLarge"));
}
public String  getWebsiteURL() {
	return prop.getProperty("WebsiteURL");
}
public String getExcelSheet() {
	return prop.getProperty("ProjectTrackerSheet");
}
public String getRelease() {
	return prop.getProperty("Release");
}

}
