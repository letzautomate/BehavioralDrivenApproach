package managers;

import org.openqa.selenium.WebDriver;

import com.letzautomate.pages.HomePage;
import com.letzautomate.pages.RegisterPage;
import com.letzautomate.pages.SignOnPage;

public class PageObjectsManager {
	
	private WebDriver driver;
	private HomePage homePage;
	private RegisterPage registerPage;
	private SignOnPage signOnPage;
	
	public PageObjectsManager(WebDriver driver){
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		if (homePage == null) {
			homePage = new HomePage(driver);
		}
		return homePage;
	}
	
	public RegisterPage getRegisterPage() {
		if (registerPage == null) {
			registerPage = new RegisterPage(driver);
		}
		return registerPage;
	}
	
	public SignOnPage getsignOnPage () {
		if (signOnPage == null) {
			signOnPage = new SignOnPage(driver);
		}
		return signOnPage;
	}

}
