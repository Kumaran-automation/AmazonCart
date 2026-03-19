package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) 
	{
		super(driver);
	}
// Locators
	@FindBy(xpath="//span[@class='nav-line-2'][normalize-space()='Cart']") WebElement lnkCart;
	@FindBy(xpath="//h3[normalize-space()='Your Amazon Cart is empty']") WebElement msgCart;
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") WebElement lnkSignin;
	
// Action Methods
	public void clickCartTab() {
		lnkCart.click();
	}
	public String getConfirmationMsg() 
	{
		try
		{
			return (msgCart.getText());}
		catch (Exception e)
		{
			return (e.getMessage());}
		
	}
	public void clickSignIn() {
		lnkSignin.click();
	
	}
	
}
