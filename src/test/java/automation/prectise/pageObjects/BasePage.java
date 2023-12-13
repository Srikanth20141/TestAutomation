package automation.prectise.pageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	public static WebDriver ldriver;
	
	public BasePage(WebDriver rdriver) {
		ldriver = rdriver;	
	}
	
	public void wait(int second) {
	WebDriverWait wait = new WebDriverWait(ldriver, Duration.ofSeconds(second));
}

}
