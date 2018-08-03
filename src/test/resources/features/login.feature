Feature:
	this is login feature
	
	Background:
		Given Load Login Page
	Scenario:
		Given the login page is displayed
		When username "rjang" and password "rjang" is entered
		And OK button is clicked
		Then application takes the user to the dashboard page
		
	