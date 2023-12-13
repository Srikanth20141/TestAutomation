package automation.prectise.testcases;

import org.testng.annotations.Test;

import actionDrivers.Action;
import automation.prectise.pageObjects.LoginPage;

public class TC_Login_01 extends Base {

	@Test
	public void login() {

		log.info("=== Start testcase TC_Login_01 ===");

		/* Create the object for the LoginPage */
		LoginPage loginPage = new LoginPage(driver);

		/* Enter username */
		Action.implicitWait(driver, 10);
		loginPage.enterUsername(readConfig.getUsername());

		/* Enter password */
		loginPage.enterPassword(readConfig.getPassword());
		//captureScreen(driver, "tst");

		/* Click submit button */
		loginPage.clickSubmitButton();	

		log.info("=== End testcase TC_Login_01 ===");

	}

}
