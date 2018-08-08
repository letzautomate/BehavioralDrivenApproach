Feature: this feature tests registration feature of the application
	Scenario: Register With Valid values
		Given Registration Page is available
		When user enters following values
			|username|password|confirmPassword|
			|rama|krishna|krishna|
		And click submit button
		Then user registered successfully and a message is displayed