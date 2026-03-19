package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage { // All the page object classes from this Basepage

	WebDriver driver; // driver variable
	
	public BasePage(WebDriver driver) //Constructor
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
