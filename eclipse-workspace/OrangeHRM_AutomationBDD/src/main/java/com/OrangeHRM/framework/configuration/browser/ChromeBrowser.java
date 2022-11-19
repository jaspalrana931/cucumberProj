package com.OrangeHRM.framework.configuration.browser;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import  com.OrangeHRM.framework.utility.ResourceHelper;
public class ChromeBrowser {
	public Capabilities getChromeCapabilities() {
		ChromeOptions option = new ChromeOptions();
			option.addArguments("start-maximized");
			DesiredCapabilities chrome = DesiredCapabilities.chrome();
			chrome.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			chrome.setJavascriptEnabled(true);
			chrome.setCapability(ChromeOptions.CAPABILITY,option);
			return chrome;
		}
	
	public WebDriver getChromeDriver(Capabilities cap)throws Exception {
		if(System.getProperty("os.name").contains("Mac")){
			System.setProperty("webdriver.chrome.driver",ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
			return new ChromeDriver(cap);
		}
		else if(System.getProperty("os.name").contains("Windows")){
				System.setProperty("webdriver.chrome.driver",ResourceHelper.getResourcePath("/src/main/resources/drivers/chromedriver.exe"));
				return new ChromeDriver(cap);
			}
		return null;

	}
}
