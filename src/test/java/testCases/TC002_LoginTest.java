package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.MyAccountPage;

public class TC002_LoginTest extends BaseClass {

    @Test
    public void verify_Login() {

        logger.info("================ TC002 Execution Started ============");

        try {
            // Home Page
            HomePage hp = new HomePage(driver);
            hp.clickSignIn();

            // Login Page
            LoginPage lp = new LoginPage(driver);
            lp.setMobileNumber(p.getProperty("mobileno"));
            lp.clickContinue();
            lp.setPassWord(p.getProperty("password"));
            lp.clickSignIn();

            // My Account Page
            MyAccountPage myaccpage = new MyAccountPage(driver);
            boolean targetpage = myaccpage.isMyAccountPageExists();

            Assert.assertTrue(targetpage, "Login Failed");

        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }

        logger.info("================ TC002 Execution Finished ============");
    }
}
