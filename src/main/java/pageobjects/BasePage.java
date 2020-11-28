package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Page{
	
   public BasePage(WebDriver driver) {
		super(driver);	
	}
	
	@Override
	public WebElement getElement(By locator) {
		waitFortTheElementPresent(locator);
		return driver.findElement(locator);
	}

	@Override
	public String getTitle() {
		return driver.getTitle();
	}

	@Override
	public void waitFortTheElementPresent(By locator) {
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(locator)));
			
	}

	
	

}
