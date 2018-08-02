package com.letzautomate.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {
	
	@Given("^the login page is displayed$")
	public void the_login_page_is_displayed()  {
	    System.out.println("the_login_page_is_displayed");
	}

	@When("^username \"([^\"]*)\" and password \"([^\"]*)\" is entered$")
	public void username_and_password_is_entered(String arg1, String arg2)  {
		System.out.println("username_and_password_is_entered");
	}

	@When("^OK button is clicked$")
	public void ok_button_is_clicked()  {
		System.out.println("ok_button_is_clicked");
	}

	@Then("^application takes the user to the dashboard page$")
	public void application_takes_the_user_to_the_dashboard_page()  {
		System.out.println("application_takes_the_user_to_the_dashboard_page");
	}


}
