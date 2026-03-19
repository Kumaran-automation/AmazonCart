package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

	public MyAccountPage(WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="//span[@class='nav-line-2 ']") WebElement clickMyaccount;
	@FindBy(xpath="//h1[normalize-space()='Your Account']") WebElement accountExistmsg;
	
	public boolean isMyAccountPageExists() {
	{
		try
		{
		return (accountExistmsg.isDisplayed());
	    }
	
		catch(Exception e)
		{
			return false;
		}
	}
}

	
}
