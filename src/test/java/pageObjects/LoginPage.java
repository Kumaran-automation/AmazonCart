package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
	
	public LoginPage(WebDriver driver) 
	{
		super(driver);
	}
	
//Locators
 @FindBy(xpath="//input[@id='ap_email_login']") WebElement txtMobilenumber;
 @FindBy(xpath="//input[@type='submit']") WebElement btnContinue;
 @FindBy(xpath="//input[@id='ap_password']") WebElement txtPassword;
 @FindBy(xpath="//input[@id='signInSubmit']") WebElement btnSignin;
 
 //Action Methods
 public void setMobileNumber(String mobileno) {
	 txtMobilenumber.sendKeys(mobileno);
	}
 
 public void clickContinue() {
	 btnContinue.click();
 }
 
 public void setPassWord(String password){
	 txtPassword.sendKeys(password);
 }
 
 public void clickSignIn() {
	 btnSignin.click();
 }

}
