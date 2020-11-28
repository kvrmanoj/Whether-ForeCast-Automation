package webdriverconfiguration;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;

public interface DriverSetup {
	
	<T extends MutableCapabilities> T getDriverCapability(Browser browser);
	 WebDriver getDriver(Browser browser);		 
}
