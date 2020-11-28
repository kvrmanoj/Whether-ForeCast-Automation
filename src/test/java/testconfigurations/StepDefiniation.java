package testconfigurations;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.Given;
import webdriverconfiguration.Browser;
import webdriverconfiguration.WebDriverFactory;

public class StepDefiniation {

	WebDriver driver;
	WebDriverFactory webdriverfactory;
	
	@Given("Open the  Browser {string} with URL {string}")
	public void open_the_browser_with_url(String browser, String url) {
		webdriverfactory=new WebDriverFactory();
		driver=webdriverfactory.getDriver(Browser.valueOf(browser));
		driver.get(url);
	}

}
