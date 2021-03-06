package com.letzautomate.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.letzautomate.globalstate.GlobalContext;
import com.letzautomate.pages.HomePage;
import com.letzautomate.pages.RegisterPage;
import com.letzautomate.pages.SignOnPage;
import com.letzautomate.selenium.WebDriverManager1;

import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginSteps {
	
	GlobalContext globalContext;
	HomePage homePage;
	SignOnPage signOnPage;
	
	
	public LoginSteps(GlobalContext globalContext){
		this.globalContext = globalContext;	
		homePage = globalContext.getPageObjectsManager().getHomePage();
		signOnPage = globalContext.getPageObjectsManager().getsignOnPage();
				
	}
	
	@Given("^the login page is displayed$")
	public void the_login_page_is_displayed()  {	
		homePage.navigateToHomePage();		    
	}

	@When("^username \"([^\"]*)\" and password \"([^\"]*)\" is entered$")
	public void username_and_password_is_entered(String arg1, String arg2)  {
		System.out.println("username_and_password_is_entered");
		signOnPage.enterUserName(arg1);
		signOnPage.enterPassword(arg2);
	}

	@When("^OK button is clicked$")
	public void ok_button_is_clicked()  {
		System.out.println("ok_button_is_clicked");
		signOnPage.clickLoginImageButton();
		signOnPage.clickSignOffImage();
	}

	@Then("^application takes the user to the dashboard page$")
	public void application_takes_the_user_to_the_dashboard_page()  {
		System.out.println("application_takes_the_user_to_the_dashboard_page");
	}
	
	
	@When("^username \"([^\"]*)\" is entered$")
	public void username_is_entered(String arg1)  {
	    System.out.println(arg1 + " is entered ");
	   
	}

	@When("^password \"([^\"]*)\" is entered$")
	public void password_is_entered(String arg1){
	   System.out.println(arg1 + " is entered ");
	}

	@Then("^application throws an error which says wrong username and password$")
	public void application_throws_an_error_which_says_wrong_username_and_password()  {
	   
	}

	@Given("^Load Login Page$")
	public void load_Login_Page()  {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Before each scenario");
	}
	
	@Then("^following values are printed$")
	public void following_values_are_printed(DataTable userInformation) {
		
		List<List<String>> users = userInformation.raw();
		int numOfRows = users.size();
		
		for(int rowIndex=0; rowIndex < numOfRows; rowIndex++){
			
			int numOfColumns = users.get(rowIndex).size();
			for(int columnIndex = 0; columnIndex < numOfColumns; columnIndex++) {
				System.out.println(users.get(rowIndex).get(columnIndex));
			}
		}
		
	}
}
