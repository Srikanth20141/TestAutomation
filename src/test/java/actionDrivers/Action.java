package actionDrivers;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import automation.prectise.testcases.Base;

public class Action extends Base{
	
	public Action() {
		
	}
	
	public static void click(WebDriver ldriver, WebElement locatorName) {
		
	}
	
	public static void implicitWait(WebDriver ldriver, int second) {
		driver.manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);
	}
	
	public static void explicitWait(int second) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(second));
	}

}
