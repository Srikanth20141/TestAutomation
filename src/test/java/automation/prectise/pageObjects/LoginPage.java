package automation.prectise.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
	}

	public void enterUsername(String username) {
		ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ldriver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
	}

	public void enterPassword(String password) {
		ldriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		ldriver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
	}

	public void clickSubmitButton() {
		ldriver.findElement(By.xpath("//button[@type='submit']")).click();
	}
}
