package automation.prectise.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

	WebDriver ldriver;
	
	By txtUserName = By.xpath("//input[@name='username']");
	By txtPassword = By.xpath("//input[@name='password']");
	By btnSubmit = By.xpath("//button[@type='submit']");

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
	}

	public void enterUsername(String username) {
		ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ldriver.findElement(txtUserName).sendKeys(username);
	}

	public void enterPassword(String password) {
		ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void clickSubmitButton() {
		ldriver.findElement(btnSubmit).click();
	}
}
