package webdriverconfiguration;

import org.openqa.selenium.WebDriver;

import reusableUtility.PropertyManager;

public class WebDriverFactory {

	private static WebDriver driver;
	private  final String DRIVERTYPE="DriverType";
		
	public WebDriver getDriver(Browser browser) {

		DriverSetup driverInstance;
		String driverType=PropertyManager.get(DRIVERTYPE);
		switch(driverType){		
		case "Local":
			driverInstance=new LocalDriverSetup();
			driver=driverInstance.getDriver(browser);
		    break;
		 case "Grid":
			 driverInstance=new GirdDriverSetup();
			 driver=driverInstance.getDriver(browser);
			 break;	 
		}
		return driver;	
	 }
	
}