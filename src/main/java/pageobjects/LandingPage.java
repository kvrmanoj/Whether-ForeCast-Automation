package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage extends BasePage{

	By popUpDismiss=By.linkText("No Thanks");
	public LandingPage(WebDriver driver) {
		super(driver);
		if(getElement(popUpDismiss).isDisplayed())
		getElement(popUpDismiss).click();
	}
	
   
	
}
