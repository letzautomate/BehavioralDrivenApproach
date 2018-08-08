package managers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.letzautomate.constants.SeleniumConstants;

public class WebDriverManager {
	
	private WebDriver driver;
	
	public WebDriver createInstance(){	
			System.setProperty(SeleniumConstants.CHROMEDRIVER_KEY, SeleniumConstants.chromeDriver);
			driver = new ChromeDriver();
			return driver;
	}
	
	public WebDriver getDriver(){
		if (driver == null) {
			driver = createInstance();
		}
		return driver;
		
	}

}
