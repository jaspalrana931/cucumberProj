package com.OrangeHRM.framework.helper.Logger;
 
import java.util.logging.Logger;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import com.OrangeHRM.framework.utility.ResourceHelper;
 
@SuppressWarnings("rawtypes")
public class LoggerHelper {
	private static boolean root = false;
	public static Logger getLogger(Class clas) {
	if(root) {
		return Logger.getLogger(clas);
	}
	propertyConfiguration.configure(ResourceHelper.getBaseResourcePath("/src/main/resources/configfile/log4j.properties"));
		root = true;
		return Logger.getLogger(clas);
	}

}
