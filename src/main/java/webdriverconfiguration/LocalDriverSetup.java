package webdriverconfiguration;

import java.util.InputMismatchException;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.safari.SafariDriver;

public class LocalDriverSetup implements DriverSetup{
	
	private WebDriver driver=null;
	DesiredCapabilities caps=new DesiredCapabilities();
	@SuppressWarnings("unchecked")
	@Override
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
	public WebDriver getDriver(Browser browser) {
	switch(browser){
		case Chrome:
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"//chromedriver");			
			driver=new ChromeDriver(getDriverCapability(browser));
			break;
		case Firefox:
			FirefoxOptions p=new FirefoxOptions();
			p.merge(caps);
			driver=new FirefoxDriver(p);
		case Edge:	
			 driver=new EdgeDriver(caps);
			break;
		case InternerExplorer:
			driver=new InternetExplorerDriver();
			break;
		case Safari:
			driver=new SafariDriver();
			break;
		case IOS:
		    throw new InputMismatchException("IOS is not supoorted in local test execution ");
		case Andriod:
			throw new InputMismatchException("Andriod is not supoorted in local test execution ");
		}
		return driver;
	}

}
