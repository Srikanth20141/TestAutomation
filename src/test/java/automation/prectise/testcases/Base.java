package automation.prectise.testcases;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import actionDrivers.Action;

import java.io.File;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import automation.prectise.utilites.ReadConfig;

public class Base {

	public static WebDriver driver;
	Logger log;
	
	ReadConfig readConfig;
	
	String br = "ch";
	@BeforeClass
	public void startBroweser(String br) {
		readConfig = new ReadConfig();
		log = Logger.getLogger("OrgangeHRM");
		PropertyConfigurator.configure("log4j.properties");

		if (br.equals("ch")) {
			log.info("=== Starting Chrome Browser ===");
			driver = new ChromeDriver();
		} else if (br.equals("fi")) {
			log.info("=== Starting Firefox Browser ===");
			driver = new FirefoxDriver();
		} else if (br.equals("in")) {
			log.info("=== Starting Internet Explorer Browser ===");
			driver = new InternetExplorerDriver();
		}
		driver.get(readConfig.getURL());
		driver.manage().window().maximize();
		Action.click(driver, null);
	}
	
//	public void captureScreen(WebDriver driver,String fname) {
//		log.info("=== Screenshot start ===");
//		TakesScreenshot ts = (TakesScreenshot)driver;
//		File source = ts.getScreenshotAs(OutputType.FILE);
//		File target = new File(System.getProperty("user.dir")+"/Screenshots/"+fname+".png");
//		try {
//			//FileUtils.copyFile(source, target);
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
//		// FileUtils.copyDirectory(source, dest);
//		log.info("Screenshot Capture");
//	}

	@AfterClass
	public void quit() {
		//driver.quit();
		log.info("=== Ending Browser ===");
	}
	

	
	public void setWait(int second) {
		driver.manage().timeouts().implicitlyWait(second,TimeUnit.SECONDS);
	}
	
	public void explicitWait() {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
	}

}
