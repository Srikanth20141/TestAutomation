package automation.prectise.utilites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;

	public ReadConfig() {
		File file = new File("./Configuration/config.properties");
		try {
			FileInputStream fis = new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		} catch (Exception e) {
			System.out.println("Exception "+e.getMessage());
		}	
	}
	
	public String getURL() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getUsername() {
		String userName = pro.getProperty("username");
		return userName;
	}
	
	public String getPassword() {
		String password = pro.getProperty("password");
		return password;
	}
	
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	}

}
