package testCases;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;

public class TC001_CartTest extends BaseClass {

	@Test
	void verify_cartStatus()
	{
		logger.info("*********TC_001 Execution Started *********");
		try
		{
		HomePage hp=new HomePage(driver); // HomePage Class
		hp.clickCartTab();
		logger.info("******* Clicked on Cart Tab ******");
		logger.info("Validating expected message...");
		String cartmessage=hp.getConfirmationMsg();
		if(cartmessage.equals("Your Amazon Cart is empty!!!"))
				{
			          Assert.assertTrue(true);
				}
		else
		{
			logger.error("Test Failed..");
			logger.debug("Debug Logs..");
			Assert.assertTrue(false);
		}
		Assert.assertEquals(cartmessage, "Your Amazon Cart is empty!!!");	
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("Test case execution completed...");
	}}
