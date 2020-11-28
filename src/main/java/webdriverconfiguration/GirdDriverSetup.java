package webdriverconfiguration;

import java.net.URL;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import reusableUtility.PropertyManager;


public class GirdDriverSetup implements DriverSetup {

	private WebDriver driver=null;
	DesiredCapabilities caps=new DesiredCapabilities();
	
	
	@SuppressWarnings("unchecked")
	public <T extends MutableCapabilities> T getDriverCapability(Browser browser) {
					
			switch(browser){
			case Chrome:
				ChromeOptions options=new ChromeOptions();
				return (T) options;
			case Firefox:
				caps=DesiredCapabilities.firefox();
				break;
			case Edge:		
				caps=DesiredCapabilities.edge();
				break;
			case InternerExplorer:
				caps=DesiredCapabilities.internetExplorer();
				break;
			case Safari:
				caps=DesiredCapabilities.safari();
				break;
			case Andriod:
				break;
			case IOS:
				break;
			default:
				break;
		
			}

		return null;
	}
	
	@Override
	public WebDriver getDriver(Browser browser)  {
		
		try {
		    driver=new RemoteWebDriver(new URL(PropertyManager.get("HUBURL")),getDriverCapability(browser));
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		
		return driver;
		
	}
  
}
