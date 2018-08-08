package com.letzautomate.stepdefinitions;


import java.util.Map;



import com.letzautomate.globalstate.GlobalContext;
import com.letzautomate.pages.RegisterPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationSteps {
	
	GlobalContext globalContext;
	RegisterPage registerPage;
	
	public RegistrationSteps(GlobalContext globalContext){
		this.globalContext = globalContext;
		registerPage = globalContext.getPageObjectsManager().getRegisterPage();		
		
	}
	
	@Given("^Registration Page is available$")
	public void registration_Page_is_available()  {
	    // Write code here that turns the phrase above into concrete actions	
		registerPage.clickRegisterbutton();    
	}

	@When("^user enters following values$")
	public void user_enters_following_values(DataTable arg1)  {
	   
		Map<String, String> userData = arg1.asMap(String.class, String.class);
		registerPage.enterUserName(userData.get("username"));
		registerPage.enterPassword(userData.get("password"));
		registerPage.enterConfirmPassword(userData.get("confirmPassword"));
	   
	}

	@When("^click submit button$")
	public void click_submit_button()  {
	   registerPage.clickRegisterbutton();
	}

	@Then("^user registered successfully and a message is displayed$")
	public void user_registered_successfully_and_a_message_is_displayed()  {
	    System.out.println("Registered successfully");
	}

}
