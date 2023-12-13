package automation.prectise.pageObjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage{

	By txtUserName = By.xpath("//input[@name='username']");
	By txtPassword = By.xpath("//input[@name='password']");
	By btnSubmit = By.xpath("//button[@type='submit']");
	
	public LoginPage(WebDriver rdriver) {
		super(rdriver);
	}
	
	public void enterUsername(String username) {
		WebDriverWait wait=new WebDriverWait(ldriver, Duration.ofSeconds(20));
		ldriver.findElement(txtUserName).sendKeys(username);	
	}

	public void enterPassword(String password) {
		ldriver.findElement(txtPassword).sendKeys(password);
	}

	public void clickSubmitButton() {
		ldriver.findElement(btnSubmit).click();
	}
	

}
