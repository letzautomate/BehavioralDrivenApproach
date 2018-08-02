Feature:
	this is login feature
	
	Background:
		Given Load Login Page
	Scenario:
		Given the login page is displayed
		When username "rama" and password "krishna" is entered
		And OK button is clicked
		Then application takes the user to the dashboard page
		
	Scenario Outline: Login Fail different combinations
		Given the login page is displayed
		When username "<wrongusername>" is entered
		When password "<password>" is entered
		And OK button is clicked
		Then application throws an error which says wrong username and password
		
		Examples:	
		|wrongusername|password|
		|abcd|abcde|
		|abcd1|abcde|
		|abcd2|abcde|
		
	Scenario: check how the already existing stepdefinitions are used even when the content of a step is changed
		When username "rama" is entered
		When password "password" is entered
		
		Scenario: check how the already existing stepdefinitions are used even when the content of a step is changed
		When username "rama" is entered
		When password "password" is entered
	
	Scenario: printing registration values
		Then following values are printed	
		|firstName|lastName|middleName|age|
		|rama|krishna|noname|30|
		|abcd|1234|xyzx|40|
		|abcdef|12345|pqrst|50|
		